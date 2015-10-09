package com.opm.snds.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.eclipse.jetty.util.thread.Timeout.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opm.snds.app.buisness.AbstractProcess;
import com.opm.snds.app.buisness.TaskFactory;
import com.opm.snds.app.buisness.TaskOne;
import com.opm.snds.app.buisness.TaskTow;
import com.opm.snds.app.dao.IPadressDAO;
import com.opm.snds.app.dao.ServerDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;

/**
 * Handles requests for the application home page.
 */
@Controller("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired 
	ServerDAO srv;
	@Autowired 
	IPadressDAO ipdao;
	@Autowired
	TaskFactory AllTasks; 
	
	@Autowired
	TaskOne T1;
	@Autowired
	TaskTow T2;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mv = new  ModelAndView("home/index");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		/**
		 * here the work begins 
		 **/
		T1.setId(1);
		T2.setId(2);
		AllTasks.NewTask("task1", T1);
		AllTasks.NewTask("task2", T2);
		
		return mv;
	}
	
	@RequestMapping(value="/index", method =  RequestMethod.GET)
	public ModelAndView save(){
		
		ModelAndView mv = new  ModelAndView("home/index");
		mv.addObject("task1",AllTasks.GetTask("task1").getId());
		mv.addObject("task2",AllTasks.GetTask("task2").getId());
		
		return mv;
	}
	
	@RequestMapping(value="/get", method =  RequestMethod.GET, params = "search")
	public String get(Model model, @RequestParam(value = "search") String search){
		
		Server MyServer = srv.getServerByName(search);
		if(MyServer!= null){
			
			Set<IPAdress> listIPs = new HashSet<IPAdress>();
			listIPs.add(ipdao.getIPAdressByIP("162.251.166.194"));
			
			MyServer.setChilds(listIPs);
			srv.UpdateServer(MyServer);
			//this.srv.getServersIPs(search);
			model.addAttribute("serverTime", MyServer.getDomain() +" - "+MyServer.getName());
		}
		else{ 
			model.addAttribute("serverTime", "null");
		}
		
		return "home/index";
	}
	
	
	
}
