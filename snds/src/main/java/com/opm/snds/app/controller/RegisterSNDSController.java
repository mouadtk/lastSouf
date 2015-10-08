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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	ServerDAO srv;
	@Autowired 
	IPadressDAO ipdao;
	@Autowired
	ServerService S_Server;
	@Autowired	
	RegisterSNDS  RegSNDS;
	@Autowired
	ProcessSNDS ProcessSNDS;
	/**
	 * Simply selects the home view to render by returning its name.
	 **/
	@RequestMapping(value = {"/", "", "/RegisterForm"}, method = RequestMethod.GET)
	public ModelAndView home() {
		
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
			MyServers = S_Server.LoadServers(SrouceFile, MyServers);
			List<Server> Servers =  new ArrayList<Server>(MyServers.values());
			/**
			 * Process SNDS khaddama
			 **/
			RegSNDS.set_SERVERS( Servers );
			RegSNDS.set_USER(Users);
			//this.ProcessSNDS.doSNDS("tole", RegSNDS);
			
		}catch(Exception e){
			mv.addObject("message",e.getMessage());
			return mv;
			
		}
		
		return  mv;
	
	}
	
	@RequestMapping( value = {"/doRegister"}, method = RequestMethod.GET )
	public ModelAndView doRegister(){
		
		ModelAndView mv = new ModelAndView("register/form");
		mv.addObject("message",RegSNDS.get_USER() != null ? RegSNDS.get_USER().get(0).getLogin() : 0 );
		return  mv;
	}
	
 	@RequestMapping(value = {"/doRegister1"}, method = RequestMethod.GET)
	public ModelAndView doRegister1(){
		
		ModelAndView mv = new ModelAndView("register/form");
		mv.addObject("message",RegSNDS.get_USER() != null ? RegSNDS.get_USER().get(0).getLogin() : 0 );
		return  mv;
	}
}
