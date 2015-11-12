package com.opm.snds.app.controller;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opm.snds.app.buisness.snds.RegisterSNDS;
import com.opm.snds.app.buisness.taskFactory.TaskFactory;
import com.opm.snds.app.buisness.taskFactory.TaskNames;
import com.opm.snds.app.dao.ComcastDlistingDAO;
import com.opm.snds.app.dao.OperationDAO;
import com.opm.snds.app.dao.SNDS.SNDSDAO;
import com.opm.snds.app.dao.Server.IPadressDAO;
import com.opm.snds.app.dao.Server.ServerDAO;
import com.opm.snds.app.model.ComcastDlisting;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Operation;
import com.opm.snds.app.model.SNDS;
import com.opm.snds.app.model.Server;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = { "/home"})
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired 
	ServerDAO srv;
	@Autowired 
	IPadressDAO ipdao;
	@Autowired
	TaskFactory AllTasks; 
	@Autowired
	SNDSDAO snds;
	@Autowired
	ComcastDlistingDAO  cocmastDAO;
	
	@Autowired
	OperationDAO<Operation> operationDAO;
	
	@RequestMapping(value={"/index","/", ""}, method = RequestMethod.GET)
	public ModelAndView index(Principal user){
		
		/** saving snds **/
		SNDS a = new SNDS();
		a.setStatus("processing");
		snds.AddSNDS(a);
		/** sanving dlisting comcast **/
		ComcastDlisting comcast = new ComcastDlisting();
		comcast.setReference("ddfsqf");
		comcast.setTatatat("sqdsdfsdf");
		cocmastDAO.AddComcastDlisting(comcast);

		List<Operation> ops = operationDAO.getSNDSOperation();
		for(Operation op : ops){
			if(op instanceof SNDS)
				System.out.println("SNDS  : "+ (((SNDS)op)));
//			if(op instanceof ComcastDlisting)
//				System.out.println("Comcast  : "+ (((ComcastDlisting)op).getTatatat()));
		}
			
		System.out.println(TaskNames.IPOwner);
		ModelAndView mv =  new ModelAndView("/home/home");
		mv.addObject("user", user.getName());
		return mv;
	}
	
	@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model,@RequestParam(value = "TaskKey") String key) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mv = new  ModelAndView("home/home");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		/**
		 * here the work begins
		TaskOne  t1 = (TaskOne) AllTasks.CeateTask(TaskNames.TaskOne);
		TaskTwo  t2 = (TaskTwo) AllTasks.CeateTask(TaskNames.TaskTwo);
		t1.setId(1);
		t2.setId(2);
		AllTasks.AddNewTask("1", t1);
		AllTasks.AddNewTask("2", t2);
		mv.addObject("task1","eeeeeeee");
		mv.addObject("task2",AllTasks.GetTask("2").getId());
		/**/
		return mv;
	}
	
	@RequestMapping(value="/AddTask", method =  RequestMethod.GET)
	public ModelAndView AddTask( @RequestParam(value = "TaskKey") String key){
		
		/**
		 * return the id Task, if exists
		 * return the count of taks in present
		 **/
		ModelAndView mv = new  ModelAndView("home/index");
		RegisterSNDS  t1 = (RegisterSNDS) AllTasks.CeateTask(TaskNames.SNDS);
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
			model.addAttribute("serverTime", MyServer.getDomain() +" - "+ MyServer.getName());
		}
		else{
			model.addAttribute("serverTime", "null");
		}
		
		return "home/index";
	}
	
}
