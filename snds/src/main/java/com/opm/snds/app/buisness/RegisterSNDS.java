package com.opm.snds.app.buisness;

import java.io.File;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.common.collect.ImmutableMap;
import com.opm.snds.app.dao.IPadressDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;
import com.opm.snds.app.model.UserAccount;

@Service
@Scope("prototype")
public class RegisterSNDS extends AbstractTask {

	/**
	 * 
	 */
	
	public static String _URL_Login 			= "https://www.outlook.com";
	public static String _Request_Acess 		= "https://postmaster.live.com/snds/addnetwork.aspx";
	public static String _Automate_Acess 		= "https://postmaster.live.com/snds/auto.aspx";
	public static String _Postmaster_Link 		= "apps1.web.nrb-apps.com/apps/feedback_loop/fbl.php";
	public static String _EditProfile_Link		= "https://postmaster.live.com/snds/pref.aspx";
	
	private WebDriver driver;
	private List<Server> _SERVERS;
	private List<UserAccount>  _USER;

	private String postmasterUsername = "tribak.mouad";
	private String postmasterPassword = "4A66T6vfWKxs";
	
	@Autowired
	IPadressDAO ipDOA;
	
	public RegisterSNDS(){}
	
	public RegisterSNDS(List<UserAccount> acct, List<Server> srv) {
		
		_SERVERS =  srv;
		_USER 	 =  acct;
	}
	
