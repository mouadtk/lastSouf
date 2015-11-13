package com.opm.snds.app.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opm.snds.app.dao.SNDS.UserSNDSDAO;
import com.opm.snds.app.dao.Server.IPadressDAO;
import com.opm.snds.app.dao.Server.ServerDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;
import com.opm.snds.app.model.UserSNDS;

@Service("ServerService")
@Transactional
public class ServerServiceImpl implements ServerService {

	@Autowired
	ServerDAO srv;
	@Autowired
	IPadressDAO ip;
	@Autowired
	UserSNDSDAO user;
	
	@Override
	public Map<String, Server> LoadServers(String SrcFilePath, Map<String, Server> MyServers) throws IOException{
		UserSNDS _user = user.getUSerByLogin("euni84forrest71444@hotmail.com");
		try {
			FileInputStream file = new FileInputStream(new File(SrcFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(file); // Create Workbook instance holding reference to .xlsx file
			XSSFSheet sheet = workbook.getSheetAt(0); 		// Get first/desired sheet  from the workbook
			Iterator<Row> rowIterator = sheet.iterator(); 	// Iterate through each rows one by one
			rowIterator.next();
			while (rowIterator.hasNext()) {
				/**
				 * Read an excel row 
				 **/
				Row row = rowIterator.next();
				if( row.getCell(0).toString()== "") break; // stop loo if the next cell empty
				String provider	= row.getCell(1) != null  ? row.getCell(1).toString() : "";
				String name    	= row.getCell(2) != null  ? row.getCell(2).toString() : "";
				String blok	   	= row.getCell(3) != null  ? row.getCell(3).toString() : "";
				String domain  	= row.getCell(4) != null  ? row.getCell(4).toString() : "";
				String ip 	   	= row.getCell(5) != null  ? row.getCell(5).toString() : "";
				String rdns    	= row.getCell(6) != null  ? row.getCell(6).toString() : "";
				String Registrar= row.getCell(7) != null  ? row.getCell(7).toString() : "";
				String DateIn  	= row.getCell(8) != null  ? row.getCell(8).toString() : "";
				/**
				 * Instantiate Objects
				 **/
				
				Server _srv 	= null;//new Server(name, ip, domain);
				/**
				 * Check if IP already exists in Database
				 **/
				if( this.ip.getIPAdressByIP(ip) == null ){
					
					IPAdress _ip 	= new IPAdress( ip, domain, null, null, "new");
					/**
					 * Fill the Map & Database
					 **/
					if(!MyServers.containsKey(name)){
						
						_srv = this.srv.getServerByName(name); 						// get. if server already exist in DB
						if( _srv == null){											// if not exists
								_srv = new Server(name, ip, domain);
								this.srv.AddServer(_srv);							// persist in DB if not
						}
						MyServers.put(name,_srv);									// add new server
						_ip.setParent(_srv);
						this.ip.AddIPAdress(_ip);						
					} else {
						_ip.setParent(MyServers.get(name));
						this.ip.AddIPAdress(_ip);
					}
				}
				
			}
			
			/**
			 * Refresh Servers Objects and get there IPs 
			 * */
			for (Map.Entry<String, Server> entry : MyServers.entrySet())
			{
				try{
					this.srv.getSessionFactory().getCurrentSession().refresh(entry.getValue());
			    	Hibernate.initialize(entry.getValue().getChilds());
			    }catch(Exception e){
			    	System.out.println("-->"+e.getMessage());
			    }
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		return MyServers;
	}

	@Override
	public boolean CheckRDNS(IPAdress ip) {
		// TODO Auto-generated method stub
		return false;
	}

}