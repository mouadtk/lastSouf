package com.opm.snds.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="server", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ip"),
		@UniqueConstraint(columnNames = "name") })
public class Server implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = -5046029271017249675L;
	
	@Id @GeneratedValue
	@Column(name = "SERVER_ID")
	private int Id;
	private String name;
	private String ip;
	private String domain;
	private String Registrar;
	private String EntityGroup;
	
	@OneToMany( mappedBy = "Parent")
	Set<IPAdress> Childs = new HashSet<IPAdress>(0);
	
	/***** Test *****/
	@OneToMany( mappedBy = "OpServer")
	Set<Operation> operations = new HashSet<Operation>();

	public Server(String... args){
		
		name 	=  args[0];
		ip		=  args[1];
		domain	=  args[2];
		
	}
	
	public Server(){} 
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public String getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(String registrar) {
		Registrar = registrar;
	}

	public String getEntityGroup() {
		return EntityGroup;
	}

	public void setEntityGroup(String entityGroup) {
		EntityGroup = entityGroup;
	}

	public Set<IPAdress> getChilds() {
		return Childs;
	}
	
	public void setChilds(Set<IPAdress> childs) {
		Childs = childs;
	}

	
	
}