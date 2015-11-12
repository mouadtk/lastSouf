package com.opm.snds.app.buisness;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.opm.snds.app.buisness.taskFactory.AbstractTask;

@Service
@Scope("prototype")
public class TaskTwo extends AbstractTask{
	
	String LinkB;
	
	public TaskTwo(){
		super();
		LinkB =  "link 2 B";
	}

	public TaskTwo(long _id, String name, Date _start, Date _end, String _status, Date _timeMax) {
		super(_id, name,_start, _end, _status, _timeMax);
		LinkB =  "link 2 B";
	}
	
	@Override
	public void run(){
		Status =  "Run";
	}
	
	@Override
	public void Launch(){
		System.out.println("launching 	task "+id+" ...");
	}
	
	@Override
	public void ShutDown(){
		Status =  "Stop";
		System.out.println("Stoping 	task "+id+" ...");
	}
	
	@Override
	public void Resume(){
		Status =  "Run";
		System.out.println("Resuming 	task "+id+" ...");
	}
	
	@Override
	public void Pause(){ 
		Status =  "On Hold";
		System.out.println("Killing 	task "+id+" bye!!");
	}
}