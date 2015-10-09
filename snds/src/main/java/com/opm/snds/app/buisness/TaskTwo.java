package com.opm.snds.app.buisness;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

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

}