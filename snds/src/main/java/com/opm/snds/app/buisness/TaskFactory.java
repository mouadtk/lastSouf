package com.opm.snds.app.buisness;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.util.thread.Timeout.Task;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class TaskFactory {
	
	Map<String, AbstractProcess> Tasks = new HashMap<String, AbstractProcess>();
	
	public void NewTask(String key, AbstractProcess value){
		Tasks.put(key, value);
	}
	
	public AbstractProcess GetTask(String key) {
			return Tasks.get(key);
	}
	
	public boolean PauseTask(String key){
		Tasks.get(key).Stop();
		return true;
	}
}
