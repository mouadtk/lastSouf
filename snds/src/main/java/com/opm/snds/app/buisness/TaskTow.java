package com.opm.snds.app.buisness;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TaskTow extends AbstractTask{
	
	String LinkB;
	
	public TaskTow(){
		super();
		LinkB =  "link 2 B";
	}

	public TaskTow(long _id, Date _start, Date _end, String _status, Date _timeMax) {
		super(_id,_start, _end, _status, _timeMax);
		LinkB =  "link 2 B";
	}
}
