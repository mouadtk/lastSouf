package com.opm.snds.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="useraccount")
public class UserAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 590594772239905222L;
	
	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private long id;
	private String login;
	private String passwd;
	private String DataLink;
	private String IPStatusLink;
	
	@OneToMany(fetch =  FetchType.LAZY, mappedBy="user")
	Set<Server> data = new HashSet<Server>(0);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set<Server> getData() {
		return data;
	}

	public void setData(Set<Server> data) {
		this.data = data;
	}

	public String getDataLink() {
		return DataLink;
	}

	public void setDataLink(String dataLink) {
		DataLink = dataLink;
	}

	public String getIPStatusLink() {
		return IPStatusLink;
	}

	public void setIPStatusLink(String iPStatusLink) {
		IPStatusLink = iPStatusLink;
	}


}
