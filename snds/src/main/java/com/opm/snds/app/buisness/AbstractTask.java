package com.opm.snds.app.buisness;

import java.util.Date;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public abstract class AbstractTask extends Thread  implements TaskInterface{
	
	long id;
	String Taskname;
	Date StartDate;
	Date EndDate;
	String Status;
	Date TimeMax;
	
	/**
	 * Constructors
	 **/
	public AbstractTask(){}
	
	public AbstractTask(long _id,String name, Date _start, Date _end, String _status, Date _timeMax){
		
		id 			= _id;
		Taskname	= name;
		StartDate 	= _start;
		EndDate		= _end;
		Status 		= _status;
		TimeMax 	= _timeMax;
	}
	
	/** Setters & Getters **/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getTaskname() {
		return Taskname;
	}

	public void setTaskname(String taskname) {
		Taskname = taskname;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getTimeMax() {
		return TimeMax;
	}

	public void setTimeMax(Date timeMax) {
		TimeMax = timeMax;
	}
	
	/***********************/
	
	@Override
	public void run(){
		Status =  "Run";
	}
	
	@Override
	public void Start(){
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
		System.out.println("Killing 	task "+id+" bye!!");
	}
}
