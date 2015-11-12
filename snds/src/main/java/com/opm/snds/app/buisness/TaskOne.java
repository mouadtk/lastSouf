package com.opm.snds.app.buisness;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.opm.snds.app.buisness.taskFactory.AbstractTask;

@Service
@Scope("prototype")
public class TaskOne extends AbstractTask{
	
	String LinkA;
	
	
	public TaskOne(){
		super();
		LinkA =  "link 2 B";
	}

	public TaskOne(long _id, String name, Date _start, Date _end, String _status, Date _timeMax) {
		super(_id, name, _start, _end, _status, _timeMax);
		LinkA =  "link 2 B";
	}

	@Override 
	public void run(){}
	
	@Override
	public void Launch() {
		run();
	}

	@Override
	public void Pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShutDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Resume() {
		// TODO Auto-generated method stub
		
	}

	
}