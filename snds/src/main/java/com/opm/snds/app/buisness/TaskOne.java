package com.opm.snds.app.buisness;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TaskOne extends AbstractTask{
	
	String LinkA;
	
	
	public TaskOne(){
		super();
		LinkA =  "link 2 B";
	}

	public TaskOne(long _id, Date _start, Date _end, String _status, Date _timeMax) {
		super(_id,_start, _end, _status, _timeMax);
		LinkA =  "link 2 B";
	}

	/**
	 * Specific 
	 **/
}