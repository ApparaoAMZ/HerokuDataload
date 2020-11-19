package com.heroku.model;


import java.sql.Date;
import java.sql.Timestamp;

public class ErrorLog {
	private String exception_stack_trace__c;
	Timestamp  lastmodifieddate;
	private boolean  isdeleted;
	private String  exception_message__c;
	private String  exception_type__c;
	private String  apex_class_name__c;
	private String  name;
	Timestamp  systemmodstamp;
	private String  connectionsentid;
	private String  ownerid;
	private String  createdbyid;
	Timestamp  createddate;
	private String  connectionreceivedid;
	private float  exception_line_number__c;
	private String  lastmodifiedbyid;
	private String  related_application__c;
	private String  sfid;
	private Long  id;
	private String  _hc_lastop;
	private String  _hc_err;
	public String getException_stack_trace__c() {
		return exception_stack_trace__c;
	}
	public void setException_stack_trace__c(String exception_stack_trace__c) {
		this.exception_stack_trace__c = exception_stack_trace__c;
	}
	public Timestamp getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Timestamp lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getException_message__c() {
		return exception_message__c;
	}
	public void setException_message__c(String exception_message__c) {
		this.exception_message__c = exception_message__c;
	}
	public String getException_type__c() {
		return exception_type__c;
	}
	public void setException_type__c(String exception_type__c) {
		this.exception_type__c = exception_type__c;
	}
	public String getApex_class_name__c() {
		return apex_class_name__c;
	}
	public void setApex_class_name__c(String apex_class_name__c) {
		this.apex_class_name__c = apex_class_name__c;
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
	public float getException_line_number__c() {
		return exception_line_number__c;
	}
	public void setException_line_number__c(float exception_line_number__c) {
		this.exception_line_number__c = exception_line_number__c;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public String getRelated_application__c() {
		return related_application__c;
	}
	public void setRelated_application__c(String related_application__c) {
		this.related_application__c = related_application__c;
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
