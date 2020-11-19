package com.heroku.model;


import java.sql.Date;
import java.sql.Timestamp;

public class EmailMessage {
	Timestamp lastmodifieddate;
	private boolean istracked;
	private String headers;
	private String threadidentifier;
	private String activityid;
	Timestamp lastopeneddate;
	private String emailtemplateid;
	private boolean isexternallyvisible;
	private boolean isclientmanaged;
	private String fromname;
	private boolean hasattachment;
	private String fromaddress;
	private String createdbyid;
	private boolean isopened;
	private String ccaddress;
	private String parentid;
	private String relatedtoid;
	private String status;
	Timestamp messagedate;
	private boolean isdeleted;
	private boolean incoming;
	private boolean isbounced;
	private String validatedfromaddress;
	private String subject;
	Timestamp systemmodstamp;
	Timestamp firstopeneddate;
	private String textbody;
	private String replytoemailmessageid;
	private String htmlbody;
	Timestamp createddate;
	private String bccaddress;
	private String messageidentifier;
	private String lastmodifiedbyid;
	private String toaddress;
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
	public boolean isIstracked() {
		return istracked;
	}
	public void setIstracked(boolean istracked) {
		this.istracked = istracked;
	}
	public String getHeaders() {
		return headers;
	}
	public void setHeaders(String headers) {
		this.headers = headers;
	}
	public String getThreadidentifier() {
		return threadidentifier;
	}
	public void setThreadidentifier(String threadidentifier) {
		this.threadidentifier = threadidentifier;
	}
	public String getActivityid() {
		return activityid;
	}
	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}
	public Timestamp getLastopeneddate() {
		return lastopeneddate;
	}
	public void setLastopeneddate(Timestamp lastopeneddate) {
		this.lastopeneddate = lastopeneddate;
	}
	public String getEmailtemplateid() {
		return emailtemplateid;
	}
	public void setEmailtemplateid(String emailtemplateid) {
		this.emailtemplateid = emailtemplateid;
	}
	public boolean isIsexternallyvisible() {
		return isexternallyvisible;
	}
	public void setIsexternallyvisible(boolean isexternallyvisible) {
		this.isexternallyvisible = isexternallyvisible;
	}
	public boolean isIsclientmanaged() {
		return isclientmanaged;
	}
	public void setIsclientmanaged(boolean isclientmanaged) {
		this.isclientmanaged = isclientmanaged;
	}
	public String getFromname() {
		return fromname;
	}
	public void setFromname(String fromname) {
		this.fromname = fromname;
	}
	public boolean isHasattachment() {
		return hasattachment;
	}
	public void setHasattachment(boolean hasattachment) {
		this.hasattachment = hasattachment;
	}
	public String getFromaddress() {
		return fromaddress;
	}
	public void setFromaddress(String fromaddress) {
		this.fromaddress = fromaddress;
	}
	public String getCreatedbyid() {
		return createdbyid;
	}
	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
	}
	public boolean isIsopened() {
		return isopened;
	}
	public void setIsopened(boolean isopened) {
		this.isopened = isopened;
	}
	public String getCcaddress() {
		return ccaddress;
	}
	public void setCcaddress(String ccaddress) {
		this.ccaddress = ccaddress;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getRelatedtoid() {
		return relatedtoid;
	}
	public void setRelatedtoid(String relatedtoid) {
		this.relatedtoid = relatedtoid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getMessagedate() {
		return messagedate;
	}
	public void setMessagedate(Timestamp messagedate) {
		this.messagedate = messagedate;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public boolean isIncoming() {
		return incoming;
	}
	public void setIncoming(boolean incoming) {
		this.incoming = incoming;
	}
	public boolean isIsbounced() {
		return isbounced;
	}
	public void setIsbounced(boolean isbounced) {
		this.isbounced = isbounced;
	}
	public String getValidatedfromaddress() {
		return validatedfromaddress;
	}
	public void setValidatedfromaddress(String validatedfromaddress) {
		this.validatedfromaddress = validatedfromaddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Timestamp getSystemmodstamp() {
		return systemmodstamp;
	}
	public void setSystemmodstamp(Timestamp systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}
	public Timestamp getFirstopeneddate() {
		return firstopeneddate;
	}
	public void setFirstopeneddate(Timestamp firstopeneddate) {
		this.firstopeneddate = firstopeneddate;
	}
	public String getTextbody() {
		return textbody;
	}
	public void setTextbody(String textbody) {
		this.textbody = textbody;
	}
	public String getReplytoemailmessageid() {
		return replytoemailmessageid;
	}
	public void setReplytoemailmessageid(String replytoemailmessageid) {
		this.replytoemailmessageid = replytoemailmessageid;
	}
	public String getHtmlbody() {
		return htmlbody;
	}
	public void setHtmlbody(String htmlbody) {
		this.htmlbody = htmlbody;
	}
	public Timestamp getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
	public String getBccaddress() {
		return bccaddress;
	}
	public void setBccaddress(String bccaddress) {
		this.bccaddress = bccaddress;
	}
	public String getMessageidentifier() {
		return messageidentifier;
	}
	public void setMessageidentifier(String messageidentifier) {
		this.messageidentifier = messageidentifier;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public String getToaddress() {
		return toaddress;
	}
	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
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
