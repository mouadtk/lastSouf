package com.opm.snds.app.controller;

import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opm.snds.app.dao.IPadressDAO;
import com.opm.snds.app.dao.ServerDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/Reports")
public class ReportingController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReportingController.class);
	
	@Autowired 
	ServerDAO srv;
	@Autowired 
	IPadressDAO ipdao;
	
	/**
	 * 
	 */
	@RequestMapping(value = {"/", "/Servers"}, method = RequestMethod.GET)
	public ModelAndView home() {
		

		ModelAndView mv = new ModelAndView("reports/index");
		List<Server> _SRV = srv.getAllServersFull();
		for (Server sv : _SRV) {
			System.out.println(sv.getName());
			for(IPAdress ip  : sv.getChilds()){
				System.out.println( "child  : " + ip.getIP());
			}
		}
		mv.addObject("Servers", _SRV);
		return mv;
	}
	
	/**
	 * destails de serveur + les ips
	 */
	@RequestMapping(value= "/ServerDetails", method = RequestMethod.GET, params = "id")
	public ModelAndView ServerDetails(@RequestParam(value = "id") String ID_SERV){
		
		ModelAndView mv = new ModelAndView("reports/ServerDetails");
		
		mv.addObject("Server", ID_SERV);
		return mv;
	}
	
}