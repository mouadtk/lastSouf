package com.opm.snds.app.dao;

import java.util.List;
import java.util.Set;

import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;

public interface IPadressDAO {
	
	public Integer AddIPAdress(IPAdress MyIPAdress);
	public boolean UpdateIPAdress(IPAdress O);
	public List<IPAdress> getAllIPAdresses();
	public IPAdress getIPAdressByIP(String ip);
	
	public List<IPAdress> getServersIPs(Server srv);
}
