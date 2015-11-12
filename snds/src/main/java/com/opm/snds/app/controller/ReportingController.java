package com.opm.snds.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opm.snds.app.dao.Server.IPadressDAO;
import com.opm.snds.app.dao.Server.ServerDAO;
import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/Reports")
@Secured({"ROLE_ADMIN"})
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
		List<Server> _SRV =  srv.getAllServersFull();
		int i = 0;
		for (Server sv : _SRV) {
			if(i==20) break;
			i++;
			for(IPAdress ip  : sv.getChilds()){
				System.out.println( "child  : " + ip.getIP());
			}
		}
		mv.addObject("Servers", _SRV);
		return mv;
	}
	
	/**
	 * destails de serveur + les ips*/
	@Secured({"ROLE_ADMIN", "ROLE_MAILER"})
	@RequestMapping(value= "/ServerDetails", method = RequestMethod.GET, params = "id")
	public ModelAndView ServerDetails(@RequestParam(value = "id") String ID_SERV){
		
		ModelAndView mv = new ModelAndView("reports/ServerDetails");		
		mv.addObject("Server", ID_SERV);
		return mv;
	}
	
}