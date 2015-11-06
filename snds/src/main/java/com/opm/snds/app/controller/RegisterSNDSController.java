package com.opm.snds.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.opm.snds.app.Service.ServerService;
import com.opm.snds.app.buisness.RegisterSNDS;
import com.opm.snds.app.buisness.ProcessSNDS;
import com.opm.snds.app.dao.IPadressDAO;
import com.opm.snds.app.dao.ServerDAO;
import com.opm.snds.app.model.Server;
import com.opm.snds.app.model.UserAccount;

@Controller
@RequestMapping("/Register")
@Scope("prototype")
@PropertySource(value = { "classpath:application.properties" })
public class RegisterSNDSController {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RegisterSNDSController.class);
	@Autowired
    private Environment environment;
	
	@Autowired 
	ServerDAO DAO_Server;
	@Autowired 
	IPadressDAO DAO_IP;	
	@Autowired
	ServerService S_Server;
	@Autowired	
	RegisterSNDS  Reg_SNDS;
	@Autowired
	ProcessSNDS Proce_SNDS;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 **/
	@Secured({"MAILER","MAILER"})
	@RequestMapping(value = {"/", "", "/RegisterForm"}, method = RequestMethod.GET)
	public ModelAndView home(){
		
		ModelAndView mv = new ModelAndView("register/form");
		try{
			/***
			 * User Accounts that'll be used
			 **/
			UserAccount usr = new UserAccount();
			usr.setLogin("buskard97ba58084@hotmail.com");
			usr.setPasswd("p4EZBVzwZKtb");
			List<UserAccount> Users =  new ArrayList<UserAccount>();
			Users.add(usr);
			/**
			 * Load And Persist Servers(With IPs) in Database
			 **/
			Map<String, Server> MyServers = new HashMap<String, Server>();
			String SrouceFile = environment.getRequiredProperty("ServersFileSrc");
			System.out.println("file path :"+SrouceFile);
			MyServers = S_Server.LoadServers(SrouceFile, MyServers);
			List<Server> Servers =  new ArrayList<Server>(MyServers.values());
			/**
			 * Process SNDS khaddama
			 **/
			Reg_SNDS.set_SERVERS( Servers );
			Reg_SNDS.set_USER(Users);
			//this.ProcessSNDS.doSNDS("tole", Reg_SNDS);
			
		}catch(Exception e){
			mv.addObject("message",e.getMessage());
			return mv;
		}
		return  mv;
	}
	
	@RequestMapping( value = {"/doRegister"}, method = RequestMethod.GET )
	public ModelAndView doRegister(){
		
		ModelAndView mv = new ModelAndView("register/form");
		mv.addObject("message",Reg_SNDS.get_USER() != null ? Reg_SNDS.get_USER().get(0).getLogin() : 0 );
		return  mv;
	}
	
	/***
	 * @param id: Server ID
	 * @return dont know yet
	 ***/
	@RequestMapping(value = "/doRegistration", method = RequestMethod.GET)
	public @ResponseBody String doRegistration(@RequestParam("name") String name){
		
		Server _SRV = DAO_Server.getServerByName(name);
		
		return  "";
	}
}
