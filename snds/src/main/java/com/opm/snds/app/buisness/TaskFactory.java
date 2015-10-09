package com.opm.snds.app.buisness;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.util.thread.Timeout.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.thoughtworks.selenium.webdriven.commands.CreateCookie;

@Service
@Scope("singleton")
public class TaskFactory {
	
	@Autowired
	TaskOne T1;
	@Autowired
	TaskTwo T2;
	@Autowired 
	RegisterSNDS SNDS;
	
	Map<String, AbstractTask> Tasks = new HashMap<String, AbstractTask>();
	
	public Map<String, AbstractTask> getTasks(){
		return this.Tasks;
	} 
	
	/***
	 * @param key     :  Unique key identifiying the task
	 * @param value   :  Task object
	 * @return 'true' :  The task has been added successfully
	 * @return 'false':  The key already exists or some problem in adding task to map
	 */
	public boolean AddNewTask(String key, AbstractTask value){
		System.out.println("Adding task to map...");
		//if(!Tasks.containsKey(key))
		if(Tasks.put(key, value)!= null) return true;
		return false;
	}
	
	public AbstractTask GetTask(String key) {
			return Tasks.get(key);
	}
	
	public boolean PauseTask(String key){
		Tasks.get(key).Stop();
		return true;
	}

	public AbstractTask CeateTask(String key){
		switch (key) {
		case "Task1": return new TaskOne(); 
		case "Task2": return new TaskTwo(); 
		case "SNDS" : return SNDS; 
		default: return null;
		}
		
		
	}
	
}