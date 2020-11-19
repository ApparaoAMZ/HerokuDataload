package com.heroku.model;


import java.sql.Date;
import java.sql.Timestamp;


import ch.qos.logback.core.joran.action.TimestampAction;

public class Assessment {
	private Long    id;
	private String assessment_type__c;
	Timestamp   lastmodifieddate;
	private String    replicate_screening__c;
	private String    parent_screening__c;
	Timestamp    lastreferenceddate;
	private String    application_requisition__c      ;
	private String    name         ;
	private String    connectionsentid;
	private String    candidate__c ;
	private String    createdbyid  ;
	private boolean    expired_checkbox__c;
	private String    recordtypeid ;
	private String    connectionreceivedid;
	Date    last_asr_request_date__c;
	private String    application__c ;
	private String    score_name__c;
	Date    initiation_date__c;
	Date    status_date__c;
	private boolean    is_international_bgc__c         ;
	private String    error_detail_long__c;
	private boolean    isdeleted;
	private String    application_workflow_details__c ;
	private String    legacy_taleo_provider_status__c ;
	private String    legacy_taleo_screening_requester__c;
	Timestamp    lastvieweddate ;
	private String    error_detail__c;
	private float accurate_screening_check__c;
	Timestamp    systemmodstamp ;
	private String    receipt_id__c;
	Date    expirationdate__c ;
	private String    original_external_order_id__c;
	private boolean    x15_day_screening_validator__c  ;
	private String    current_pan_score__c;
	private String    overall_score__c;
	private boolean    us_candidate__c;
	private boolean    invalidated_screening__c;
	Timestamp    createddate;
	private String    order_id__c;
	private String    status__c;
	private String    lastmodifiedbyid;
	private String    screening_pan_package_id__c;
	private String    sfid;
	private String    _hc_lastop;
	private String    _hc_err;
	
