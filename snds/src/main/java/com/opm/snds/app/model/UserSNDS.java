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
@Table(name="usersnds")
public class UserSNDS implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 590594772239905222L;
	
	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private long id;
	private String firstname;
	private String lastname;	
	private String login;
	private String passwd;
	private String DataLink;
	private String IPStatusLink;
	
	@OneToMany(fetch =  FetchType.LAZY, mappedBy="usersnds")
	Set<SNDS> snds = new HashSet<SNDS>(0);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Set<SNDS> getData() {
		return snds;
	}

	public void setData(Set<SNDS> data) {
		this.snds = data;
	}


}
