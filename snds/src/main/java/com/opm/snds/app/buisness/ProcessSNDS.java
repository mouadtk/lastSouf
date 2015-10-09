package com.opm.snds.app.buisness;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class ProcessSNDS {
	
	/**
	 *Map <Key, SNDSProcess>
	 **/
	
	static public Map<String, RegisterSNDS> SNDSProcess =  new HashMap<String, RegisterSNDS>();
	
	static public void doSNDS(String key ,RegisterSNDS _SNDS) {
		/***/
			try{
				
				ExecutorService taskExecutor = Executors.newSingleThreadExecutor();
		        taskExecutor.execute(_SNDS);
				taskExecutor.shutdown();
				taskExecutor.awaitTermination(0, TimeUnit.SECONDS);
				taskExecutor.
	        }catch (Exception e){
	        	 e.printStackTrace();
	        }
			SNDSProcess.put(key, _SNDS);
	}
	
}