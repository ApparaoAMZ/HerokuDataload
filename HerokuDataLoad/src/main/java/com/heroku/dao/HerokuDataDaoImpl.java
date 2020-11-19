package com.heroku.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.heroku.model.Application;
import com.heroku.model.Assessment;
import com.heroku.model.EmailMessage;
import com.heroku.model.ErrorLog;
import com.heroku.model.IntegrationTransaction;
import com.heroku.model.Interview;
import com.heroku.model.Note;
import com.heroku.model.Response;
import com.heroku.model.ResponseAnswer;

@Repository
public class HerokuDataDaoImpl implements HerokuDataDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertApplicationData(List<Application> apl) {

		int[] insertCounts = jdbcTemplate.batchUpdate(
				"insert into sf_archive.application__c (candidate__c,national_id_country_ps__c,more_than_one_application__c,legacy_taleo_external_id__c,felony_conviction_question_1__c,requisition_hiring_function__c,email_notification_prompt_3_text__c,bgc_authorization_1_date__c,hcr_hiring_manager_full_name__c,candidate_withdraws_detail__c,candidate_owner_id__c,requisition_reg_temp__c,app_performance_curve__c,tech_insight_score__c,us_candidate__c,legacy_taleo_fclm_area__c,createdfrompostcard__c,email_notification_prompt_4_text__c,bgc_authorization_2_date__c,app_performance_hours__c,peoplesoft_pre_processing_substep__c,most_recent_substep_change_date__c,hr_location_code__c,hr_manager_login__c,agency_subsource_ps__c,gender_ps__c,education_qualification_check__c,previous_step_substep__c,typing_accuracy__c,job_page_url__c,enable_concurrent_contingencies__c,application_esignature_date_time_part2__c,artdoc_candidate_id__c,sign_on_bonus_ps__c,application_esignature_date_time__c,phone_tool_title_ps__c,hcr_hiring_manager_title__c,in_invitation_extension_substep__c,req_auto_send_contingent_offer__c,app_performance_eligibility__c,legacy_taleo_overall_assessment__c,contingent_offer_extended__c,hr_requisition_title__c,cloned_due_to_process_on_other_req__c,workflow__c,backgroundcheckoverallscore__c,legacy_taleo_recruiter__c,typing_speed__c,hcr_day_1_day_ps__c,panattemptcount__c,order_id_override__c,hr_shift_code__c,node_requisition__c,hcr_orientation_session__c,headcount_request__c,bgc_disclosure_date__c,hr_open__c,hcr_location_address1__c,requisition_id__c,legacy_taleo_department_extension__c,businessunit_ps__c,source_details__c,source_primary__c,selected_shift__c,candidateid__c,sp_q1_response__c,appointment_search_filter_date__c,app_rehire_eligibility_status__c,hcr_orientation_date_ps__c,legacy_taleo_hiring_area_manager__c,legacy_taleo_shift_comments__c,career_portal_url__c,status_onbase__c,sp_q2_response__c,current_integration_step__c,acknowledge_no_work_experience__c,rpt_compare_start_date_with_day1__c,hire_back_dated_candidates_ps__c,requisition__c,sp_q3_response__c,legacy_taleo_submission_medium__c,selected_shift_valid__c,legacy_taleo_orientation_session__c,rewind__c,hr_hired__c,requisition_function__c,legacy_taleo_overall_percentile__c,my_job_status_global__c,bgc_disclosure_frca__c,lastvieweddate,email_notification_subject__c,account_employee_id__c,bgc_authorization2__c,ps_integration_enabled__c,owner_id_validator__c,hcr_location_postalcode__c,submitted_app_on_file__c,reschedule_count__c,agency_conversion_check__c,preferred_location_code__c,bgc_authorization1__c,my_job_status_de__c,app_my_job_status_global__c,free_consumer_report_requested__c,respects_special_jurisdiction__c,meets_education_requirement__c,step_substep__c,req_contingency_bypass__c,hr_requested__c,application_shift_code__c,backgroundchkexpirydate__c,work_flow_rule_trigger__c,current_mailing_state_province__c,salary_ps__c,letter_of_intent_selection__c,jobcode_ps__c,name,candidate_last_name__c,recruiter_employee_id__c,continue_application__c,hcr_department_description__c,bgc_disclosure_frca_esignature__c,drugtestoverallscore__c,location_postal_code__c,vcpprp_ps__c,pay_rate__c,contract_title_ps__c,role__c,stdhours_ps__c,hr_hiring_manager_name__c,app_language__c,hire_start_date__c,candidate_first_name__c,hr_day_1_day__c,letter_of_intent_completed_date__c,legacy_taleo_shift__c,conversion__c,lastmodifieddate,location_city__c,matching_location_code__c,application_withdrawn__c,hcr_hire_end_date__c,ownerid,tech_force_email_rule_execution__c,instance__c,requisition_title__c,appointment_4__c,phone_screen_results__c,requisition_location_code__c,in_manage_hire__c,best_suitable_skill__c,hcr_location_country__c,legacy_taleo_e_signature_ip__c,isdeleted,portal_application_status__c,background_check_counter__c,accurate_screening_check__c,legacy_taleo_application_creation_date__c,company_code_ps__c,hcr_request_id__c,appointment_3__c,legacy_taleo_correspondence_information__c,requisition_country__c,email_notification_body__c,systemmodstamp,drugtestexpirydate__c,lastmodifiedbyid,bypass_dt_bgc_validation__c,timeslots_available__c,app_scheduling_group__c,app_performance_agency__c,hcr_department_code__c,email_notification_rich_text_2__c,part_2_completed__c,connectionsentid,appointment_2__c,national_id_type_ps__c,rehire_eligibility_audit__c,hcr_number__c,shift_comments__c,currency_ps__c,appointment_1__c,legacy_taleo_hire_end_date__c,application_shift_description__c,candidatesfdcid__c,hr_requistion_id__c,lastactivitydate,spoken_overall__c,preferred_location_description__c,first_available_start_date__c,app_performance_points__c,hcr_location_state__c,current_appointment_number__c,pan_candidate_attempt__c,most_recent_substep_change_datetime__c,tier_3_interview_results__c,pan_package_id_trigger__c,contract_signer_name_ps__c,hr_matched__c,app_languagelocalekey__c,hr_business_title__c,bgc_disclosure__c,contingent_offer_accepted__c,contingent_offer_shift_code_description__c,hcr_hire_start_date__c,agency_source_ps__c,app_languagecountrycode__c,interview_completed__c,tier_1_interview_results__c,legacy_taleo_scheduling_information__c,hcr_location_city__c,email_template_name__c,app_overall_percentile__c,req_hourly_rate__c,override_bgc_validation__c,appointment_4_interview_results__c,createddate,hr_shift_differential__c,backgroundcheckstatus__c,substep__c,duplicate_contact__c,esignaturepart2__c,application_submitted__c,stock_ps__c,order_id__c,suppress_screening_validation__c,hcr_manager_emp_id__c,hire_start_date_ps__c,legacy_taleo_hours_worked__c,step__c,preferred_last_name_ps__c,paybasis_ps__c,source_other__c,date_component__c,translated_requisition_title__c,tagged__c,appointment_3_interview_results__c,location_country__c,informatica_key__c,appointment_2_interview_results__c,workflow_name__c,location_code_ps__c,offer_out__c,no_show_count__c,esignature_read_general__c,translated_address__c,no_show_indicator__c,matched_onbase__c,pay_rate_ps__c,req_bypass_scheduling__c,hr_shift_description__c,shift_differential_ps__c,legacy_taleo_app_interview_info_de__c,preferred_first_name_ps__c,appointment_1_interview_results__c,appointment_start_time__c,location_address_line2__c,connectionreceivedid,background_check_initiation_date__c,hr_alps_code__c,legacy_taleo_orientation_date__c,app_my_job_status__c,app_performance_pool__c,createdbyid,nationalidcountry__c,candidateidsearchsupport__c,special_skills__c,app_performance_counsel__c,legacy_taleo_fclm_job__c,is_node_application__c,legacy_taleo_pool__c,location_address_line1__c,translated_directions_instructions__c,hr_location_description__c,bypassed_cultural_assessment__c,subsource_ps__c,assessmentoverallscore__c,hr_department__c,amazon_rejects_detail_picklist__c,master_shift_code__c,operation__c,req_education__c,source_ps__c,requisition_function_ps__c,createddateclone__c,substep_duration__c,location_state__c,nationalidtype__c,hcr_finance_week_number__c,alps_code_description_ps__c,my_job_status__c,last_modified_date_ps__c,legacy_taleo_amp_eligibility__c,number_of_appointments__c,lastreferenceddate,job_page_label__c,active__c,my_job_status_canada__c,email_notification_prompt_1_text__c,app_candidate_name__c,candidateaccountid__c,hcr_orientation_date__c,written_overall__c,orientation_date_ps__c,requisition_type_ps__c,hire_end_date_ps__c,legacy_taleo_step_substep__c,email_notification_prompt_datetime__c,agency_name__c,alps_code_ps__c,email_notification_prompt_memo__c,agency_req__c,matched__c,felony_conviction_question_2__c,panerrorcount__c,email_template_formatted_address_label__c,legacy_taleo_shift_differential__c,acknowledge_no_attachment_provided__c,email_notification_prompt_2_text__c,amzr_error_status__c,sfid,id,_hc_lastop,_hc_err,node_bgc_bypass_for_hire__c,interview_result__c,hrloggedascanddiate__c,bgc_california_disclosure_fcra__c,email_notification_prompt_datetime_str__c,i9_enabled__c,bgc_california_disclosure_icraa__c,virtual_new_hire_event__c,sp_q2_first_response__c,is_papi_enabled__c,comms_override_nacf_t1_node__c,candidate_last_name_kanji__c,sp_q1_first_response__c,inclined_value__c,national_id_type__c,sp_q3_first_response__c,candidate_first_name_kanji__c\r\n"
						+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\r\n"
						+ ")",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, apl.get(i).getCandidate__c());
						ps.setString(2, apl.get(i).getNational_id_country_ps__c());
						ps.setBoolean(3, apl.get(i).isMore_than_one_application__c());
						ps.setString(4, apl.get(i).getLegacy_taleo_external_id__c());
						ps.setString(5, apl.get(i).getFelony_conviction_question_1__c());
						ps.setString(6, apl.get(i).getRequisition_hiring_function__c());
						ps.setString(7, apl.get(i).getEmail_notification_prompt_3_text__c());
						ps.setTimestamp(8, apl.get(i).getBgc_authorization_1_date__c());
						ps.setString(9, apl.get(i).getHcr_hiring_manager_full_name__c());
						ps.setString(10, apl.get(i).getCandidate_withdraws_detail__c());
						ps.setString(11, apl.get(i).getCandidate_owner_id__c());
						ps.setString(12, apl.get(i).getRequisition_reg_temp__c());
						ps.setFloat(13, apl.get(i).getApp_performance_curve__c());
						ps.setString(14, apl.get(i).getTech_insight_score__c());
						ps.setBoolean(15, apl.get(i).isUs_candidate__c());
						ps.setString(16, apl.get(i).getLegacy_taleo_fclm_area__c());
						ps.setBoolean(17, apl.get(i).isCreatedfrompostcard__c());
						ps.setString(18, apl.get(i).getEmail_notification_prompt_4_text__c());
						ps.setTimestamp(19, apl.get(i).getBgc_authorization_2_date__c());
						ps.setFloat(20, apl.get(i).getApp_performance_hours__c());
						ps.setBoolean(21, apl.get(i).isPeoplesoft_pre_processing_substep__c());
						ps.setDate(22, apl.get(i).getMost_recent_substep_change_date__c());
						ps.setString(23, apl.get(i).getHr_location_code__c());
						ps.setString(24, apl.get(i).getHr_manager_login__c());
						ps.setString(25, apl.get(i).getAgency_subsource_ps__c());
						ps.setString(26, apl.get(i).getGender_ps__c());
						ps.setBoolean(27, apl.get(i).isEducation_qualification_check__c());
						ps.setString(28, apl.get(i).getPrevious_step_substep__c());
						ps.setString(29, apl.get(i).getTyping_accuracy__c());
						ps.setString(30, apl.get(i).getJob_page_url__c());
						ps.setBoolean(31, apl.get(i).isEnable_concurrent_contingencies__c());
						ps.setTimestamp(32, apl.get(i).getApplication_esignature_date_time_part2__c());
						ps.setString(33, apl.get(i).getArtdoc_candidate_id__c());
						ps.setString(34, apl.get(i).getSign_on_bonus_ps__c());
						ps.setTimestamp(35, apl.get(i).getApplication_esignature_date_time__c());
						ps.setString(36, apl.get(i).getPhone_tool_title_ps__c());
						ps.setString(37, apl.get(i).getHcr_hiring_manager_title__c());
						ps.setBoolean(38, apl.get(i).isIn_invitation_extension_substep__c());
						ps.setString(39, apl.get(i).getReq_auto_send_contingent_offer__c());
						ps.setString(40, apl.get(i).getApp_performance_eligibility__c());
						ps.setString(41, apl.get(i).getLegacy_taleo_overall_assessment__c());
						ps.setTimestamp(42, apl.get(i).getContingent_offer_extended__c());
						ps.setString(43, apl.get(i).getHr_requisition_title__c());
						ps.setBoolean(44, apl.get(i).isCloned_due_to_process_on_other_req__c());
						ps.setString(45, apl.get(i).getWorkflow__c());
						ps.setString(46, apl.get(i).getBackgroundcheckoverallscore__c());
						ps.setString(47, apl.get(i).getLegacy_taleo_recruiter__c());
						ps.setString(48, apl.get(i).getTyping_speed__c());
						ps.setString(49, apl.get(i).getHcr_day_1_day_ps__c());
						ps.setFloat(50, apl.get(i).getPanattemptcount__c());
						ps.setString(51, apl.get(i).getOrder_id_override__c());
						ps.setString(52, apl.get(i).getHr_shift_code__c());
						ps.setString(53, apl.get(i).getNode_requisition__c());
						ps.setString(54, apl.get(i).getHcr_orientation_session__c());
						ps.setString(55, apl.get(i).getHeadcount_request__c());
						ps.setTimestamp(56, apl.get(i).getBgc_disclosure_date__c());
						ps.setFloat(57, apl.get(i).getHr_open__c());
						ps.setString(58, apl.get(i).getHcr_location_address1__c());
						ps.setString(59, apl.get(i).getRequisition_id__c());
						ps.setString(60, apl.get(i).getLegacy_taleo_department_extension__c());
						ps.setString(61, apl.get(i).getBusinessunit_ps__c());
						ps.setString(62, apl.get(i).getSource_details__c());
						ps.setString(63, apl.get(i).getSource_primary__c());
						ps.setString(64, apl.get(i).getSelected_shift__c());
						ps.setString(65, apl.get(i).getCandidateid__c());
						ps.setString(66, apl.get(i).getSp_q1_response__c());
						ps.setDate(67, apl.get(i).getAppointment_search_filter_date__c());
						ps.setString(68, apl.get(i).getApp_rehire_eligibility_status__c());
						ps.setString(69, apl.get(i).getHcr_orientation_date_ps__c());
						ps.setString(70, apl.get(i).getLegacy_taleo_hiring_area_manager__c());
						ps.setString(71, apl.get(i).getLegacy_taleo_shift_comments__c());
						ps.setString(72, apl.get(i).getCareer_portal_url__c());
						ps.setString(73, apl.get(i).getStatus_onbase__c());
						ps.setString(74, apl.get(i).getSp_q2_response__c());
						ps.setString(75, apl.get(i).getCurrent_integration_step__c());
						ps.setBoolean(76, apl.get(i).isAcknowledge_no_work_experience__c());
						ps.setString(77, apl.get(i).getRpt_compare_start_date_with_day1__c());
						ps.setString(78, apl.get(i).getHire_back_dated_candidates_ps__c());
						ps.setString(79, apl.get(i).getRequisition__c());
						ps.setString(80, apl.get(i).getSp_q3_response__c());
						ps.setString(81, apl.get(i).getLegacy_taleo_submission_medium__c());
						ps.setBoolean(82, apl.get(i).isSelected_shift_valid__c());
						ps.setString(83, apl.get(i).getLegacy_taleo_orientation_session__c());
						ps.setBoolean(84, apl.get(i).isRewind__c());
						ps.setFloat(85, apl.get(i).getHr_hired__c());
						ps.setString(86, apl.get(i).getRequisition_function__c());
						ps.setFloat(87, apl.get(i).getLegacy_taleo_overall_percentile__c());
						ps.setString(88, apl.get(i).getMy_job_status_global__c());
						ps.setString(89, apl.get(i).getBgc_disclosure_frca__c());
						ps.setTimestamp(90, apl.get(i).getLastvieweddate());
						ps.setString(91, apl.get(i).getEmail_notification_subject__c());
						ps.setString(92, apl.get(i).getAccount_employee_id__c());
						ps.setString(93, apl.get(i).getBgc_authorization2__c());
						ps.setBoolean(94, apl.get(i).isPs_integration_enabled__c());
						ps.setBoolean(95, apl.get(i).isOwner_id_validator__c());
						ps.setString(96, apl.get(i).getHcr_location_postalcode__c());
						ps.setBoolean(97, apl.get(i).isSubmitted_app_on_file__c());
						ps.setFloat(98, apl.get(i).getReschedule_count__c());
						ps.setBoolean(99, apl.get(i).isAgency_conversion_check__c());
						ps.setString(100, apl.get(i).getPreferred_location_code__c());
						ps.setString(101, apl.get(i).getBgc_authorization1__c());
						ps.setString(102, apl.get(i).getMy_job_status_de__c());
						ps.setString(103, apl.get(i).getApp_my_job_status_global__c());
						ps.setBoolean(104, apl.get(i).isFree_consumer_report_requested__c());
						ps.setBoolean(105, apl.get(i).isRespects_special_jurisdiction__c());
						ps.setBoolean(106, apl.get(i).isMeets_education_requirement__c());
						ps.setString(107, apl.get(i).getStep_substep__c());
						ps.setBoolean(108, apl.get(i).isReq_bypass_scheduling__c());
						ps.setFloat(109, apl.get(i).getHr_requested__c());
						ps.setString(110, apl.get(i).getApplication_shift_code__c());
						ps.setDate(111, apl.get(i).getBackgroundchkexpirydate__c());
						ps.setString(112, apl.get(i).getWork_flow_rule_trigger__c());
						ps.setString(113, apl.get(i).getCurrent_mailing_state_province__c());
						ps.setString(114, apl.get(i).getSalary_ps__c());
						ps.setString(115, apl.get(i).getLetter_of_intent_selection__c());
						ps.setString(116, apl.get(i).getJobcode_ps__c());
						ps.setString(117, apl.get(i).getName());
						ps.setString(118, apl.get(i).getCandidate_last_name__c());
						ps.setString(119, apl.get(i).getRecruiter_employee_id__c());
						ps.setString(120, apl.get(i).getContinue_application__c());
						ps.setString(121, apl.get(i).getHcr_department_description__c());
						ps.setString(122, apl.get(i).getBgc_disclosure_frca_esignature__c());
						ps.setString(123, apl.get(i).getDrugtestoverallscore__c());
						ps.setString(124, apl.get(i).getLocation_postal_code__c());
						ps.setString(125, apl.get(i).getVcpprp_ps__c());
						ps.setFloat(126, apl.get(i).getPay_rate__c());
						ps.setString(127, apl.get(i).getContract_title_ps__c());
						ps.setString(128, apl.get(i).getRole__c());
						ps.setString(129, apl.get(i).getStdhours_ps__c());
						ps.setString(130, apl.get(i).getHr_hiring_manager_name__c());
						ps.setString(131, apl.get(i).getApp_language__c());
						ps.setDate(132, apl.get(i).getHire_start_date__c());
						ps.setString(133, apl.get(i).getCandidate_first_name__c());
						ps.setDate(134, apl.get(i).getHr_day_1_day__c());
						ps.setDate(135, apl.get(i).getLetter_of_intent_completed_date__c());
						ps.setString(136, apl.get(i).getLegacy_taleo_shift__c());
						ps.setBoolean(137, apl.get(i).isConversion__c());
						ps.setTimestamp(138, apl.get(i).getLastmodifieddate());
						ps.setString(139, apl.get(i).getLocation_city__c());
						ps.setString(140, apl.get(i).getMatching_location_code__c());
						ps.setBoolean(141, apl.get(i).isApplication_withdrawn__c());
						ps.setDate(142, apl.get(i).getHcr_hire_end_date__c());
						ps.setString(143, apl.get(i).getOwnerid());
						ps.setBoolean(144, apl.get(i).isTech_force_email_rule_execution__c());
						ps.setString(145, apl.get(i).getInstance__c());
						ps.setString(146, apl.get(i).getRequisition_title__c());
						ps.setTimestamp(147, apl.get(i).getAppointment_4__c());
						ps.setString(148, apl.get(i).getPhone_screen_results__c());
						ps.setString(149, apl.get(i).getRequisition_location_code__c());
						ps.setBoolean(150, apl.get(i).isIn_manage_hire__c());
						ps.setString(151, apl.get(i).getBest_suitable_skill__c());
						ps.setString(152, apl.get(i).getHcr_location_country__c());
						ps.setString(153, apl.get(i).getLegacy_taleo_e_signature_ip__c());
						ps.setBoolean(154, apl.get(i).isIsdeleted());
						ps.setString(155, apl.get(i).getPortal_application_status__c());
						ps.setString(156, apl.get(i).getBackground_check_counter__c());
						ps.setFloat(157, apl.get(i).getAccurate_screening_check__c());
						ps.setDate(158, apl.get(i).getLegacy_taleo_application_creation_date__c());
						ps.setString(159, apl.get(i).getCompany_code_ps__c());
						ps.setString(160, apl.get(i).getHcr_request_id__c());
						ps.setTimestamp(161, apl.get(i).getAppointment_3__c());
						ps.setString(162, apl.get(i).getLegacy_taleo_correspondence_information__c());
						ps.setString(163, apl.get(i).getRequisition_country__c());
						ps.setString(164, apl.get(i).getEmail_notification_body__c());
						ps.setTimestamp(165, apl.get(i).getSystemmodstamp());
						ps.setDate(166, apl.get(i).getDrugtestexpirydate__c());
						ps.setString(167, apl.get(i).getLastmodifiedbyid());
						ps.setBoolean(168, apl.get(i).isBypass_dt_bgc_validation__c());
						ps.setBoolean(169, apl.get(i).isTimeslots_available__c());
						ps.setString(170, apl.get(i).getApp_scheduling_group__c());
						ps.setString(171, apl.get(i).getApp_performance_agency__c());
						ps.setString(172, apl.get(i).getHcr_department_code__c());
						ps.setString(173, apl.get(i).getEmail_notification_rich_text_2__c());
						ps.setBoolean(174, apl.get(i).isPart_2_completed__c());
						ps.setString(175, apl.get(i).getConnectionsentid());
						ps.setTimestamp(176, apl.get(i).getAppointment_2__c());
						ps.setString(177, apl.get(i).getNational_id_type_ps__c());
						ps.setString(178, apl.get(i).getRehire_eligibility_audit__c());
						ps.setString(179, apl.get(i).getHcr_number__c());
						ps.setString(180, apl.get(i).getShift_comments__c());
						ps.setString(181, apl.get(i).getCurrency_ps__c());
						ps.setTimestamp(182, apl.get(i).getAppointment_1__c());
						ps.setDate(183, apl.get(i).getLegacy_taleo_hire_end_date__c());
						ps.setString(184, apl.get(i).getApplication_shift_description__c());
						ps.setString(185, apl.get(i).getCandidatesfdcid__c());
						ps.setString(186, apl.get(i).getHr_requistion_id__c());
						ps.setDate(187, apl.get(i).getLastactivitydate());
						ps.setString(188, apl.get(i).getSpoken_overall__c());
						ps.setString(189, apl.get(i).getPreferred_location_description__c());
						ps.setDate(190, apl.get(i).getFirst_available_start_date__c());
						ps.setFloat(191, apl.get(i).getApp_performance_points__c());
						ps.setString(192, apl.get(i).getHcr_location_state__c());
						ps.setString(193, apl.get(i).getCurrent_appointment_number__c());
						ps.setFloat(194, apl.get(i).getPan_candidate_attempt__c());
						ps.setTimestamp(195, apl.get(i).getMost_recent_substep_change_datetime__c());
						ps.setString(196, apl.get(i).getTier_3_interview_results__c());
						ps.setString(197, apl.get(i).getPan_package_id_trigger__c());
						ps.setString(198, apl.get(i).getContract_signer_name_ps__c());
						ps.setFloat(199, apl.get(i).getHr_matched__c());
						ps.setString(200, apl.get(i).getApp_languagelocalekey__c());
						ps.setString(201, apl.get(i).getHr_business_title__c());
						ps.setString(202, apl.get(i).getBgc_disclosure__c());
						ps.setTimestamp(203, apl.get(i).getContingent_offer_accepted__c());
						ps.setString(204, apl.get(i).getContingent_offer_shift_code_description__c());
						ps.setDate(205, apl.get(i).getHcr_hire_start_date__c());
						ps.setString(206, apl.get(i).getAgency_source_ps__c());
						ps.setString(207, apl.get(i).getApp_languagecountrycode__c());
						ps.setString(208, apl.get(i).getInterview_completed__c());
						ps.setString(209, apl.get(i).getTier_1_interview_results__c());
						ps.setString(210, apl.get(i).getLegacy_taleo_scheduling_information__c());
						ps.setString(211, apl.get(i).getHcr_location_city__c());
						ps.setString(212, apl.get(i).getEmail_template_name__c());
						ps.setFloat(213, apl.get(i).getApp_overall_percentile__c());
						ps.setString(214, apl.get(i).getReq_hourly_rate__c());
						ps.setBoolean(215, apl.get(i).isOverride_bgc_validation__c());
						ps.setString(216, apl.get(i).getAppointment_4_interview_results__c());
						ps.setTimestamp(217, apl.get(i).getCreateddate());
						ps.setString(218, apl.get(i).getHr_shift_differential__c());
						ps.setString(219, apl.get(i).getBackgroundcheckstatus__c());
						ps.setString(220, apl.get(i).getSubstep__c());
						ps.setString(221, apl.get(i).getDuplicate_contact__c());
						ps.setString(222, apl.get(i).getEsignaturepart2__c());
						ps.setBoolean(223, apl.get(i).isApplication_submitted__c());
						ps.setString(224, apl.get(i).getStock_ps__c());
						ps.setString(225, apl.get(i).getOrder_id__c());
						ps.setBoolean(226, apl.get(i).isSuppress_screening_validation__c());
						ps.setString(227, apl.get(i).getHcr_manager_emp_id__c());
						ps.setString(228, apl.get(i).getHire_start_date_ps__c());
						ps.setFloat(229, apl.get(i).getLegacy_taleo_hours_worked__c());
						ps.setString(230, apl.get(i).getStep__c());
						ps.setString(231, apl.get(i).getPreferred_last_name_ps__c());
						ps.setString(232, apl.get(i).getPaybasis_ps__c());
						ps.setString(233, apl.get(i).getSource_other__c());
						ps.setString(234, apl.get(i).getDate_component__c());
						ps.setString(235, apl.get(i).getTranslated_requisition_title__c());
						ps.setBoolean(236, apl.get(i).isTagged__c());
						ps.setString(237, apl.get(i).getAppointment_3_interview_results__c());
						ps.setString(238, apl.get(i).getLocation_country__c());
						ps.setString(239, apl.get(i).getInformatica_key__c());
						ps.setString(240, apl.get(i).getAppointment_2_interview_results__c());
						ps.setString(241, apl.get(i).getWorkflow_name__c());
						ps.setString(242, apl.get(i).getLocation_code_ps__c());
						ps.setFloat(243, apl.get(i).getOffer_out__c());
						ps.setFloat(244, apl.get(i).getNo_show_count__c());
						ps.setString(245, apl.get(i).getEsignature_read_general__c());
						ps.setString(246, apl.get(i).getTranslated_address__c());
						ps.setBoolean(247, apl.get(i).isNo_show_indicator__c());
						ps.setString(248, apl.get(i).getMatched_onbase__c());
						ps.setString(249, apl.get(i).getPay_rate_ps__c());
						ps.setBoolean(250, apl.get(i).isReq_bypass_scheduling__c());
						ps.setString(251, apl.get(i).getHr_shift_description__c());
						ps.setString(252, apl.get(i).getShift_differential_ps__c());
						ps.setString(253, apl.get(i).getLegacy_taleo_app_interview_info_de__c());
						ps.setString(254, apl.get(i).getPreferred_first_name_ps__c());
						ps.setString(255, apl.get(i).getAppointment_1_interview_results__c());
						ps.setTimestamp(256, apl.get(i).getAppointment_start_time__c());
						ps.setString(257, apl.get(i).getLocation_address_line2__c());
						ps.setString(258, apl.get(i).getConnectionreceivedid());
						ps.setDate(259, apl.get(i).getBackground_check_initiation_date__c());
						ps.setString(260, apl.get(i).getHr_alps_code__c());
						ps.setDate(261, apl.get(i).getLegacy_taleo_orientation_date__c());
						ps.setString(262, apl.get(i).getApp_my_job_status__c());
						ps.setString(263, apl.get(i).getApp_performance_pool__c());
						ps.setString(264, apl.get(i).getCreatedbyid());
						ps.setString(265, apl.get(i).getNationalidcountry__c());
						ps.setString(266, apl.get(i).getCandidateidsearchsupport__c());
						ps.setString(267, apl.get(i).getSpecial_skills__c());
						ps.setString(268, apl.get(i).getApp_performance_counsel__c());
						ps.setString(269, apl.get(i).getLegacy_taleo_fclm_job__c());
						ps.setBoolean(270, apl.get(i).isIs_node_application__c());
						ps.setString(271, apl.get(i).getLegacy_taleo_pool__c());
						ps.setString(272, apl.get(i).getLocation_address_line1__c());
						ps.setString(273, apl.get(i).getTranslated_directions_instructions__c());
						ps.setString(274, apl.get(i).getHr_location_description__c());
						ps.setBoolean(275, apl.get(i).isBypassed_cultural_assessment__c());
						ps.setString(276, apl.get(i).getSubsource_ps__c());
						ps.setString(277, apl.get(i).getAssessmentoverallscore__c());
						ps.setString(278, apl.get(i).getHr_department__c());
						ps.setString(279, apl.get(i).getAmazon_rejects_detail_picklist__c());
						ps.setString(280, apl.get(i).getMaster_shift_code__c());
						ps.setString(281, apl.get(i).getOperation__c());
						ps.setBoolean(282, apl.get(i).isReq_education__c());
						ps.setString(283, apl.get(i).getSource_ps__c());
						ps.setString(284, apl.get(i).getRequisition_function_ps__c());
						ps.setTimestamp(285, apl.get(i).getCreateddateclone__c());
						ps.setFloat(286, apl.get(i).getSubstep_duration__c());
						ps.setString(287, apl.get(i).getLocation_state__c());
						ps.setString(288, apl.get(i).getNationalidtype__c());
						ps.setFloat(289, apl.get(i).getHcr_finance_week_number__c());
						ps.setString(290, apl.get(i).getAlps_code_description_ps__c());
						ps.setString(291, apl.get(i).getMy_job_status__c());
						ps.setString(292, apl.get(i).getLast_modified_date_ps__c());
						ps.setString(293, apl.get(i).getLegacy_taleo_amp_eligibility__c());
						ps.setFloat(294, apl.get(i).getNumber_of_appointments__c());
						ps.setTimestamp(295, apl.get(i).getLastreferenceddate());
						ps.setString(296, apl.get(i).getJob_page_label__c());
						ps.setBoolean(297, apl.get(i).isActive__c());
						ps.setString(298, apl.get(i).getMy_job_status_canada__c());
						ps.setString(299, apl.get(i).getEmail_notification_prompt_1_text__c());
						ps.setString(300, apl.get(i).getApp_candidate_name__c());
						ps.setString(301, apl.get(i).getCandidateaccountid__c());
						ps.setDate(302, apl.get(i).getHcr_orientation_date__c());
						ps.setString(303, apl.get(i).getWritten_overall__c());
						ps.setString(304, apl.get(i).getOrientation_date_ps__c());
						ps.setString(305, apl.get(i).getRequisition_type_ps__c());
						ps.setString(306, apl.get(i).getHire_end_date_ps__c());
						ps.setString(307, apl.get(i).getLegacy_taleo_step_substep__c());
						ps.setTimestamp(308, apl.get(i).getEmail_notification_prompt_datetime__c());
						ps.setString(309, apl.get(i).getAgency_name__c());
						ps.setString(310, apl.get(i).getAlps_code_ps__c());
						ps.setString(311, apl.get(i).getEmail_notification_prompt_memo__c());
						ps.setBoolean(312, apl.get(i).isAgency_req__c());
						ps.setBoolean(313, apl.get(i).isMatched__c());
						ps.setString(314, apl.get(i).getFelony_conviction_question_2__c());
						ps.setFloat(315, apl.get(i).getPanerrorcount__c());
						ps.setString(316, apl.get(i).getEmail_template_formatted_address_label__c());
						ps.setString(317, apl.get(i).getLegacy_taleo_shift_differential__c());
						ps.setBoolean(318, apl.get(i).isAcknowledge_no_attachment_provided__c());
						ps.setString(319, apl.get(i).getEmail_notification_prompt_2_text__c());
						ps.setString(320, apl.get(i).getAmzr_error_status__c());
						ps.setString(321, apl.get(i).getSfid());
						ps.setLong(322, apl.get(i).getId());
						ps.setString(323, apl.get(i).get_hc_lastop());
						ps.setString(324, apl.get(i).get_hc_err());
						ps.setBoolean(325, apl.get(i).isNode_bgc_bypass_for_hire__c());
						ps.setString(326, apl.get(i).getInterview_result__c());
						ps.setBoolean(327, apl.get(i).isHrloggedascanddiate__c());
						ps.setBoolean(328, apl.get(i).isBgc_california_disclosure_fcra__c());
						ps.setString(329, apl.get(i).getEmail_notification_prompt_datetime_str__c());
						ps.setBoolean(330, apl.get(i).isI9_enabled__c());
						ps.setBoolean(331, apl.get(i).isBgc_california_disclosure_icraa__c());
						ps.setString(332, apl.get(i).getVirtual_new_hire_event__c());
						ps.setString(333, apl.get(i).getSp_q2_first_response__c());
						ps.setBoolean(334, apl.get(i).isIs_papi_enabled__c());
						ps.setString(335, apl.get(i).getComms_override_nacf_t1_node__c());
						ps.setString(336, apl.get(i).getCandidate_last_name_kanji__c());
						ps.setString(337, apl.get(i).getSp_q1_first_response__c());
						ps.setString(338, apl.get(i).getInclined_value__c());
						ps.setString(339, apl.get(i).getNational_id_type__c());
						ps.setString(340, apl.get(i).getSp_q3_first_response__c());
						ps.setString(341, apl.get(i).getCandidate_first_name_kanji__c());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return apl.size();
					}

				});
	}

	@Override
	public void insertAssessmentData(List<Assessment> assmt) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.assessment__c "
				+ "(id,assessment_type__c,sfid,lastmodifieddate,replicate_screening__c,parent_screening__c,lastreferenceddate,application_requisition__c,"
				+ "name,connectionsentid,candidate__c,createdbyid,expired_checkbox__c,recordtypeid,connectionreceivedid,last_asr_request_date__c,"
				+ "application__c,score_name__c,initiation_date__c,status_date__c,is_international_bgc__c,error_detail_long__c,_hc_lastop,_hc_err,isdeleted,"
				+ "application_workflow_details__c,legacy_taleo_provider_status__c,legacy_taleo_screening_requester__c,lastvieweddate,error_detail__c,"
				+ "accurate_screening_check__c,systemmodstamp,receipt_id__c,expirationdate__c,original_external_order_id__c,x15_day_screening_validator__c,"
				+ "current_pan_score__c,overall_score__c,us_candidate__c,invalidated_screening__c,createddate,order_id__c,status__c,lastmodifiedbyid,"
				+ "screening_pan_package_id__c,adpinitiatescreeningurl__c,bgc_expire_mismatch__c,adpscreeningid__c,section1_complete_dt__c,term_date__c,"
				+ "i9_status__c,i9_master_status__c,check_rehire__c,no_of_retries__c,form_id__c,master_status__c,i9_id_type__c,previous_i9_status_number__c,"
				+ "i9_prior_master_status__c,airport__c,i9_id__c,i9_complete__c,i9_status_number__c,section3_complete_dt__c,section2_complete_dt__c,"
				+ "has_candidate_screenings__c)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\r\n"
				+ ")", new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setLong(1, assmt.get(i).getId());
						ps.setString(2, assmt.get(i).getAssessment_type__c());
						ps.setString(3, assmt.get(i).getSfid());
						ps.setTimestamp(4, assmt.get(i).getLastmodifieddate());
						ps.setString(5, assmt.get(i).getReplicate_screening__c());
						ps.setString(6, assmt.get(i).getParent_screening__c());
						ps.setTimestamp(7, assmt.get(i).getLastreferenceddate());
						ps.setString(8, assmt.get(i).getApplication_requisition__c());
						ps.setString(9, assmt.get(i).getName());
						ps.setString(10, assmt.get(i).getConnectionsentid());
						ps.setString(11, assmt.get(i).getCandidate__c());
						ps.setString(12, assmt.get(i).getCreatedbyid());
						ps.setBoolean(13, assmt.get(i).isExpired_checkbox__c());
						ps.setString(14, assmt.get(i).getRecordtypeid());
						ps.setString(15, assmt.get(i).getConnectionreceivedid());
						ps.setDate(16, assmt.get(i).getLast_asr_request_date__c());
						ps.setString(17, assmt.get(i).getApplication__c());
						ps.setString(18, assmt.get(i).getScore_name__c());
						ps.setDate(19, assmt.get(i).getInitiation_date__c());
						ps.setDate(20, assmt.get(i).getStatus_date__c());
						ps.setBoolean(21, assmt.get(i).isIs_international_bgc__c());
						ps.setString(22, assmt.get(i).getError_detail_long__c());
						ps.setString(23, assmt.get(i).get_hc_lastop());
						ps.setString(24, assmt.get(i).get_hc_err());
						ps.setBoolean(25, assmt.get(i).isIsdeleted());
						ps.setString(26, assmt.get(i).getApplication_workflow_details__c());
						ps.setString(27, assmt.get(i).getLegacy_taleo_provider_status__c());
						ps.setString(28, assmt.get(i).getLegacy_taleo_screening_requester__c());
						ps.setTimestamp(29, assmt.get(i).getLastvieweddate());
						ps.setString(30, assmt.get(i).getError_detail__c());
						ps.setFloat(31, assmt.get(i).getAccurate_screening_check__c());
						ps.setTimestamp(32, assmt.get(i).getSystemmodstamp());
						ps.setString(33, assmt.get(i).getReceipt_id__c());
						ps.setDate(34, assmt.get(i).getExpirationdate__c());
						ps.setString(35, assmt.get(i).getOriginal_external_order_id__c());
						ps.setBoolean(36, assmt.get(i).isX15_day_screening_validator__c());
						ps.setString(37, assmt.get(i).getCurrent_pan_score__c());
						ps.setString(38, assmt.get(i).getOverall_score__c());
						ps.setBoolean(39, assmt.get(i).isUs_candidate__c());
						ps.setBoolean(40, assmt.get(i).isInvalidated_screening__c());
						ps.setTimestamp(41, assmt.get(i).getCreateddate());
						ps.setString(42, assmt.get(i).getOrder_id__c());
						ps.setString(43, assmt.get(i).getStatus__c());
						ps.setString(44, assmt.get(i).getLastmodifiedbyid());
						ps.setString(45, assmt.get(i).getScreening_pan_package_id__c());
						ps.setString(46, assmt.get(i).getAdpinitiatescreeningurl__c());
						ps.setBoolean(47, assmt.get(i).isBgc_expire_mismatch__c());
						ps.setString(48, assmt.get(i).getAdpscreeningid__c());
						ps.setDate(49, assmt.get(i).getSection1_complete_dt__c());
						ps.setDate(50, assmt.get(i).getTerm_date__c());
						ps.setString(51, assmt.get(i).getI9_status__c());
						ps.setString(52, assmt.get(i).getI9_master_status__c());
						ps.setBoolean(53, assmt.get(i).isCheck_rehire__c());
						ps.setFloat(54, assmt.get(i).getNo_of_retries__c());
						ps.setFloat(55, assmt.get(i).getForm_id__c());
						ps.setString(56, assmt.get(i).getMaster_status__c());
						ps.setString(57, assmt.get(i).getI9_id_type__c());
						ps.setFloat(58, assmt.get(i).getPrevious_i9_status_number__c());
						ps.setString(59, assmt.get(i).getI9_prior_master_status__c());
						ps.setString(60, assmt.get(i).getAirport__c());
						ps.setFloat(61, assmt.get(i).getI9_id__c());
						ps.setBoolean(62, assmt.get(i).isI9_complete__c());
						ps.setFloat(63, assmt.get(i).getI9_status_number__c());
						ps.setDate(64, assmt.get(i).getSection3_complete_dt__c());
						ps.setDate(65, assmt.get(i).getSection2_complete_dt__c());
						ps.setBoolean(66, assmt.get(i).isHas_candidate_screenings__c());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return assmt.size();
					}

				});

	}

	@Override
	public void insertEmailMessageData(List<EmailMessage> emms) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.emailmessage "
				+ "(lastmodifieddate,istracked,headers,threadidentifier,activityid,lastopeneddate,emailtemplateid,isexternallyvisible,isclientmanaged,"
				+ "fromname,hasattachment,fromaddress,createdbyid,isopened,ccaddress,parentid,relatedtoid,status,messagedate,isdeleted,incoming,isbounced,"
				+ "validatedfromaddress,subject,systemmodstamp,firstopeneddate,textbody,replytoemailmessageid,htmlbody,createddate,bccaddress,"
				+ "messageidentifier,lastmodifiedbyid,toaddress,sfid,id,_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, emms.get(i).getLastmodifieddate());
						ps.setBoolean(2, emms.get(i).isIstracked());
						ps.setString(3, emms.get(i).getHeaders());
						ps.setString(4, emms.get(i).getThreadidentifier());
						ps.setString(5, emms.get(i).getActivityid());
						ps.setTimestamp(6, emms.get(i).getLastopeneddate());
						ps.setString(7, emms.get(i).getEmailtemplateid());
						ps.setBoolean(8, emms.get(i).isIsexternallyvisible());
						ps.setBoolean(9, emms.get(i).isIsclientmanaged());
						ps.setString(10, emms.get(i).getFromname());
						ps.setBoolean(11, emms.get(i).isHasattachment());
						ps.setString(12, emms.get(i).getFromaddress());
						ps.setString(13, emms.get(i).getCreatedbyid());
						ps.setBoolean(14, emms.get(i).isIsopened());
						ps.setString(15, emms.get(i).getCcaddress());
						ps.setString(16, emms.get(i).getParentid());
						ps.setString(17, emms.get(i).getRelatedtoid());
						ps.setString(18, emms.get(i).getStatus());
						ps.setTimestamp(19, emms.get(i).getMessagedate());
						ps.setBoolean(20, emms.get(i).isIsdeleted());
						ps.setBoolean(21, emms.get(i).isIncoming());
						ps.setBoolean(22, emms.get(i).isIsbounced());
						ps.setString(23, emms.get(i).getValidatedfromaddress());
						ps.setString(24, emms.get(i).getSubject());
						// ps.setBoolean(25, emms.get(i).isIsdeleted());
						ps.setTimestamp(25, emms.get(i).getSystemmodstamp());
						ps.setTimestamp(26, emms.get(i).getFirstopeneddate());
						ps.setString(27, emms.get(i).getTextbody());
						ps.setString(28, emms.get(i).getReplytoemailmessageid());
						ps.setString(29, emms.get(i).getHtmlbody());
						ps.setTimestamp(30, emms.get(i).getCreateddate());
						ps.setString(31, emms.get(i).getBccaddress());
						ps.setString(32, emms.get(i).getMessageidentifier());
						ps.setString(33, emms.get(i).getLastmodifiedbyid());
						ps.setString(34, emms.get(i).getToaddress());
						ps.setString(35, emms.get(i).getSfid());
						ps.setLong(36, emms.get(i).getId());
						ps.setString(37, emms.get(i).get_hc_lastop());
						ps.setString(38, emms.get(i).get_hc_err());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return emms.size();
					}

				});

	}

	@Override
	public void insertErrorLogData(List<ErrorLog> errlog) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.error_log__c "
				+ "(exception_stack_trace__c,lastmodifieddate,isdeleted,exception_message__c,exception_type__c,"
				+ "apex_class_name__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,"
				+ "connectionreceivedid,exception_line_number__c,lastmodifiedbyid,related_application__c,sfid,id,"
				+ "_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, errlog.get(i).getException_stack_trace__c());
						ps.setTimestamp(2, errlog.get(i).getLastmodifieddate());
						ps.setBoolean(3, errlog.get(i).isIsdeleted());
						ps.setString(4, errlog.get(i).getException_message__c());
						ps.setString(5, errlog.get(i).getException_type__c());
						ps.setString(6, errlog.get(i).getApex_class_name__c());
						ps.setString(7, errlog.get(i).getName());
						ps.setTimestamp(8, errlog.get(i).getSystemmodstamp());
						ps.setString(9, errlog.get(i).getConnectionsentid());
						ps.setString(10, errlog.get(i).getOwnerid());
						ps.setString(11, errlog.get(i).getCreatedbyid());
						ps.setTimestamp(12, errlog.get(i).getCreateddate());
						ps.setString(13, errlog.get(i).getConnectionreceivedid());
						ps.setFloat(14, errlog.get(i).getException_line_number__c());
						ps.setString(15, errlog.get(i).getLastmodifiedbyid());
						ps.setString(16, errlog.get(i).getRelated_application__c());
						ps.setString(17, errlog.get(i).getSfid());
						ps.setLong(18, errlog.get(i).getId());
						ps.setString(19, errlog.get(i).get_hc_lastop());
						ps.setString(20, errlog.get(i).get_hc_err());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return errlog.size();
					}

				});

	}

	@Override
	public void insertIntegrationTransactionData(List<IntegrationTransaction> intrans) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.integration_transaction__c "
				+ "(lastmodifieddate,transaction_type__c,lastreferenceddate,name,connectionsentid,transaction_date_ff__c,createdbyid,connectionreceivedid,"
				+ "requestor_id_ps__c,number_of_attempts__c,it_candidate__c,creation_outside__c,it_application__c,outbound_message__c,isdeleted,"
				+ "error_summary__c,it_screening__c,lastvieweddate,processed__c,inbound_message__c,system__c,error_detail__c,systemmodstamp,"
				+ "x15_minutes_from_now__c,transaction_status__c,createddate,lastactivitydate,environment__c,lastmodifiedbyid,transaction_date__c,sfid,"
				+ "_hc_lastop,_hc_err,number_of_noshows__c,is_papi_enabled__c,system_path__c,sub_status__c,id)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, intrans.get(i).getLastmodifieddate());
						ps.setString(2, intrans.get(i).getTransaction_type__c());
						ps.setTimestamp(3, intrans.get(i).getLastreferenceddate());
						ps.setString(4, intrans.get(i).getName());
						ps.setString(5, intrans.get(i).getConnectionsentid());
						ps.setString(6, intrans.get(i).getTransaction_date_ff__c());
						ps.setString(7, intrans.get(i).getCreatedbyid());
						ps.setString(8, intrans.get(i).getConnectionreceivedid());
						ps.setString(9, intrans.get(i).getRequestor_id_ps__c());
						ps.setFloat(10, intrans.get(i).getNumber_of_attempts__c());
						ps.setString(11, intrans.get(i).getIt_candidate__c());
						ps.setBoolean(12, intrans.get(i).isCreation_outside__c());
						ps.setString(13, intrans.get(i).getIt_application__c());
						ps.setString(14, intrans.get(i).getOutbound_message__c());
						ps.setBoolean(15, intrans.get(i).isIsdeleted());
						ps.setString(16, intrans.get(i).getError_summary__c());
						ps.setString(17, intrans.get(i).getIt_screening__c());
						ps.setTimestamp(18, intrans.get(i).getLastvieweddate());
						ps.setBoolean(19, intrans.get(i).isProcessed__c());
						ps.setString(20, intrans.get(i).getInbound_message__c());
						ps.setString(21, intrans.get(i).getSystem__c());
						ps.setString(22, intrans.get(i).getError_detail__c());
						ps.setTimestamp(23, intrans.get(i).getSystemmodstamp());
						ps.setTimestamp(24, intrans.get(i).getX15_minutes_from_now__c());
						ps.setString(25, intrans.get(i).getTransaction_status__c());
						ps.setTimestamp(26, intrans.get(i).getCreateddate());
						ps.setDate(27, intrans.get(i).getLastactivitydate());
						ps.setString(28, intrans.get(i).getEnvironment__c());
						ps.setString(29, intrans.get(i).getLastmodifiedbyid());
						ps.setTimestamp(30, intrans.get(i).getTransaction_date__c());
						ps.setString(31, intrans.get(i).getSfid());
						ps.setString(32, intrans.get(i).get_hc_lastop());
						ps.setString(33, intrans.get(i).get_hc_err());
						ps.setFloat(34, intrans.get(i).getNumber_of_noshows__c());
						ps.setBoolean(35, intrans.get(i).isIs_papi_enabled__c());
						ps.setString(36, intrans.get(i).getSystem_path__c());
						ps.setString(37, intrans.get(i).getSub_status__c());
						ps.setLong(38, intrans.get(i).getId());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return intrans.size();
					}

				});

	}

	@Override
	public void insertInterviewData(List<Interview> interview) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.interview__c "
				+ "(lastmodifieddate,appt_time_zone__c,appt_end_time__c,special_skills__c,name,candidate__c,createdbyid,candidate_last_name__c,timeslot__c,general_notes__c,recruiting_event_type__c,appt_start_datetime__c,isdeleted,appt_recruiting_event_link__c,lastvieweddate,translated_address__c,requisition_id__c,createddate,appointment_date__c,appt_end_time_text__c,pool_substep__c,active__c,appt_timespan_number__c,interview_type__c,appt_start_date__c,appt_requisition_link__c,scheduling_type__c,shift_comments__c,interview_question_set__c,email_template_name__c,event_type__c,lastreferenceddate,connectionsentid,appt_status__c,candidate_actual_time_zone__c,candidate_first_name__c,connectionreceivedid,appt_start_time_text__c,translated_directions_instructions__c,application__c,appt_end_date__c,interview_outcome__c,role__c,candidate_language__c,shift__c,systemmodstamp,appt_address__c,uniqueness_validation_key__c,appt_time_zone_key__c,appt_start_time__c,lastmodifiedbyid,candidate_email__c,interviewer__c,sfid,id,_hc_lastop,_hc_err,virtual_new_hire_event__c,cid__c\r\n"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, interview.get(i).getLastmodifieddate());
						ps.setString(2, interview.get(i).getAppt_time_zone__c());
						ps.setTimestamp(3, interview.get(i).getAppt_end_time__c());
						ps.setString(4, interview.get(i).getSpecial_skills__c());
						ps.setString(5, interview.get(i).getName());
						ps.setString(6, interview.get(i).getCandidate__c());
						ps.setString(7, interview.get(i).getCreatedbyid());
						ps.setString(8, interview.get(i).getCandidate_last_name__c());
						ps.setString(9, interview.get(i).getTimeslot__c());
						ps.setString(10, interview.get(i).getGeneral_notes__c());
						ps.setString(11, interview.get(i).getRecruiting_event_type__c());
						ps.setTimestamp(12, interview.get(i).getAppt_start_datetime__c());
						ps.setBoolean(13, interview.get(i).isIsdeleted());
						ps.setString(14, interview.get(i).getAppt_recruiting_event_link__c());
						ps.setTimestamp(15, interview.get(i).getLastvieweddate());
						ps.setString(16, interview.get(i).getTranslated_address__c());
						ps.setString(17, interview.get(i).getRequisition_id__c());
						ps.setTimestamp(18, interview.get(i).getCreateddate());
						ps.setDate(19, interview.get(i).getAppointment_date__c());
						ps.setString(20, interview.get(i).getAppt_end_time_text__c());
						ps.setString(21, interview.get(i).getPool_substep__c());
						ps.setBoolean(22, interview.get(i).isActive__c());
						ps.setString(23, interview.get(i).getAppt_timespan_number__c());
						ps.setString(24, interview.get(i).getInterview_type__c());
						ps.setString(25, interview.get(i).getAppt_start_date__c());
						ps.setString(26, interview.get(i).getAppt_requisition_link__c());
						ps.setString(27, interview.get(i).getScheduling_type__c());
						ps.setString(28, interview.get(i).getShift_comments__c());
						ps.setString(29, interview.get(i).getInterview_question_set__c());
						ps.setString(30, interview.get(i).getEmail_template_name__c());
						ps.setString(31, interview.get(i).getEvent_type__c());
						ps.setTimestamp(32, interview.get(i).getLastreferenceddate());
						ps.setString(33, interview.get(i).getConnectionsentid());
						ps.setString(34, interview.get(i).getAppt_status__c());
						ps.setString(35, interview.get(i).getCandidate_actual_time_zone__c());
						ps.setString(36, interview.get(i).getCandidate_first_name__c());
						ps.setString(37, interview.get(i).getConnectionreceivedid());
						ps.setString(38, interview.get(i).getAppt_start_time_text__c());
						ps.setString(39, interview.get(i).getTranslated_directions_instructions__c());
						ps.setString(40, interview.get(i).getApplication__c());
						ps.setString(41, interview.get(i).getAppt_end_date__c());
						ps.setString(42, interview.get(i).getInterview_outcome__c());
						ps.setString(43, interview.get(i).getRole__c());
						ps.setString(44, interview.get(i).getCandidate_language__c());
						ps.setString(45, interview.get(i).getShift__c());
						ps.setTimestamp(46, interview.get(i).getSystemmodstamp());
						ps.setString(47, interview.get(i).getAppt_address__c());
						ps.setString(48, interview.get(i).getUniqueness_validation_key__c());
						ps.setString(49, interview.get(i).getAppt_time_zone_key__c());
						ps.setTimestamp(50, interview.get(i).getAppt_start_time__c());
						ps.setString(51, interview.get(i).getLastmodifiedbyid());
						ps.setString(52, interview.get(i).getCandidate_email__c());
						ps.setString(53, interview.get(i).getInterviewer__c());
						ps.setString(54, interview.get(i).getSfid());
						ps.setLong(55, interview.get(i).getId());
						ps.setString(56, interview.get(i).get_hc_lastop());
						ps.setString(57, interview.get(i).get_hc_err());
						ps.setString(58, interview.get(i).getVirtual_new_hire_event__c());
						ps.setString(59, interview.get(i).getCid__c());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return interview.size();
					}

				});

	}

	@Override
	public void insertNoteData(List<Note> notes) {
		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.note "
				+ "(body,parentid,lastmodifieddate,ownerid,isdeleted,systemmodstamp,lastmodifiedbyid,createddate,title,isprivate,createdbyid,sfid,id,_hc_lastop,_hc_err"
				+ "" + ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",

				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, notes.get(i).getBody());
						ps.setString(2, notes.get(i).getParentid());
						ps.setTimestamp(3, notes.get(i).getLastmodifieddate());
						ps.setString(4, notes.get(i).getOwnerid());
						ps.setBoolean(5, notes.get(i).isIsdeleted());
						ps.setTimestamp(6, notes.get(i).getSystemmodstamp());
						ps.setString(7, notes.get(i).getLastmodifiedbyid());
						ps.setTimestamp(8, notes.get(i).getCreateddate());
						ps.setString(9, notes.get(i).getTitle());
						ps.setBoolean(10, notes.get(i).isIsprivate());
						ps.setString(11, notes.get(i).getCreatedbyid());
						ps.setString(12, notes.get(i).getSfid());
						ps.setLong(13, notes.get(i).getId());
						ps.setString(14, notes.get(i).get_hc_lastop());
						ps.setString(15, notes.get(i).get_hc_err());
					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return notes.size();
					}

				});

	}

	@Override
	public void insertResponseData(List<Response> response) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response__c "
				+ "(lastmodifieddate,question_text__c,disqualifying_answer__c,lastreferenceddate,interviewer_comment__c,response__c,interview__c,name,connectionsentid,ownerid,createdbyid,connectionreceivedid,application__c,question__c,isdeleted,legacy_taleo_qa_response_identifier__c,lastvieweddate,systemmodstamp,meets_requirements__c,question_type__c,competency__c,createddate,score__c,lastmodifiedbyid,question_html_type__c,sfid,id,_hc_lastop,_hc_err,related_field__c"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, response.get(i).getLastmodifieddate());
						ps.setString(2, response.get(i).getQuestion_text__c());
						ps.setBoolean(3, response.get(i).isDisqualifying_answer__c());
						ps.setTimestamp(4, response.get(i).getLastreferenceddate());
						ps.setString(5, response.get(i).getInterviewer_comment__c());
						ps.setString(6, response.get(i).getResponse__c());
						ps.setString(7, response.get(i).getInterview__c());
						ps.setString(8, response.get(i).getName());
						ps.setString(9, response.get(i).getConnectionsentid());
						ps.setString(10, response.get(i).getOwnerid());
						ps.setString(11, response.get(i).getCreatedbyid());
						ps.setString(12, response.get(i).getConnectionreceivedid());
						ps.setString(13, response.get(i).getApplication__c());

						ps.setString(14, response.get(i).getQuestion__c());
						ps.setBoolean(15, response.get(i).isIsdeleted());
						ps.setString(16, response.get(i).getLegacy_taleo_qa_response_identifier__c());
						ps.setTimestamp(17, response.get(i).getLastvieweddate());

						ps.setTimestamp(18, response.get(i).getSystemmodstamp());
						ps.setString(19, response.get(i).getMeets_requirements__c());
						ps.setString(20, response.get(i).getQuestion_type__c());
						ps.setString(21, response.get(i).getCompetency__c());
						ps.setTimestamp(22, response.get(i).getCreateddate());
						ps.setString(23, response.get(i).getScore__c());
						ps.setString(24, response.get(i).getLastmodifiedbyid());
						ps.setString(25, response.get(i).getQuestion_html_type__c());
						ps.setString(26, response.get(i).getSfid());
						ps.setLong(27, response.get(i).getId());

						ps.setString(28, response.get(i).get_hc_lastop());
						ps.setString(29, response.get(i).get_hc_err());
						ps.setString(30, response.get(i).getRelated_field__c());
					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return response.size();
					}

				});

	}

	@Override
	public void insertResponseAnswerData(List<ResponseAnswer> responseanswer) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response_answer__c "
				+ "(lastmodifieddate,isdeleted,answer__c,response__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,connectionreceivedid,lastmodifiedbyid,sfid,id,_hc_lastop,_hc_err\r\n"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, responseanswer.get(i).getLastmodifieddate());
						ps.setBoolean(2, responseanswer.get(i).getIsdeleted());
						ps.setString(3, responseanswer.get(i).getAnswer__c());
						ps.setString(4, responseanswer.get(i).getResponse__c());
						ps.setString(5, responseanswer.get(i).getName());
						ps.setTimestamp(6, responseanswer.get(i).getSystemmodstamp());
						ps.setString(7, responseanswer.get(i).getConnectionsentid());
						ps.setString(8, responseanswer.get(i).getOwnerid());
						ps.setString(9, responseanswer.get(i).getCreatedbyid());
						ps.setTimestamp(10, responseanswer.get(i).getCreateddate());
						ps.setString(11, responseanswer.get(i).getConnectionreceivedid());
						ps.setString(12, responseanswer.get(i).getLastmodifiedbyid());
						ps.setString(13, responseanswer.get(i).getSfid());

						ps.setLong(14, responseanswer.get(i).getId());
						ps.setString(15, responseanswer.get(i).get_hc_lastop());
						ps.setString(16, responseanswer.get(i).get_hc_err());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return responseanswer.size();
					}

				});

	}
}
