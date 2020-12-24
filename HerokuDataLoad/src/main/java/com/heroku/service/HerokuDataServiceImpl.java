package com.heroku.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroku.dao.HerokuDataDao;
import com.heroku.model.Application;
import com.heroku.model.Assessment;
import com.heroku.model.EmailMessage;
import com.heroku.model.ErrorLog;
import com.heroku.model.IntegrationTransaction;
import com.heroku.model.Interview;
import com.heroku.model.Note;
import com.heroku.model.Response;
import com.heroku.model.ResponseAnswer;
/**
* service Implementation class
* 
*/
@Service
public class HerokuDataServiceImpl implements HerokuDataService {

	@Autowired
	HerokuDataDao herokuDataDao;
	/**
	 * creating list of application objects
	 *
     * @return void
	 */ 
	@Override
	public void insertApplicationData() {
		// TODO Auto-generated method stub
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		// TODO Auto-generated method stub
		List<Application> lstApl = new ArrayList<Application>();
		for (int i = 0; i < 1000; i++) {
			Application ap = new Application();
			ap.setCandidate__c("candidate" + i);
			ap.setNational_id_country_ps__c("national_id");
			ap.setMore_than_one_application__c(true);
			ap.setLegacy_taleo_external_id__c("legacytaleo" + i);
			ap.setFelony_conviction_question_1__c("felony_conviction_question_1");
			ap.setRequisition_hiring_function__c("requisition_hiring_function");
			ap.setEmail_notification_prompt_3_text__c("email_notification_prompt_3_text");
			ap.setBgc_authorization_1_date__c(ts);
			ap.setHcr_hiring_manager_full_name__c("hcr_hiring_managefullname");
			ap.setCandidate_withdraws_detail__c("candidatewithdraw_detail");
			ap.setCandidate_owner_id__c("candidate_owner_id");
			ap.setRequisition_reg_temp__c("requisition_reg_temp");
			ap.setApp_performance_curve__c((float) 5.43);
			ap.setTech_insight_score__c("tech_insightightcore");
			ap.setUs_candidate__c(true);
			ap.setLegacy_taleo_fclm_area__c("legacytaleoarea");
			ap.setCreatedfrompostcard__c(true);
			ap.setEmail_notification_prompt_4_text__c("emailnotificationprompt_4_text");
			ap.setBgc_authorization_2_date__c(ts);
			ap.setApp_performance_hours__c((float) 4.5);
			ap.setPeoplesoft_pre_processing_substep__c(true);
			ap.setMost_recent_substep_change_date__c(fromdate);
			ap.setHr_location_code__c("hr_location_code");
			ap.setHr_manager_login__c("hr_manager_login");
			ap.setAgency_subsource_ps__c("agency_subsource_ps");
			ap.setGender_ps__c("gender_ps");
			ap.setEducation_qualification_check__c(true);
			ap.setPrevious_step_substep__c("previous_stepsubstep");
			ap.setTyping_accuracy__c("typingaccuracy");
			ap.setJob_page_url__c("job_page_url");
			ap.setEnable_concurrent_contingencies__c(true);
			ap.setApplication_esignature_date_time_part2__c(ts);
			ap.setArtdoc_candidate_id__c("artdoc_candidate_id");
			ap.setSign_on_bonus_ps__c("sign_on_bonus_ps");
			ap.setApplication_esignature_date_time__c(ts);
			ap.setPhone_tool_title_ps__c("phone_tool_title_ps");
			ap.setHcr_hiring_manager_title__c("hcr_hiring_manager_title");
			ap.setIn_invitation_extension_substep__c(true);
			ap.setReq_auto_send_contingent_offer__c("req_auto_send_contingent_offer");
			ap.setApp_performance_eligibility__c("app_performance_eligibility");
			ap.setLegacy_taleo_overall_assessment__c("legacytarassmt");
			ap.setContingent_offer_extended__c(ts);
			ap.setHr_requisition_title__c("hr_requisitiontitle");
			ap.setCloned_due_to_process_on_other_req__c(true);
			ap.setWorkflow__c("workflow");
			ap.setBackgroundcheckoverallscore__c("backgroundckoverallscore");
			ap.setLegacy_taleo_recruiter__c("legacy_taleorecruiter");
			ap.setTyping_speed__c("typing_speed");
			ap.setHcr_day_1_day_ps__c("hcrday1_day_ps");
			ap.setPanattemptcount__c((float) 4.67);
			ap.setOrder_id_override__c("order_id_override");
			ap.setHr_shift_code__c("hr_shift_code");
			ap.setNode_requisition__c("node_requisition");
			ap.setHcr_orientation_session__c("hcr_orientation_session");
			ap.setHeadcount_request__c("headcount_request");
			ap.setBgc_disclosure_date__c(ts);
			ap.setHr_open__c((float) 6.7);
			ap.setHcr_location_address1__c("hcr_locationaddress");
			ap.setRequisition_id__c("requisition_id");
			ap.setLegacy_taleo_department_extension__c("dept");
			ap.setBusinessunit_ps__c("businessunit_ps");
			ap.setSource_details__c("sourcedetails");
			ap.setSource_primary__c("sourceprimary");
			ap.setSelected_shift__c("selectedshift");
			ap.setCandidateid__c("candidate"+i);
			ap.setSp_q1_response__c("sp_q1response");
			ap.setAppointment_search_filter_date__c(fromdate);
			ap.setApp_rehire_eligibility_status__c("app_rehireeligibility_status");
			ap.setHcr_orientation_date_ps__c("hcr_orientation_date_ps");
			ap.setLegacy_taleo_hiring_area_manager__c("legacy_taleo_area_manager");
			ap.setLegacy_taleo_shift_comments__c("legacy_taleosft_comments");
			ap.setCareer_portal_url__c("career_portal_url");
			ap.setStatus_onbase__c("status_onbase");
			ap.setSp_q2_response__c("sp_q2_response");
			ap.setCurrent_integration_step__c("current_integration_step");
			ap.setAcknowledge_no_work_experience__c(true);
			ap.setRpt_compare_start_date_with_day1__c("rpt_compare_start_date_withd1");
			ap.setHire_back_dated_candidates_ps__c("hire_back_dated_candidates_ps");
			ap.setRequisition__c("requisition");
			ap.setSp_q3_response__c("sp_q3_response");
			ap.setLegacy_taleo_submission_medium__c("legacy_taleosubmission_medium");
			ap.setSelected_shift_valid__c(true);
			ap.setLegacy_taleo_orientation_session__c("legacy_taleoorientation_session");
			ap.setRewind__c(true);
			ap.setHr_hired__c((float) 6.7);
			ap.setRequisition_function__c("requisitionfunction");
			ap.setLegacy_taleo_overall_percentile__c((float) 5.67);
			ap.setMy_job_status_global__c("my_jobstatus_global");
			ap.setBgc_disclosure_frca__c("bgc_disclosurefrca");
			ap.setLastvieweddate(ts);
			ap.setEmail_notification_subject__c("email_notification_subject");
			ap.setAccount_employee_id__c("account_employee_id");
			ap.setBgc_authorization2__c("bgc_authorization2");
			ap.setPs_integration_enabled__c(true);
			ap.setOwner_id_validator__c(true);
			ap.setHcr_location_postalcode__c("hcr_locatiopostalcode");
			ap.setSubmitted_app_on_file__c(true);
			ap.setReschedule_count__c((float) 5.67);
			ap.setAgency_conversion_check__c(true);
			ap.setPreferred_location_code__c("preflode");
			ap.setBgc_authorization1__c("bgc_authorization1");
			ap.setMy_job_status_de__c("my_job_status_de");
			ap.setApp_my_job_status_global__c("app_myjbstatus_global");
			ap.setFree_consumer_report_requested__c(true);
			ap.setRespects_special_jurisdiction__c(true);
			ap.setMeets_education_requirement__c(true);
			ap.setStep_substep__c("step_substep");
			ap.setReq_contingency_bypass__c(true);
			ap.setHr_requested__c((float) 7.5);
			ap.setApplication_shift_code__c("appshift");
			ap.setBackgroundchkexpirydate__c(fromdate);
			ap.setWork_flow_rule_trigger__c("work_flow_rule_trigger");
			ap.setCurrent_mailing_state_province__c("currentmalngst_province");
			ap.setSalary_ps__c("salary_ps");
			ap.setLetter_of_intent_selection__c("letter_ofintent_selection");
			ap.setJobcode_ps__c("jobcode_ps");
			ap.setName("name");
			ap.setCandidate_last_name__c("candidateast_name");
			ap.setRecruiter_employee_id__c("recruiter_id");
			ap.setContinue_application__c("continue_application");
			ap.setHcr_department_description__c("hcr_department_description");
			ap.setBgc_disclosure_frca_esignature__c("bgc_disclosurefcrasignature");
			ap.setDrugtestoverallscore__c("drugterallscore");
			ap.setLocation_postal_code__c("location_postal_code");
			ap.setVcpprp_ps__c("vcpprp_ps");
			ap.setPay_rate__c((float) 5.4);
			ap.setContract_title_ps__c("contract_title_ps");
			ap.setRole__c("role");
			ap.setStdhours_ps__c("stdhours_ps");
			ap.setHr_hiring_manager_name__c("hr_hiring_managername");
			ap.setApp_language__c("applanguage");
			ap.setHire_start_date__c(fromdate);
			ap.setCandidate_first_name__c("candidate_first_name");
			ap.setHr_day_1_day__c(fromdate);
			ap.setLetter_of_intent_completed_date__c(fromdate);
			ap.setLegacy_taleo_shift__c("legacytaleosift");
			ap.setConversion__c(true);
			ap.setLastmodifieddate(ts);
			ap.setLocation_city__c("location_city");
			ap.setMatching_location_code__c("matchinglocation_code");
			ap.setApplication_withdrawn__c(true);
			ap.setHcr_hire_end_date__c(fromdate);
			ap.setOwnerid("ownerid");
			ap.setTech_force_email_rule_execution__c(true);
			ap.setInstance__c("instance");
			ap.setRequisition_title__c("requisition_title");
			ap.setAppointment_4__c(ts);
			ap.setPhone_screen_results__c("phone_screenresults");
			ap.setRequisition_location_code__c("requisitionloccode");
			ap.setIn_manage_hire__c(true);
			ap.setBest_suitable_skill__c("best_suitable_skill");
			ap.setHcr_location_country__c("hcr_location_country");
			ap.setLegacy_taleo_e_signature_ip__c("legtalsigip");
			ap.setIsdeleted(true);
			ap.setPortal_application_status__c("portal_application_status");
			ap.setBackground_check_counter__c("background_check_counter");
			ap.setAccurate_screening_check__c((float) 4.67);
			ap.setLegacy_taleo_application_creation_date__c(fromdate);
			ap.setCompany_code_ps__c("company_code_ps");
			ap.setHcr_request_id__c("hcr_request_id");
			ap.setAppointment_3__c(ts);
			ap.setLegacy_taleo_correspondence_information__c("legacy_taleocorrespondencenformation");
			ap.setRequisition_country__c("requisition_country");
			ap.setEmail_notification_body__c("email_notification_body");
			ap.setSystemmodstamp(ts);
			ap.setDrugtestexpirydate__c(fromdate);
			ap.setLastmodifiedbyid("lastmodifiedbyid");
			ap.setBypass_dt_bgc_validation__c(true);
			ap.setTimeslots_available__c(true);
			ap.setApp_scheduling_group__c("app_scheduling_group");
			ap.setApp_performance_agency__c("app_performance_agency");
			ap.setHcr_department_code__c("hcr_department_code");
			ap.setEmail_notification_rich_text_2__c("email_notificationrichtext_2");
			ap.setPart_2_completed__c(true);
			ap.setConnectionsentid("consentid");
			ap.setAppointment_2__c(ts);
			ap.setNational_id_type_ps__c("national_id_type_ps");
			ap.setRehire_eligibility_audit__c("rehireelbty_audit");
			ap.setHcr_number__c("hcr_number");
			ap.setShift_comments__c("shift_comments");
			ap.setCurrency_ps__c("currency_ps");
			ap.setAppointment_1__c(ts);
			ap.setLegacy_taleo_hire_end_date__c(fromdate);
			ap.setApplication_shift_description__c("applicationsftdescription");
			ap.setCandidatesfdcid__c("candidatesfdcid");
			ap.setHr_requistion_id__c("hr_requistion_id");
			ap.setLastactivitydate(fromdate);
			ap.setSpoken_overall__c("spoken_overall");
			ap.setPreferred_location_description__c("preferredlocdescription");
			ap.setFirst_available_start_date__c(fromdate);
			ap.setApp_performance_points__c((float) 4.67);
			ap.setHcr_location_state__c("hcr_location_state");
			ap.setCurrent_appointment_number__c("current_appointment_number");
			ap.setPan_candidate_attempt__c((float) 6.77);
			ap.setMost_recent_substep_change_datetime__c(ts);
			ap.setTier_3_interview_results__c("tier_3_interview_results");
			ap.setPan_package_id_trigger__c("pan_package_id_trigger");
			ap.setContract_signer_name_ps__c("contract_signer_name_ps");
			ap.setHr_matched__c((float) 7.8);
			ap.setApp_languagelocalekey__c("app_languagelocalekey");
			ap.setHr_business_title__c("hr_business_title");
			ap.setBgc_disclosure__c("bgc_disclosure");
			ap.setContingent_offer_accepted__c(ts);
			ap.setContingent_offer_shift_code_description__c("contingentoff_code_description");
			ap.setHcr_hire_start_date__c(fromdate);
			ap.setAgency_source_ps__c("agency_source_ps");
			ap.setApp_languagecountrycode__c("applgcountrycode");
			ap.setInterview_completed__c("interview_completed");
			ap.setTier_1_interview_results__c("tier_1_interview_results");
			ap.setLegacy_taleo_scheduling_information__c("legacy_taleoshinformation");
			ap.setHcr_location_city__c("hcr_location_city");
			ap.setEmail_template_name__c("email_template_name");
			ap.setApp_overall_percentile__c((float) 6.7);
			ap.setReq_hourly_rate__c("req_hourly_rate");
			ap.setOverride_bgc_validation__c(true);
			ap.setAppointment_4_interview_results__c("appointment_4_interview_results");
			ap.setCreateddate(ts);
			ap.setHr_shift_differential__c("hr_shift_differential");
			ap.setBackgroundcheckstatus__c("bgcheckstatus");
			ap.setSubstep__c("substep");
			ap.setDuplicate_contact__c("duplinta");
			ap.setEsignaturepart2__c("esignaturepart2");
			ap.setApplication_submitted__c(true);
			ap.setStock_ps__c("stock_ps");
			ap.setOrder_id__c("order_id");
			ap.setSuppress_screening_validation__c(true);
			ap.setHcr_manager_emp_id__c("hcr_manager_emp_id");
			ap.setHire_start_date_ps__c("hire_start_date_ps");
			ap.setLegacy_taleo_hours_worked__c((float) 6.7);
			ap.setStep__c("step");
			ap.setPreferred_last_name_ps__c("preferredlstnameps");
			ap.setPaybasis_ps__c("paybasis_ps");
			ap.setSource_other__c("source_other");
			ap.setDate_component__c("date_component");
			ap.setTranslated_requisition_title__c("translated_requisition_title");
			ap.setTagged__c(true);
			ap.setAppointment_3_interview_results__c("appointmentinterview_results");
			ap.setLocation_country__c("location_country");
			ap.setInformatica_key__c("informatica_key");
			ap.setAppointment_2_interview_results__c("appointmentinterview_results");
			ap.setWorkflow_name__c("workflow_name");
			ap.setLocation_code_ps__c("location_code_ps");
			ap.setOffer_out__c((float) 7.6);
			ap.setNo_show_count__c((float) 5.78);
			ap.setEsignature_read_general__c("esignature_read_general");
			ap.setTranslated_address__c("translated_address");
			ap.setNo_show_indicator__c(true);
			ap.setMatched_onbase__c("matched_onbase");
			ap.setPay_rate_ps__c("pay_rate_ps");
			ap.setReq_bypass_scheduling__c(true);
			ap.setHr_shift_description__c("hrdescription");
			ap.setShift_differential_ps__c("shiftdiff_ps");
			ap.setLegacy_taleo_app_interview_info_de__c("legacyapp_intinfo_de");
			ap.setPreferred_first_name_ps__c("preferred_first_name_ps");
			ap.setAppointment_1_interview_results__c("appointmentinterview_results");
			ap.setAppointment_start_time__c(ts);
			ap.setLocation_address_line2__c("location_address_line2");
			ap.setConnectionreceivedid("conrecid");
			ap.setBackground_check_initiation_date__c(fromdate);
			ap.setHr_alps_code__c("hr_alps_code");
			ap.setLegacy_taleo_orientation_date__c(fromdate);
			ap.setApp_my_job_status__c("app_my_job_status");
			ap.setApp_performance_pool__c("app_perpool");
			ap.setCreatedbyid("createdbyid");
			ap.setNationalidcountry__c("nationalidcountry");
			ap.setCandidateidsearchsupport__c("candisupport");
			ap.setSpecial_skills__c("special_skills");
			ap.setApp_performance_counsel__c("app_performance_counsel");
			ap.setLegacy_taleo_fclm_job__c("legtaljob");
			ap.setIs_node_application__c(true);
			ap.setLegacy_taleo_pool__c("A");
			ap.setLocation_address_line1__c("location_address_line1");
			ap.setTranslated_directions_instructions__c("translateddirinstructions");
			ap.setHr_location_description__c("hr_location_description");
			ap.setBypassed_cultural_assessment__c(true);
			ap.setSubsource_ps__c("subsource_ps");
			ap.setAssessmentoverallscore__c("assessmelscore");
			ap.setHr_department__c("hr_department");
			ap.setAmazon_rejects_detail_picklist__c("amazonamzrejectspicklist");
			ap.setMaster_shift_code__c("master_shift_code");
			ap.setOperation__c("operation");
			ap.setReq_education__c(true);
			ap.setSource_ps__c("source_ps");
			ap.setRequisition_function_ps__c("requisition_function_ps");
			ap.setCreateddateclone__c(ts);
			ap.setSubstep_duration__c((float) 5.6);
			ap.setLocation_state__c("location_state");
			ap.setNationalidtype__c("nationalidtype");
			ap.setHcr_finance_week_number__c((float) 6.5);
			ap.setAlps_code_description_ps__c("alps_code_description_ps");
			ap.setMy_job_status__c("my_job_status");
			ap.setLast_modified_date_ps__c("last_modified_date_ps");
			ap.setLegacy_taleo_amp_eligibility__c("legacytal_amp_eligibility");
			ap.setNumber_of_appointments__c((float) 6.87);
			ap.setLastreferenceddate(ts);
			ap.setJob_page_label__c("job_page_label");
			ap.setActive__c(true);
			ap.setMy_job_status_canada__c("my_job_status_canada");
			ap.setEmail_notification_prompt_1_text__c("emailnotiprompt_1_text");
			ap.setApp_candidate_name__c("app_candidate_name");
			ap.setCandidateaccountid__c("cdaccountid");
			ap.setHcr_orientation_date__c(fromdate);
			ap.setWritten_overall__c("written_overall");
			ap.setOrientation_date_ps__c("orientation_date_ps");
			ap.setRequisition_type_ps__c("requisitionps");
			ap.setHire_end_date_ps__c("hire_end_date_ps");
			ap.setLegacy_taleo_step_substep__c("legacy_taleo_step_substep");
			ap.setEmail_notification_prompt_datetime__c(ts);
			ap.setAgency_name__c("agency_name");
			ap.setAlps_code_ps__c("alps_code_ps");
			ap.setEmail_notification_prompt_memo__c("email_notificationmemo");
			ap.setAgency_req__c(true);
			ap.setMatched__c(true);
			ap.setFelony_conviction_question_2__c("felony_conviction_question_2");
			ap.setPanerrorcount__c((float) 5.66);
			ap.setEmail_template_formatted_address_label__c("email_templateaddress_label");
			ap.setLegacy_taleo_shift_differential__c("legtashdi");
			ap.setAcknowledge_no_attachment_provided__c(true);
			ap.setEmail_notification_prompt_2_text__c("email_notification2_text");
			ap.setAmzr_error_status__c("amzrstatus");
			ap.setSfid("sfid" + i);
			ap.setId(Long.valueOf(i));
			ap.set_hc_lastop("_hc_lastop");
			ap.set_hc_err("_hc_err");
			ap.setNode_bgc_bypass_for_hire__c(true);
			ap.setInterview_result__c("interview_result");
			ap.setHrloggedascanddiate__c(true);
			ap.setBgc_california_disclosure_fcra__c(true);
			ap.setEmail_notification_prompt_datetime_str__c("emailprompt_datetime_str");
			ap.setI9_enabled__c(true);
			ap.setBgc_california_disclosure_icraa__c(true);
			ap.setVirtual_new_hire_event__c("virtual_new_hire_event");
			ap.setSp_q2_first_response__c("sp_q2_first_response");
			ap.setIs_papi_enabled__c(true);
			ap.setComms_override_nacf_t1_node__c("comms_override_nacf_t1_node");
			ap.setCandidate_last_name_kanji__c("candidate_last_name_kanji");
			ap.setSp_q1_first_response__c("sp_q1_first_response");
			ap.setInclined_value__c("inclined_value");
			ap.setNational_id_type__c("national_id_type");
			ap.setSp_q3_first_response__c("sp_q3_first_response");
			ap.setCandidate_first_name_kanji__c("candidate_first_name_kanji");
			lstApl.add(ap);
		}
		herokuDataDao.insertApplicationData(lstApl);
	}
	/**
	 * creating list of Assessment objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertAssessmentData() {
		// TODO Auto-generated method stub
		List<Assessment> lstAsmt = new ArrayList<Assessment>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			Assessment as = new Assessment();

			as.setId(Long.valueOf(i));
			as.setAssessment_type__c("Asstype" + i);
			as.setSfid("sfid" + i);
			as.setLastmodifieddate(ts);
			as.setReplicate_screening__c("replicate");
			as.setParent_screening__c("parents");
			as.setLastreferenceddate(ts);
			as.setApplication_requisition__c("Applicatrion");
			as.setName("Name" + i);
			as.setConnectionsentid("consentid" + i);
			as.setCandidate__c("candidate"+i);
			as.setCreatedbyid("CreatedByid");
			as.setExpired_checkbox__c(true);
			as.setRecordtypeid("recordtypeid");
			as.setConnectionreceivedid("Conreceivedid");
			as.setLast_asr_request_date__c(fromdate);
			as.setApplication__c("App" + i);
			as.setScore_name__c("scorename");
			as.setInitiation_date__c(fromdate);
			as.setStatus_date__c(fromdate);
			as.setIs_international_bgc__c(true);
			as.setError_detail_long__c("errordetaillongc" + i);
			as.set_hc_lastop("hclasttop" + i);
			as.set_hc_err("hcerror" + i);
			as.setIsdeleted(true);
			as.setApplication_workflow_details__c("appwork" + i);
			as.setLegacy_taleo_provider_status__c("legacytaleo");
			as.setLegacy_taleo_screening_requester__c("legtalequester");
			as.setLastvieweddate(ts);
			as.setError_detail__c("errordetailsc" + i);
			as.setAccurate_screening_check__c((float) 6.777);
			as.setSystemmodstamp(ts);
			as.setReceipt_id__c("receiptidc" + i);
			as.setExpirationdate__c(fromdate);
			as.setOriginal_external_order_id__c("origextrnalord");
			as.setX15_day_screening_validator__c(true);
			as.setCurrent_pan_score__c("currentpanscore");
			as.setOverall_score__c("overall" + i);
			as.setUs_candidate__c(true);
			as.setInvalidated_screening__c(true);
			as.setCreateddate(ts);
			as.setOrder_id__c("orderidc" + i);
			as.setStatus__c("statusc" + i);
			as.setLastmodifiedbyid("lastmodbyid" + i);
			as.setScreening_pan_package_id__c("screanpackge");

			as.setAdpinitiatescreeningurl__c("adpinreeningurl");
			as.setBgc_expire_mismatch__c(true);
			as.setAdpscreeningid__c("adpscreeningid" + i);
			as.setSection1_complete_dt__c(fromdate);
			as.setTerm_date__c(fromdate);
			as.setI9_status__c("I9status" + i);
			as.setI9_master_status__c("i9masts");
			as.setCheck_rehire__c(true);
			as.setNo_of_retries__c((float) 6.778);
			as.setForm_id__c((float) 7.43);
			as.setMaster_status__c("masterstatus");
			as.setI9_id_type__c("i9idtype" + i);
			as.setPrevious_i9_status_number__c((float) 8.34);
			as.setI9_prior_master_status__c("i9prirma");
			as.setAirport__c("airport" + i);
			as.setI9_id__c((float) 8.45);
			as.setI9_complete__c(true);
			as.setI9_status_number__c((float) 8.45);
			as.setSection3_complete_dt__c(fromdate);
			as.setSection2_complete_dt__c(fromdate);
			as.setHas_candidate_screenings__c(true);

			lstAsmt.add(as);
		}
		herokuDataDao.insertAssessmentData(lstAsmt);

	}
	/**
	 * creating list of EmailMessage objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertEmailMessageData() {
		// TODO Auto-generated method stub
		List<EmailMessage> lstEmms = new ArrayList<EmailMessage>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			EmailMessage em = new EmailMessage();

			em.setLastmodifieddate(ts);
			em.setIstracked(true);
			em.setHeaders("headers" + i);
			em.setThreadidentifier("threa" + i);
			em.setActivityid("activityid" + i);
			em.setLastopeneddate(ts);
			em.setEmailtemplateid("emailtemp" + i);
			em.setIsexternallyvisible(true);
			em.setIsclientmanaged(true);
			em.setFromname("fromname" + i);
			em.setHasattachment(true);
			em.setFromaddress("fromadd" + i);
			em.setCreatedbyid("credbyid" + i);
			em.setIsopened(true);
			em.setCcaddress("ccadress" + i);
			em.setParentid("parentid" + i);
			em.setRelatedtoid("reltoid" + i);
			em.setStatus("status" + i);
			em.setMessagedate(ts);
			em.setIsdeleted(true);
			em.setIncoming(true);
			em.setIsbounced(true);
			em.setValidatedfromaddress("valfromadd" + i);
			em.setSubject("subject" + i);
			em.setSystemmodstamp(ts);
			em.setFirstopeneddate(ts);
			em.setTextbody("textbody" + i);
			em.setReplytoemailmessageid("repemaid" + i);
			em.setHtmlbody("htmlbody" + i);
			em.setCreateddate(ts);
			em.setBccaddress("bccaddr" + i);
			em.setMessageidentifier("mesnifier" + i);
			em.setLastmodifiedbyid("lastmodbyid" + i);
			em.setToaddress("toaddress" + i);
			em.setSfid("sfid" + i);
			em.setId(Long.valueOf(i));
			em.set_hc_lastop("hclast" + i);
			em.set_hc_err("hcerror" + i);

			lstEmms.add(em);
		}
		herokuDataDao.insertEmailMessageData(lstEmms);

	}
	/**
	 * creating list of Errorlog objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertErrorLogData() {
		// TODO Auto-generated method stub
		List<ErrorLog> lstErrlog = new ArrayList<ErrorLog>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			ErrorLog el = new ErrorLog();

			el.setException_stack_trace__c("Excon" + i);
			;
			el.setLastmodifieddate(ts);
			el.setIsdeleted(true);
			el.setException_message__c("excisage" + i);
			el.setException_type__c("exptypec" + i);
			el.setApex_class_name__c("apexcname" + i);
			el.setName("name" + i);
			el.setSystemmodstamp(ts);
			el.setConnectionsentid("consentid" + i);
			el.setOwnerid("ownerid" + i);
			el.setCreatedbyid("createdbyid" + i);
			el.setCreateddate(ts);
			el.setConnectionreceivedid("conrdid" + i);
			el.setException_line_number__c((float) 7.6);
			el.setLastmodifiedbyid("lastmoedby" + i);
			el.setRelated_application__c("App" + i);
			el.setSfid("sfid" + i);
			el.setId(Long.valueOf(i));
			el.set_hc_lastop("hclasttop" + i);
			el.set_hc_err("hcerror" + i);

			lstErrlog.add(el);
		}
		herokuDataDao.insertErrorLogData(lstErrlog);

	}
	/**
	 * creating list of IntegrationTransaction objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertIntegrationTransactionData() {
		// TODO Auto-generated method stub
		List<IntegrationTransaction> lstInttrans = new ArrayList<IntegrationTransaction>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			IntegrationTransaction it = new IntegrationTransaction();

			it.setLastmodifieddate(ts);
			;
			it.setTransaction_type__c("trantypec" + i);
			it.setLastreferenceddate(ts);
			it.setName("name" + i);
			it.setConnectionsentid("connsentid" + i);
			it.setTransaction_date_ff__c("txndate" + i);
			it.setCreatedbyid("createdbyid" + i);
			it.setConnectionreceivedid("connrecid" + i);
			it.setRequestor_id_ps__c("requs" + i);
			it.setNumber_of_attempts__c((float) 6.4);
			it.setIt_candidate__c("candidate" + i);
			it.setCreation_outside__c(true);
			it.setIt_application__c("App" + i);
			it.setOutbound_message__c("outboundmsg" + i);
			it.setIsdeleted(true);
			it.setError_summary__c("errosmary" + i);
			it.setIt_screening__c("itscreeningc" + i);
			it.setLastvieweddate(ts);
			it.setProcessed__c(true);
			it.setInbound_message__c("inboundmsg" + i);
			it.setSystem__c("systemc" + i);
			it.setError_detail__c("errordetails" + i);
			it.setSystemmodstamp(ts);
			it.setX15_minutes_from_now__c(ts);
			it.setTransaction_status__c("trastatus" + i);
			it.setCreateddate(ts);
			it.setLastactivitydate(fromdate);
			it.setEnvironment__c("envientc" + i);
			it.setLastmodifiedbyid("lasdbyid" + i);
			it.setTransaction_date__c(ts);
			it.setSfid("sfid" + i);
			it.set_hc_lastop("hclasttop" + i);
			it.set_hc_err("hcerror" + i);
			it.setNumber_of_noshows__c((float) 6.7);
			it.setIs_papi_enabled__c(true);
			it.setSystem_path__c("systathc" + i);
			it.setSub_status__c("substatus" + i);
			it.setId(Long.valueOf(i));

			lstInttrans.add(it);
		}
		herokuDataDao.insertIntegrationTransactionData(lstInttrans);

	}
	/**
	 * creating list of Interview objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertInterviewData() {
		// TODO Auto-generated method stub
		List<Interview> lstInterview = new ArrayList<Interview>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			Interview in = new Interview();

			in.setLastmodifieddate(ts);
			;
			in.setAppt_time_zone__c("appt one" + i);
			in.setAppt_end_time__c(ts);
			in.setSpecial_skills__c("speckills" + i);
			in.setName("name" + i);
			in.setCandidate__c("candidate" + i);
			in.setCreatedbyid("creatbyid" + i);
			in.setCandidate_last_name__c("candname" + i);
			in.setTimeslot__c("timeslot" + i);
			in.setGeneral_notes__c("genralnotes" + i);
			in.setRecruiting_event_type__c("reentype" + i);
			in.setAppt_start_datetime__c(ts);
			in.setIsdeleted(true);
			in.setAppt_recruiting_event_link__c("reentlink" + i);
			in.setLastvieweddate(ts);
			in.setTranslated_address__c("transadd" + i);
			in.setRequisition_id__c("requonid" + i);
			in.setCreateddate(ts);
			in.setAppointment_date__c(fromdate);
			in.setAppt_end_time_text__c("aptimetext" + i);
			in.setPool_substep__c("poobstep" + i);
			in.setActive__c(true);
			in.setAppt_timespan_number__c("timespanr" + i);
			in.setInterview_type__c("interwtype" + i);
			in.setAppt_start_date__c("appttdate" + i);

			in.setAppt_requisition_link__c("appqlink" + i);
			in.setScheduling_type__c("schuling" + i);
			in.setShift_comments__c("shifmments" + i);
			in.setInterview_question_set__c("intsset" + i);
			in.setEmail_template_name__c("emailtename" + i);
			in.setEvent_type__c("eventtype" + i);
			in.setLastreferenceddate(ts);
			in.setConnectionsentid("connsentid" + i);
			in.setAppt_status__c("apptstatus" + i);
			in.setCandidate_actual_time_zone__c("candat zone" + i);
			in.setCandidate_first_name__c("candfistname" + i);
			in.setConnectionreceivedid("conrecid" + i);
			in.setAppt_start_time_text__c("apptsttext" + i);
			in.setTranslated_directions_instructions__c("tranection	" + i);
			in.setApplication__c("App" + i);
			in.setAppt_end_date__c("appenddate" + i);
			in.setInterview_outcome__c("intecome" + i);
			in.setRole__c("role" + i);
			in.setCandidate_language__c("candluage" + i);
			in.setShift__c("shiftc" + i);
			in.setSystemmodstamp(ts);
			in.setAppt_address__c("apptaddr" + i);
			in.setUniqueness_validation_key__c("uniquidation" + i);
			in.setAppt_time_zone_key__c("appttimenekey" + i);
			in.setAppt_start_time__c(ts);
			in.setLastmodifiedbyid("lastfedbyid" + i);
			in.setCandidate_email__c("candemail" + i);
			in.setInterviewer__c("inteewr" + i);
			in.setId(Long.valueOf(i));
			in.set_hc_lastop("hclaop" + i);
			in.set_hc_err("hcerr" + i);
			in.setVirtual_new_hire_event__c("virtnewhire");
			in.setCid__c("Cid" + i);

			lstInterview.add(in);
		}
		herokuDataDao.insertInterviewData(lstInterview);

	}
	/**
	 * creating list of Note objects
	 *
	 * @return void
	 */ 
	@Override
	public void insertNoteData() {
		// TODO Auto-generated method stub
		List<Note> lstNotes = new ArrayList<Note>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			Note nt = new Note();

			nt.setBody("body" + i);
			;
			nt.setParentid("parentid" + i);
			nt.setLastmodifieddate(ts);
			nt.setOwnerid("ownerid" + i);
			nt.setIsdeleted(true);
			nt.setSystemmodstamp(ts);
			nt.setLastmodifiedbyid("lasyid" + i);
			nt.setCreateddate(ts);
			nt.setTitle("title" + i);
			nt.setIsprivate(true);
			nt.setCreatedbyid("crdbyid" + i);
			nt.setSfid("sfid" + i);
			nt.setId(Long.valueOf(i));
			nt.set_hc_lastop("hclastop" + i);
			nt.set_hc_err("hcerror" + i);

			lstNotes.add(nt);
		}
		herokuDataDao.insertNoteData(lstNotes);

	}
	
	/**
	 * creating list of Response objects
	 *
	 * @return void
	 */ 

	@Override
	public void insertResponseData() {
		// TODO Auto-generated method stub
		List<Response> lstResponse = new ArrayList<Response>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			Response rs = new Response();

			rs.setLastmodifieddate(ts);
			;
			rs.setQuestion_text__c("questxt" + i);
			rs.setDisqualifying_answer__c(true);
			rs.setLastreferenceddate(ts);
			rs.setInterviewer_comment__c("interment");
			rs.setResponse__c("response" + i);
			rs.setInterview__c("interviewc" + i);
			rs.setName("name" + i);
			rs.setConnectionsentid("consentid" + i);
			rs.setOwnerid("ownerid" + i);
			rs.setCreatedbyid("createdid" + i);
			rs.setConnectionreceivedid("coniedid" + i);
			rs.setApplication__c("App" + i);
			rs.setQuestion__c("Question" + i);
			rs.setIsdeleted(true);
			rs.setLegacy_taleo_qa_response_identifier__c("legacy" + i);

			rs.setLastvieweddate(ts);
			rs.setSystemmodstamp(ts);
			rs.setMeets_requirements__c("meetsreqmts" + i);
			rs.setQuestion_type__c("Questiontypec" + i);
			rs.setCompetency__c("competency" + i);
			rs.setCreateddate(ts);
			rs.setScore__c("score" + i);
			rs.setLastmodifiedbyid("lastmodified" + i);
			rs.setQuestion_html_type__c("Questionhtml" + i);
			rs.setSfid("sfid" + i);
			rs.setId(Long.valueOf(i));
			rs.set_hc_lastop("hclasttop" + i);
			rs.set_hc_err("hcerror" + i);
			rs.setRelated_field__c("relatedfield" + i);

			lstResponse.add(rs);
		}
		herokuDataDao.insertResponseData(lstResponse);

	}
	/**
	 * creating list of ResponseAnswer objects
	 *
	* @return void
	 */ 
	@Override
	public void insertResponseAnswerData() {
		// TODO Auto-generated method stub
		List<ResponseAnswer> lstResponseanswer = new ArrayList<ResponseAnswer>();
		Date d = new Date();
		java.sql.Date fromdate = new java.sql.Date(d.getTime());
		Timestamp ts = new Timestamp(d.getTime());
		for (int i = 0; i < 1000; i++) {
			ResponseAnswer rsa = new ResponseAnswer();

			rsa.setLastmodifieddate(ts);
			rsa.setIsdeleted(true);
			rsa.setAnswer__c("answer" + i);
			rsa.setResponse__c("response" + i);
			rsa.setName("name" + i);
			rsa.setSystemmodstamp(ts);
			rsa.setConnectionsentid("consentid" + i);
			rsa.setOwnerid("ownerid" + i);
			rsa.setCreatedbyid("createdid" + i);
			rsa.setCreateddate(ts);
			rsa.setConnectionreceivedid("conrviedid" + i);
			rsa.setLastmodifiedbyid("lastmedbyyid" + i);

			rsa.setSfid("sfid" + i);
			rsa.setId(Long.valueOf(i));
			rsa.set_hc_lastop("hclasttop" + i);
			rsa.set_hc_err("hcerror" + i);

			lstResponseanswer.add(rsa);
		}
		herokuDataDao.insertResponseAnswerData(lstResponseanswer);

	}
}
