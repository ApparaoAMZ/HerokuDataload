package com.heroku.model;

import java.sql.Date;
import java.sql.Timestamp;

public class ResponseAnswer {
	Timestamp lastmodifieddate;
	private Boolean isdeleted;
	private String answer__c;
	private String response__c;
	private String name;
	Timestamp systemmodstamp;
	private String connectionsentid;
	private String ownerid;
	private String createdbyid;
	Timestamp createddate;
	private String connectionreceivedid;
	private String lastmodifiedbyid;
	private String sfid;
	private Long id;
	private String _hc_lastop;
	private String _hc_err;
	public Timestamp getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Timestamp lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	public Boolean getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getAnswer__c() {
		return answer__c;
	}
	public void setAnswer__c(String answer__c) {
		this.answer__c = answer__c;
	}
	public String getResponse__c() {
		return response__c;
	}
	public void setResponse__c(String response__c) {
		this.response__c = response__c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getSystemmodstamp() {
		return systemmodstamp;
	}
	public void setSystemmodstamp(Timestamp systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}
	public String getConnectionsentid() {
		return connectionsentid;
	}
	public void setConnectionsentid(String connectionsentid) {
		this.connectionsentid = connectionsentid;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	public String getCreatedbyid() {
		return createdbyid;
	}
	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
	}
	public Timestamp getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
	public String getConnectionreceivedid() {
		return connectionreceivedid;
	}
	public void setConnectionreceivedid(String connectionreceivedid) {
		this.connectionreceivedid = connectionreceivedid;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public String getSfid() {
		return sfid;
	}
	public void setSfid(String sfid) {
		this.sfid = sfid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String get_hc_lastop() {
		return _hc_lastop;
	}
	public void set_hc_lastop(String _hc_lastop) {
		this._hc_lastop = _hc_lastop;
	}
	public String get_hc_err() {
		return _hc_err;
	}
	public void set_hc_err(String _hc_err) {
		this._hc_err = _hc_err;
	}

	
	
}
