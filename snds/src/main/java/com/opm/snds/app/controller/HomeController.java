package com.opm.snds.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
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

import com.opm.snds.app.buisness.AbstractTask;
import com.opm.snds.app.buisness.RegisterSNDS;
import com.opm.snds.app.buisness.TaskFactory;
import com.opm.snds.app.buisness.TaskOne;
import com.opm.snds.app.buisness.TaskTwo;
import com.opm.snds.app.dao.IPadressDAO;
import com.opm.snds.app.dao.ServerDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = { "/", "" })
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired 
	ServerDAO srv;
	@Autowired 
	IPadressDAO ipdao;
	@Autowired
	TaskFactory AllTasks; 
	
	
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model,@RequestParam(value = "TaskKey") String key) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mv = new  ModelAndView("home/home");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		/**
		 * here the work begins	
		TaskOne  t1 = (TaskOne) AllTasks.CeateTask("Task1");
		TaskTwo  t2 = (TaskTwo) AllTasks.CeateTask("Task2");
		t1.setId(1);
		t2.setId(2);
		AllTasks.AddNewTask("1", t1);
		AllTasks.AddNewTask("2", t2);
		mv.addObject("task1","eeeeeeee");
		mv.addObject("task2",AllTasks.GetTask("2").getId());
		*/
		return mv;
	}
	
	@RequestMapping(value="/AddTask", method =  RequestMethod.GET)
	public ModelAndView index( @RequestParam(value = "TaskKey") String key){
		
		/**
		 * return the id Task, if exists
		 * return the count of taks in present
		 **/
		ModelAndView mv = new  ModelAndView("home/index");
		RegisterSNDS  t1 = (RegisterSNDS) AllTasks.CeateTask("SNDS");
		t1.setId(new Random().nextInt());
		t1.setTaskname(key);
		
		AllTasks.AddNewTask(key, t1);
		mv.addObject("task",AllTasks.GetTask(key).getId());
		mv.addObject("count",AllTasks.getTasks().size());
		return mv;
	}
	
	@RequestMapping(value="/TaskCount", method =  RequestMethod.GET)
	public ModelAndView Count(){
		/**
		 * return the count of current taks
		 **/
		ModelAndView mv = new  ModelAndView("home/TaskList");
		mv.addObject("count",AllTasks.getTasks().size());
		mv.addObject("tasks",AllTasks.getTasks());
		
		return mv;
	}
	
	@RequestMapping(value="/RunTask", method = RequestMethod.GET)
	public ModelAndView TaskDetails( @RequestParam(value = "TaskKey") String key){
		
		ModelAndView mv = new  ModelAndView("home/TaskDetails");
		AllTasks.GetTask(key).run();
		mv.addObject("task" , AllTasks.GetTask(key));
		mv.addObject("count", AllTasks.getTasks().size());
		
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**********************************************************************************************************/
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