	private String adpinitiatescreeningurl__c;
	private boolean bgc_expire_mismatch__c;
	private String adpscreeningid__c;
	Date section1_complete_dt__c;
	Date term_date__c;
	private String i9_status__c;
	private String i9_master_status__c;
	private boolean check_rehire__c;
	private float no_of_retries__c;
	private float form_id__c;
	private String master_status__c;
	private String i9_id_type__c;
	private float previous_i9_status_number__c;
	private String i9_prior_master_status__c;
	private String airport__c;
	private float i9_id__c;
	private boolean i9_complete__c;
	private float i9_status_number__c;
	Date section3_complete_dt__c;
	Date section2_complete_dt__c;
	private boolean has_candidate_screenings__c;
	
	
	public String getAdpinitiatescreeningurl__c() {
		return adpinitiatescreeningurl__c;
	}
	public void setAdpinitiatescreeningurl__c(String adpinitiatescreeningurl__c) {
		this.adpinitiatescreeningurl__c = adpinitiatescreeningurl__c;
	}
	public boolean isBgc_expire_mismatch__c() {
		return bgc_expire_mismatch__c;
	}
	public void setBgc_expire_mismatch__c(boolean bgc_expire_mismatch__c) {
		this.bgc_expire_mismatch__c = bgc_expire_mismatch__c;
	}
	public String getAdpscreeningid__c() {
		return adpscreeningid__c;
	}
	public void setAdpscreeningid__c(String adpscreeningid__c) {
		this.adpscreeningid__c = adpscreeningid__c;
	}
	public Date getSection1_complete_dt__c() {
		return section1_complete_dt__c;
	}
	public void setSection1_complete_dt__c(Date section1_complete_dt__c) {
		this.section1_complete_dt__c = section1_complete_dt__c;
	}
	public Date getTerm_date__c() {
		return term_date__c;
	}
	public void setTerm_date__c(Date term_date__c) {
		this.term_date__c = term_date__c;
	}
	public String getI9_status__c() {
		return i9_status__c;
	}
	public void setI9_status__c(String i9_status__c) {
		this.i9_status__c = i9_status__c;
	}
	public String getI9_master_status__c() {
		return i9_master_status__c;
	}
	public void setI9_master_status__c(String i9_master_status__c) {
		this.i9_master_status__c = i9_master_status__c;
	}
	public boolean isCheck_rehire__c() {
		return check_rehire__c;
	}
	public void setCheck_rehire__c(boolean check_rehire__c) {
		this.check_rehire__c = check_rehire__c;
	}
	public float getNo_of_retries__c() {
		return no_of_retries__c;
	}
	public void setNo_of_retries__c(float no_of_retries__c) {
		this.no_of_retries__c = no_of_retries__c;
	}
	public float getForm_id__c() {
		return form_id__c;
	}
	public void setForm_id__c(float form_id__c) {
		this.form_id__c = form_id__c;
	}
	public String getMaster_status__c() {
		return master_status__c;
	}
	public void setMaster_status__c(String master_status__c) {
		this.master_status__c = master_status__c;
	}
	public String getI9_id_type__c() {
		return i9_id_type__c;
	}
	public void setI9_id_type__c(String i9_id_type__c) {
		this.i9_id_type__c = i9_id_type__c;
	}
	public float getPrevious_i9_status_number__c() {
		return previous_i9_status_number__c;
	}
	public void setPrevious_i9_status_number__c(float previous_i9_status_number__c) {
		this.previous_i9_status_number__c = previous_i9_status_number__c;
	}
	public String getI9_prior_master_status__c() {
		return i9_prior_master_status__c;
	}
	public void setI9_prior_master_status__c(String i9_prior_master_status__c) {
		this.i9_prior_master_status__c = i9_prior_master_status__c;
	}
	public String getAirport__c() {
		return airport__c;
	}
	public void setAirport__c(String airport__c) {
		this.airport__c = airport__c;
	}
	public float getI9_id__c() {
		return i9_id__c;
	}
	public void setI9_id__c(float i9_id__c) {
		this.i9_id__c = i9_id__c;
	}
	public boolean isI9_complete__c() {
		return i9_complete__c;
	}
	public void setI9_complete__c(boolean i9_complete__c) {
		this.i9_complete__c = i9_complete__c;
	}
	public float getI9_status_number__c() {
		return i9_status_number__c;
	}
	public void setI9_status_number__c(float i9_status_number__c) {
		this.i9_status_number__c = i9_status_number__c;
	}
	public Date getSection3_complete_dt__c() {
		return section3_complete_dt__c;
	}
	public void setSection3_complete_dt__c(Date section3_complete_dt__c) {
		this.section3_complete_dt__c = section3_complete_dt__c;
	}
	public Date getSection2_complete_dt__c() {
		return section2_complete_dt__c;
	}
	public void setSection2_complete_dt__c(Date section2_complete_dt__c) {
		this.section2_complete_dt__c = section2_complete_dt__c;
	}
	public boolean isHas_candidate_screenings__c() {
		return has_candidate_screenings__c;
	}
	public void setHas_candidate_screenings__c(boolean has_candidate_screenings__c) {
		this.has_candidate_screenings__c = has_candidate_screenings__c;
	}
	public String getAssessment_type__c() {
		return assessment_type__c;
	}
	public void setAssessment_type__c(String assessment_type__c) {
		this.assessment_type__c = assessment_type__c;
	}
	public Timestamp getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Timestamp lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	public String getReplicate_screening__c() {
		return replicate_screening__c;
	}
	public void setReplicate_screening__c(String replicate_screening__c) {
		this.replicate_screening__c = replicate_screening__c;
	}
	public String getParent_screening__c() {
		return parent_screening__c;
	}
	public void setParent_screening__c(String parent_screening__c) {
		this.parent_screening__c = parent_screening__c;
	}
	public Timestamp getLastreferenceddate() {
		return lastreferenceddate;
	}
	public void setLastreferenceddate(Timestamp lastreferenceddate) {
		this.lastreferenceddate = lastreferenceddate;
	}
	public String getApplication_requisition__c() {
		return application_requisition__c;
	}
	public void setApplication_requisition__c(String application_requisition__c) {
		this.application_requisition__c = application_requisition__c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConnectionsentid() {
		return connectionsentid;
	}
	public void setConnectionsentid(String connectionsentid) {
		this.connectionsentid = connectionsentid;
	}
	public String getCandidate__c() {
		return candidate__c;
	}
	public void setCandidate__c(String candidate__c) {
		this.candidate__c = candidate__c;
	}
	public String getCreatedbyid() {
		return createdbyid;
	}
	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
	}
	public boolean isExpired_checkbox__c() {
		return expired_checkbox__c;
	}
	public void setExpired_checkbox__c(boolean expired_checkbox__c) {
		this.expired_checkbox__c = expired_checkbox__c;
	}
	public String getRecordtypeid() {
		return recordtypeid;
	}
	public void setRecordtypeid(String recordtypeid) {
		this.recordtypeid = recordtypeid;
	}
	public String getConnectionreceivedid() {
		return connectionreceivedid;
	}
	public void setConnectionreceivedid(String connectionreceivedid) {
		this.connectionreceivedid = connectionreceivedid;
	}
	public Date getLast_asr_request_date__c() {
		return  last_asr_request_date__c;
	}
	public void setLast_asr_request_date__c(Date last_asr_request_date__c) {
		this.last_asr_request_date__c = last_asr_request_date__c;
	}
	public String getApplication__c() {
		return application__c;
	}
	public void setApplication__c(String application__c) {
		this.application__c = application__c;
	}
	public String getScore_name__c() {
		return score_name__c;
	}
	public void setScore_name__c(String score_name__c) {
		this.score_name__c = score_name__c;
	}
	public Date getInitiation_date__c() {
		return  initiation_date__c;
	}
	public void setInitiation_date__c(Date initiation_date__c) {
		this.initiation_date__c = initiation_date__c;
	}
	public Date getStatus_date__c() {
		return  status_date__c;
	}
	public void setStatus_date__c(Date status_date__c) {
		this.status_date__c = status_date__c;
	}
	public boolean isIs_international_bgc__c() {
		return is_international_bgc__c;
	}
	public void setIs_international_bgc__c(boolean is_international_bgc__c) {
		this.is_international_bgc__c = is_international_bgc__c;
	}
	public String getError_detail_long__c() {
		return error_detail_long__c;
	}
	public void setError_detail_long__c(String error_detail_long__c) {
		this.error_detail_long__c = error_detail_long__c;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getApplication_workflow_details__c() {
		return application_workflow_details__c;
	}
	public void setApplication_workflow_details__c(String application_workflow_details__c) {
		this.application_workflow_details__c = application_workflow_details__c;
	}
	public String getLegacy_taleo_provider_status__c() {
		return legacy_taleo_provider_status__c;
	}
	public void setLegacy_taleo_provider_status__c(String legacy_taleo_provider_status__c) {
		this.legacy_taleo_provider_status__c = legacy_taleo_provider_status__c;
	}
	public String getLegacy_taleo_screening_requester__c() {
		return legacy_taleo_screening_requester__c;
	}
	public void setLegacy_taleo_screening_requester__c(String legacy_taleo_screening_requester__c) {
		this.legacy_taleo_screening_requester__c = legacy_taleo_screening_requester__c;
	}
	public Timestamp getLastvieweddate() {
		return lastvieweddate;
	}
	public void setLastvieweddate(Timestamp lastvieweddate) {
		this.lastvieweddate = lastvieweddate;
	}
	public String getError_detail__c() {
		return error_detail__c;
	}
	public void setError_detail__c(String error_detail__c) {
		this.error_detail__c = error_detail__c;
	}
	public float getAccurate_screening_check__c() {
		return accurate_screening_check__c;
	}
	public void setAccurate_screening_check__c(float accurate_screening_check__c) {
		this.accurate_screening_check__c = accurate_screening_check__c;
	}
	public Timestamp getSystemmodstamp() {
		return systemmodstamp;
	}
	public void setSystemmodstamp(Timestamp systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}
	public String getReceipt_id__c() {
		return receipt_id__c;
	}
	public void setReceipt_id__c(String receipt_id__c) {
		this.receipt_id__c = receipt_id__c;
	}
	public Date getExpirationdate__c() {
		return  expirationdate__c;
	}
	public void setExpirationdate__c(Date expirationdate__c) {
		this.expirationdate__c = expirationdate__c;
	}
	public String getOriginal_external_order_id__c() {
		return original_external_order_id__c;
	}
	public void setOriginal_external_order_id__c(String original_external_order_id__c) {
		this.original_external_order_id__c = original_external_order_id__c;
	}
	public boolean isX15_day_screening_validator__c() {
		return x15_day_screening_validator__c;
	}
	public void setX15_day_screening_validator__c(boolean x15_day_screening_validator__c) {
		this.x15_day_screening_validator__c = x15_day_screening_validator__c;
	}
	public String getCurrent_pan_score__c() {
		return current_pan_score__c;
	}
	public void setCurrent_pan_score__c(String current_pan_score__c) {
		this.current_pan_score__c = current_pan_score__c;
	}
	public String getOverall_score__c() {
		return overall_score__c;
	}
	public void setOverall_score__c(String overall_score__c) {
		this.overall_score__c = overall_score__c;
	}
	public boolean isUs_candidate__c() {
		return us_candidate__c;
	}
	public void setUs_candidate__c(boolean us_candidate__c) {
		this.us_candidate__c = us_candidate__c;
	}
	public boolean isInvalidated_screening__c() {
		return invalidated_screening__c;
	}
	public void setInvalidated_screening__c(boolean invalidated_screening__c) {
		this.invalidated_screening__c = invalidated_screening__c;
	}
	public Timestamp getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
	public String getOrder_id__c() {
		return order_id__c;
	}
	public void setOrder_id__c(String order_id__c) {
		this.order_id__c = order_id__c;
	}
	public String getStatus__c() {
		return status__c;
	}
	public void setStatus__c(String status__c) {
		this.status__c = status__c;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public String getScreening_pan_package_id__c() {
		return screening_pan_package_id__c;
	}
	public void setScreening_pan_package_id__c(String screening_pan_package_id__c) {
		this.screening_pan_package_id__c = screening_pan_package_id__c;
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
