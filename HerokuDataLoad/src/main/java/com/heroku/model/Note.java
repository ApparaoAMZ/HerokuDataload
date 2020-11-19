package com.heroku.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Note {
	private String body;
	private String parentid;
	Timestamp lastmodifieddate;
	private String ownerid;
	private boolean isdeleted;
	Timestamp systemmodstamp;
	private String lastmodifiedbyid;
	Timestamp createddate;
	private String title;
	private boolean isprivate;
	private String createdbyid;
	private String sfid;
	private Long id;
	private String _hc_lastop;
	private String _hc_err;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public Timestamp getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Timestamp lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public Timestamp getSystemmodstamp() {
		return systemmodstamp;
	}
	public void setSystemmodstamp(Timestamp systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public Timestamp getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIsprivate() {
		return isprivate;
	}
	public void setIsprivate(boolean isprivate) {
		this.isprivate = isprivate;
	}
	public String getCreatedbyid() {
		return createdbyid;
	}
	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
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
