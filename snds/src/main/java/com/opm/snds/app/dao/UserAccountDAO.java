package com.opm.snds.app.dao;

import com.opm.snds.app.model.UserAccount;

public interface UserAccountDAO {

	public UserAccount getUSerByLogin(String login);
}
