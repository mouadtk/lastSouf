package com.opm.snds.app.dao;

import com.opm.snds.app.model.User;

public interface UserDAO {
	
	 public User findByUserName(String username);
	 
	 
}
