package com.opm.snds.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="sndsdata")
public class SNDSData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2414944140053456775L;
	
	@Id @GeneratedValue 
	@Column(name = "SNDSDATA_ID")
	private int Id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ActivityPeriod;
	private String RCPTCmd;
	private String DATACmd;
	private String SGRecepients;
	private String FilterResult;
	private Integer ComplaitnRate; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date TrapMsgPeriod;
	private Integer TrapHits;
	private String HeloSample;
	private String MailFromSample;
	private String Comment;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SNDS_ID", nullable=false)
	private SNDS snds;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getActivityPeriod() {
		return ActivityPeriod;
	}

	public void setActivityPeriod(Date activityPeriod) {
		ActivityPeriod = activityPeriod;
	}

	public String getRCPTCmd() {
		return RCPTCmd;
	}

	public void setRCPTCmd(String rCPTCmd) {
		RCPTCmd = rCPTCmd;
	}

	public String getDATACmd() {
		return DATACmd;
	}

	public void setDATACmd(String dATACmd) {
		DATACmd = dATACmd;
	}

	public String getSGRecepients() {
		return SGRecepients;
	}

	public void setSGRecepients(String sGRecepients) {
		SGRecepients = sGRecepients;
	}

	public String getFilterResult() {
		return FilterResult;
	}

	public void setFilterResult(String filterResult) {
		FilterResult = filterResult;
	}

	public Integer getComplaitnRate() {
		return ComplaitnRate;
	}

	public void setComplaitnRate(Integer complaitnRate) {
		ComplaitnRate = complaitnRate;
	}

	public Date getTrapMsgPeriod() {
		return TrapMsgPeriod;
	}

	public void setTrapMsgPeriod(Date trapMsgPeriod) {
		TrapMsgPeriod = trapMsgPeriod;
	}

	public Integer getTrapHits() {
		return TrapHits;
	}

	public void setTrapHits(Integer trapHits) {
		TrapHits = trapHits;
	}

	public String getHeloSample() {
		return HeloSample;
	}

	public void setHeloSample(String heloSample) {
		HeloSample = heloSample;
	}

	public String getMailFromSample() {
		return MailFromSample;
	}

	public void setMailFromSample(String mailFromSample) {
		MailFromSample = mailFromSample;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

}
