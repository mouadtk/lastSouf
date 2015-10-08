package com.opm.snds.app.Service;

import java.io.IOException;
import java.util.Map;

import com.opm.snds.app.model.IPAdress;
import com.opm.snds.app.model.Server;

public interface ServerService {

	
	public Map<String, Server> LoadServers(String SrcFilePath, Map<String, Server> MyServers) throws IOException;
	public boolean CheckRDNS(IPAdress ip);
	
}
