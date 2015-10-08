package com.opm.snds.app.buisness;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.util.thread.Timeout.Task;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class TaskFactory {
	
	Map<String, AbstractTask> Tasks = new HashMap<String, AbstractTask>();
	
	public void NewTask(String key, AbstractTask value){
		Tasks.put(key, value);
	}
	
	public AbstractTask GetTask(String key) {
			return Tasks.get(key);
	}
	
	public boolean PauseTask(String key){
		Tasks.get(key).Stop();
		return true;
	}
}