	public String checkRDNS(IPAdress ip){
		InetAddress addr;
		try {
			addr = InetAddress.getByName(ip.getIP());
			String host = addr.getCanonicalHostName();
			System.out.println(host+ " " + ip.getParent().getDomain() + " " +ip.getDomain());
			if( host.equals(ip.getParent().getDomain()) )
				return host;
			if( host.equals(ip.getDomain()) )
				return host;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	} 
	
	public void EditProfile(UserAccount usr){
		try{
			driver.get(_EditProfile_Link);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[id*='firstName']")).sendKeys("opmUser");
			driver.findElement(By.cssSelector("input[id*='lastName']")).sendKeys("opmUser");
			driver.findElement(By.cssSelector("input[type=submit]")).click();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	private void launchDriver() {
		/**
		 * launch the browser.
		 **/
		try {
			ChromeDriverService service = new ChromeDriverService.Builder()
					.usingDriverExecutable(
							new File("C:/Users/Mailer/Desktop/snds/src/main/resources/chromedriver.exe"))
					.usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", ":0.0")).build();
			driver = new ChromeDriver(service);
			driver.get(_URL_Login);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
		
	private boolean Login(String email, String passwd) {
		
		/**
		 * Login
		 */
		try {
			/** fill the login form & submit */
			WebElement Email = driver.findElement(By.name("loginfmt"));
			Email.sendKeys(email);
			WebElement Passwd = driver.findElement(By.name("passwd"));
			Passwd.sendKeys(passwd);
			WebElement submit = driver.findElement(By.name("SI"));
			submit.submit();
			Thread.sleep(500);
			/** check for the cookie WLSSC to see if already connected */
			return driver.manage().getCookieNamed("WLSSC") != null;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	private boolean RequestAccess(IPAdress ip) {
				
		driver.get(_Request_Acess);
		WebElement postmaster = null;
		/**
		 * Fill form 1 & submit
		 **/ 
		WebElement input = driver.findElement(By.cssSelector("input[type=text]"));
		input.clear();
		input.sendKeys(ip.getIP());
		
		/**
		 * Send request
		 * */
		try{
			Thread.sleep(2500);
			WebElement submit  = driver.findElement(By.cssSelector("input[id*=submit]"));
			System.out.println("submit id :"+submit.getAttribute("Value"));
			submit.click();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		/**
		 * Check postmaster mail & submit
		 **/
		
		try{
			Thread.sleep(15000);
			List<WebElement> MailRadio = driver.findElements(By.cssSelector("input[id*=RadioButtonList1]"));
			System.out.println(MailRadio.size());
			for (WebElement Elmt : MailRadio) {
				System.out.println(Elmt.getAttribute("value").trim()+"  "+ip.getParent().getDomain());
				if (Elmt.getAttribute("value").trim().equals("postmaster@" + ip.getParent().getDomain())) {
					postmaster = Elmt;
					break;
				}
			}
			System.out.println("postmaster text :"+postmaster.getCssValue("id"));
			/***/
			if (postmaster == null){
				driver.quit();
				return false; // !rDNS
			}
			
			ip.setMailBox(postmaster.getAttribute("value")); // save mail adress
			postmaster.click(); 						    // check postmaster
			driver.findElement(By.cssSelector("input[type=submit]")).click();
			Thread.sleep(2000);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	private String getActivationLink(IPAdress ip) {
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		WebElement body = driver.findElement(By.cssSelector("body"));
        body.sendKeys(selectLinkOpeninNewTab);
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabs.size()-1));
		
		/**
		 * Check if it asks for firt & last name 
		 **/
		try{
			driver.findElement(By.cssSelector("input[id*='firstName']")).sendKeys("opmUser");
			driver.findElement(By.cssSelector("input[id*='lastName']")).sendKeys("opmUser");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("3aaadi kmel dilmok");
		}
		System.out.println("mkmlin");
		/**
		 * Double Authentication
		 * */
		
		driver.get("http://" + postmasterUsername + ":" + postmasterPassword + "@" + _Postmaster_Link);
		driver.findElement(By.cssSelector("input[name=log]")).clear();
		driver.findElement(By.cssSelector("input[name=log]")).sendKeys(postmasterUsername);
		driver.findElement(By.cssSelector("input[name=pass]")).clear();
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys(postmasterPassword);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		/**
		 * get Postmaster mail based on Server Principale domain name.
		 **/
		try{
			new Select(driver.findElement(By.cssSelector("select[name=server]"))).selectByVisibleText(ip.getParent().getName());
		}catch(Exception e){
			if(e.getMessage().contains("Cannot locate element with text: ")){
				return "no server name";
			}
		}
		new Select(driver.findElement(By.cssSelector("select[name=acct]"))).selectByVisibleText("Postmaster");
		driver.findElement(By.cssSelector("input[id=fbl_hotmail]")).click();
		driver.findElement(By.cssSelector("input[name=nbMsgs]")).clear();
		driver.findElement(By.cssSelector("input[name=nbMsgs]")).sendKeys("1");
		driver.findElement(By.cssSelector("input[id=links_only_yes]")).click();
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		
		/**
		 * Read Microsoft SNDS message 
		 **/
		driver.switchTo().frame("output_container");
		return driver.findElements(By.cssSelector("body")).get(0).getText();
	}

	/***
	 * @param _IP
	 * @param user
	 * @return
	 **/
	public boolean doRegisterSNDS( IPAdress _IP, UserAccount user){
		
		launchDriver();
		if(!Login(user.getLogin(),user.getPasswd()))
			return false;
		/**
		 * loop over servers, register an snds account each. 
		 */
		try{
			String  link = null;
			if(this.RequestAccess(_IP)){
				link = this.getActivationLink(_IP);
				/** click activation link in postmaster@serverDomain.tld */
				if(link.contains("https://postmaster.live.com/snds/auth.aspx?id")){
					this.driver.get(link);
					Thread.sleep(1000);
					return true;
				}
			}else{
				try{
					driver.quit();
				}catch(Exception e){}
				return false;
			}
			return false;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * @return Number of SNDS IPs registered successfuly
	 **/
	public int ProcessSNDSList(){
		
		int i = 0, count = 0, userIndex = 0;
		/**
		 * loop over Server List
		 */
		for (Server _SRV  : _SERVERS) {
			/**
			 * for each ServerIP, do a Registry
			 **/
			userIndex = (int) Math.floor( count / 20 );
			i = userIndex % _USER.size();
			for(IPAdress _IP : _SRV.getChilds()){
				System.out.println("i: "+i);
				count++;
				_IP.setState("SNDS");
				
				if(null == checkRDNS(_IP)){
					if(doRegisterSNDS(_IP, _USER.get(i))){
						System.out.println(_IP.getIP());
						try{
							ipDOA.UpdateIPAdress(_IP);
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				}else{
					System.out.println(_IP.getDomain()+" "+_IP.getIP()+" rDNS problem"); 
				}
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) throws Exception {
//
//		IPAdress ip = new IPAdress();
//		ip.setIP("68.233.227.35");
//		ip.setDomain("bivse.developersture.com");
//		Server srv =  new Server();	
//		srv.setDomain("developersture.com");
//		srv.setName("ssv999");		
//		ip.setParent(srv);			
//		
//		UserAccount usr = new UserAccount();
//		usr.setLogin("euni84forrest71444@hotmail.com");
//		usr.setPasswd("3hkk6vIahcbB");
//		 /**
//		  *	L9issa lkamila.		
//		  **/						
//		RegisterSNDS snds = new RegisterSNDS();
//		snds.doRegisterSNDS(ip,usr);
		
		
		
		/***
		rDNS 
		InetAddress addr = InetAddress.getByName("74.208.132.131");
		String host = addr.getCanonicalHostName();
		System.out.println(host);
		***/
	}
	
	public IPadressDAO getIpDOA() {
		return ipDOA;
	}
	
	
	public void setIpDOA(IPadressDAO ipDOA) {
		this.ipDOA = ipDOA;
	}

	public List<Server> get_SERVERS() {
		return _SERVERS;
	}

	public void set_SERVERS(List<Server> _SERVERS) {
		this._SERVERS = _SERVERS;
	}

	public List<UserAccount> get_USER() {
		return _USER;
	}

	public void set_USER(List<UserAccount> _USER) {
		this._USER = _USER;
	}


	@Override
	public void run(){
		try{
			System.out.println("bdina...");
			int a = ProcessSNDSList();
			System.out.println("SNDS Final Res. :"+a);
			System.out.println("salina...");
		} catch (Exception e) {
			e.printStackTrace();
			if(driver!=null)
				driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getPostmasterUsername() {
		return postmasterUsername;
	}

	public void setPostmasterUsername(String postmasterUsername) {
		this.postmasterUsername = postmasterUsername;
	}

	public String getPostmasterPassword() {
		return postmasterPassword;
	}

	public void setPostmasterPassword(String postmasterPassword) {
		this.postmasterPassword = postmasterPassword;
	}

}