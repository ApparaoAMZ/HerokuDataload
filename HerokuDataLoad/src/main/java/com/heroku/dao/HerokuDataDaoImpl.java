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

/**
 * Dao Implementation class to insert the data in database
 * 
 */
@Repository
public class HerokuDataDaoImpl implements HerokuDataDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Inserting Application data
	 *
	 * @param list of application objects
	 * @return void
	 */ 
	@Override
	public void insertApplicationData(List<Application> lstApl) {

		int[] insertCounts = jdbcTemplate.batchUpdate(
				"insert into sf_archive.application__c (candidate__c,national_id_country_ps__c,more_than_one_application__c,legacy_taleo_external_id__c,felony_conviction_question_1__c,requisition_hiring_function__c,email_notification_prompt_3_text__c,bgc_authorization_1_date__c,hcr_hiring_manager_full_name__c,candidate_withdraws_detail__c,candidate_owner_id__c,requisition_reg_temp__c,app_performance_curve__c,tech_insight_score__c,us_candidate__c,legacy_taleo_fclm_area__c,createdfrompostcard__c,email_notification_prompt_4_text__c,bgc_authorization_2_date__c,app_performance_hours__c,peoplesoft_pre_processing_substep__c,most_recent_substep_change_date__c,hr_location_code__c,hr_manager_login__c,agency_subsource_ps__c,gender_ps__c,education_qualification_check__c,previous_step_substep__c,typing_accuracy__c,job_page_url__c,enable_concurrent_contingencies__c,application_esignature_date_time_part2__c,artdoc_candidate_id__c,sign_on_bonus_ps__c,application_esignature_date_time__c,phone_tool_title_ps__c,hcr_hiring_manager_title__c,in_invitation_extension_substep__c,req_auto_send_contingent_offer__c,app_performance_eligibility__c,legacy_taleo_overall_assessment__c,contingent_offer_extended__c,hr_requisition_title__c,cloned_due_to_process_on_other_req__c,workflow__c,backgroundcheckoverallscore__c,legacy_taleo_recruiter__c,typing_speed__c,hcr_day_1_day_ps__c,panattemptcount__c,order_id_override__c,hr_shift_code__c,node_requisition__c,hcr_orientation_session__c,headcount_request__c,bgc_disclosure_date__c,hr_open__c,hcr_location_address1__c,requisition_id__c,legacy_taleo_department_extension__c,businessunit_ps__c,source_details__c,source_primary__c,selected_shift__c,candidateid__c,sp_q1_response__c,appointment_search_filter_date__c,app_rehire_eligibility_status__c,hcr_orientation_date_ps__c,legacy_taleo_hiring_area_manager__c,legacy_taleo_shift_comments__c,career_portal_url__c,status_onbase__c,sp_q2_response__c,current_integration_step__c,acknowledge_no_work_experience__c,rpt_compare_start_date_with_day1__c,hire_back_dated_candidates_ps__c,requisition__c,sp_q3_response__c,legacy_taleo_submission_medium__c,selected_shift_valid__c,legacy_taleo_orientation_session__c,rewind__c,hr_hired__c,requisition_function__c,legacy_taleo_overall_percentile__c,my_job_status_global__c,bgc_disclosure_frca__c,lastvieweddate,email_notification_subject__c,account_employee_id__c,bgc_authorization2__c,ps_integration_enabled__c,owner_id_validator__c,hcr_location_postalcode__c,submitted_app_on_file__c,reschedule_count__c,agency_conversion_check__c,preferred_location_code__c,bgc_authorization1__c,my_job_status_de__c,app_my_job_status_global__c,free_consumer_report_requested__c,respects_special_jurisdiction__c,meets_education_requirement__c,step_substep__c,req_contingency_bypass__c,hr_requested__c,application_shift_code__c,backgroundchkexpirydate__c,work_flow_rule_trigger__c,current_mailing_state_province__c,salary_ps__c,letter_of_intent_selection__c,jobcode_ps__c,name,candidate_last_name__c,recruiter_employee_id__c,continue_application__c,hcr_department_description__c,bgc_disclosure_frca_esignature__c,drugtestoverallscore__c,location_postal_code__c,vcpprp_ps__c,pay_rate__c,contract_title_ps__c,role__c,stdhours_ps__c,hr_hiring_manager_name__c,app_language__c,hire_start_date__c,candidate_first_name__c,hr_day_1_day__c,letter_of_intent_completed_date__c,legacy_taleo_shift__c,conversion__c,lastmodifieddate,location_city__c,matching_location_code__c,application_withdrawn__c,hcr_hire_end_date__c,ownerid,tech_force_email_rule_execution__c,instance__c,requisition_title__c,appointment_4__c,phone_screen_results__c,requisition_location_code__c,in_manage_hire__c,best_suitable_skill__c,hcr_location_country__c,legacy_taleo_e_signature_ip__c,isdeleted,portal_application_status__c,background_check_counter__c,accurate_screening_check__c,legacy_taleo_application_creation_date__c,company_code_ps__c,hcr_request_id__c,appointment_3__c,legacy_taleo_correspondence_information__c,requisition_country__c,email_notification_body__c,systemmodstamp,drugtestexpirydate__c,lastmodifiedbyid,bypass_dt_bgc_validation__c,timeslots_available__c,app_scheduling_group__c,app_performance_agency__c,hcr_department_code__c,email_notification_rich_text_2__c,part_2_completed__c,connectionsentid,appointment_2__c,national_id_type_ps__c,rehire_eligibility_audit__c,hcr_number__c,shift_comments__c,currency_ps__c,appointment_1__c,legacy_taleo_hire_end_date__c,application_shift_description__c,candidatesfdcid__c,hr_requistion_id__c,lastactivitydate,spoken_overall__c,preferred_location_description__c,first_available_start_date__c,app_performance_points__c,hcr_location_state__c,current_appointment_number__c,pan_candidate_attempt__c,most_recent_substep_change_datetime__c,tier_3_interview_results__c,pan_package_id_trigger__c,contract_signer_name_ps__c,hr_matched__c,app_languagelocalekey__c,hr_business_title__c,bgc_disclosure__c,contingent_offer_accepted__c,contingent_offer_shift_code_description__c,hcr_hire_start_date__c,agency_source_ps__c,app_languagecountrycode__c,interview_completed__c,tier_1_interview_results__c,legacy_taleo_scheduling_information__c,hcr_location_city__c,email_template_name__c,app_overall_percentile__c,req_hourly_rate__c,override_bgc_validation__c,appointment_4_interview_results__c,createddate,hr_shift_differential__c,backgroundcheckstatus__c,substep__c,duplicate_contact__c,esignaturepart2__c,application_submitted__c,stock_ps__c,order_id__c,suppress_screening_validation__c,hcr_manager_emp_id__c,hire_start_date_ps__c,legacy_taleo_hours_worked__c,step__c,preferred_last_name_ps__c,paybasis_ps__c,source_other__c,date_component__c,translated_requisition_title__c,tagged__c,appointment_3_interview_results__c,location_country__c,informatica_key__c,appointment_2_interview_results__c,workflow_name__c,location_code_ps__c,offer_out__c,no_show_count__c,esignature_read_general__c,translated_address__c,no_show_indicator__c,matched_onbase__c,pay_rate_ps__c,req_bypass_scheduling__c,hr_shift_description__c,shift_differential_ps__c,legacy_taleo_app_interview_info_de__c,preferred_first_name_ps__c,appointment_1_interview_results__c,appointment_start_time__c,location_address_line2__c,connectionreceivedid,background_check_initiation_date__c,hr_alps_code__c,legacy_taleo_orientation_date__c,app_my_job_status__c,app_performance_pool__c,createdbyid,nationalidcountry__c,candidateidsearchsupport__c,special_skills__c,app_performance_counsel__c,legacy_taleo_fclm_job__c,is_node_application__c,legacy_taleo_pool__c,location_address_line1__c,translated_directions_instructions__c,hr_location_description__c,bypassed_cultural_assessment__c,subsource_ps__c,assessmentoverallscore__c,hr_department__c,amazon_rejects_detail_picklist__c,master_shift_code__c,operation__c,req_education__c,source_ps__c,requisition_function_ps__c,createddateclone__c,substep_duration__c,location_state__c,nationalidtype__c,hcr_finance_week_number__c,alps_code_description_ps__c,my_job_status__c,last_modified_date_ps__c,legacy_taleo_amp_eligibility__c,number_of_appointments__c,lastreferenceddate,job_page_label__c,active__c,my_job_status_canada__c,email_notification_prompt_1_text__c,app_candidate_name__c,candidateaccountid__c,hcr_orientation_date__c,written_overall__c,orientation_date_ps__c,requisition_type_ps__c,hire_end_date_ps__c,legacy_taleo_step_substep__c,email_notification_prompt_datetime__c,agency_name__c,alps_code_ps__c,email_notification_prompt_memo__c,agency_req__c,matched__c,felony_conviction_question_2__c,panerrorcount__c,email_template_formatted_address_label__c,legacy_taleo_shift_differential__c,acknowledge_no_attachment_provided__c,email_notification_prompt_2_text__c,amzr_error_status__c,sfid,id,_hc_lastop,_hc_err,node_bgc_bypass_for_hire__c,interview_result__c,hrloggedascanddiate__c,bgc_california_disclosure_fcra__c,email_notification_prompt_datetime_str__c,i9_enabled__c,bgc_california_disclosure_icraa__c,virtual_new_hire_event__c,sp_q2_first_response__c,is_papi_enabled__c,comms_override_nacf_t1_node__c,candidate_last_name_kanji__c,sp_q1_first_response__c,inclined_value__c,national_id_type__c,sp_q3_first_response__c,candidate_first_name_kanji__c\r\n"
						+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\r\n"
						+ ")",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, lstApl.get(i).getCandidate__c());
						ps.setString(2, lstApl.get(i).getNational_id_country_ps__c());
						ps.setBoolean(3, lstApl.get(i).isMore_than_one_application__c());
						ps.setString(4, lstApl.get(i).getLegacy_taleo_external_id__c());
						ps.setString(5, lstApl.get(i).getFelony_conviction_question_1__c());
						ps.setString(6, lstApl.get(i).getRequisition_hiring_function__c());
						ps.setString(7, lstApl.get(i).getEmail_notification_prompt_3_text__c());
						ps.setTimestamp(8, lstApl.get(i).getBgc_authorization_1_date__c());
						ps.setString(9, lstApl.get(i).getHcr_hiring_manager_full_name__c());
						ps.setString(10, lstApl.get(i).getCandidate_withdraws_detail__c());
						ps.setString(11, lstApl.get(i).getCandidate_owner_id__c());
						ps.setString(12, lstApl.get(i).getRequisition_reg_temp__c());
						ps.setFloat(13, lstApl.get(i).getApp_performance_curve__c());
						ps.setString(14, lstApl.get(i).getTech_insight_score__c());
						ps.setBoolean(15, lstApl.get(i).isUs_candidate__c());
						ps.setString(16, lstApl.get(i).getLegacy_taleo_fclm_area__c());
						ps.setBoolean(17, lstApl.get(i).isCreatedfrompostcard__c());
						ps.setString(18, lstApl.get(i).getEmail_notification_prompt_4_text__c());
						ps.setTimestamp(19, lstApl.get(i).getBgc_authorization_2_date__c());
						ps.setFloat(20, lstApl.get(i).getApp_performance_hours__c());
						ps.setBoolean(21, lstApl.get(i).isPeoplesoft_pre_processing_substep__c());
						ps.setDate(22, lstApl.get(i).getMost_recent_substep_change_date__c());
						ps.setString(23, lstApl.get(i).getHr_location_code__c());
						ps.setString(24, lstApl.get(i).getHr_manager_login__c());
						ps.setString(25, lstApl.get(i).getAgency_subsource_ps__c());
						ps.setString(26, lstApl.get(i).getGender_ps__c());
						ps.setBoolean(27, lstApl.get(i).isEducation_qualification_check__c());
						ps.setString(28, lstApl.get(i).getPrevious_step_substep__c());
						ps.setString(29, lstApl.get(i).getTyping_accuracy__c());
						ps.setString(30, lstApl.get(i).getJob_page_url__c());
						ps.setBoolean(31, lstApl.get(i).isEnable_concurrent_contingencies__c());
						ps.setTimestamp(32, lstApl.get(i).getApplication_esignature_date_time_part2__c());
						ps.setString(33, lstApl.get(i).getArtdoc_candidate_id__c());
						ps.setString(34, lstApl.get(i).getSign_on_bonus_ps__c());
						ps.setTimestamp(35, lstApl.get(i).getApplication_esignature_date_time__c());
						ps.setString(36, lstApl.get(i).getPhone_tool_title_ps__c());
						ps.setString(37, lstApl.get(i).getHcr_hiring_manager_title__c());
						ps.setBoolean(38, lstApl.get(i).isIn_invitation_extension_substep__c());
						ps.setString(39, lstApl.get(i).getReq_auto_send_contingent_offer__c());
						ps.setString(40, lstApl.get(i).getApp_performance_eligibility__c());
						ps.setString(41, lstApl.get(i).getLegacy_taleo_overall_assessment__c());
						ps.setTimestamp(42, lstApl.get(i).getContingent_offer_extended__c());
						ps.setString(43, lstApl.get(i).getHr_requisition_title__c());
						ps.setBoolean(44, lstApl.get(i).isCloned_due_to_process_on_other_req__c());
						ps.setString(45, lstApl.get(i).getWorkflow__c());
						ps.setString(46, lstApl.get(i).getBackgroundcheckoverallscore__c());
						ps.setString(47, lstApl.get(i).getLegacy_taleo_recruiter__c());
						ps.setString(48, lstApl.get(i).getTyping_speed__c());
						ps.setString(49, lstApl.get(i).getHcr_day_1_day_ps__c());
						ps.setFloat(50, lstApl.get(i).getPanattemptcount__c());
						ps.setString(51, lstApl.get(i).getOrder_id_override__c());
						ps.setString(52, lstApl.get(i).getHr_shift_code__c());
						ps.setString(53, lstApl.get(i).getNode_requisition__c());
						ps.setString(54, lstApl.get(i).getHcr_orientation_session__c());
						ps.setString(55, lstApl.get(i).getHeadcount_request__c());
						ps.setTimestamp(56, lstApl.get(i).getBgc_disclosure_date__c());
						ps.setFloat(57, lstApl.get(i).getHr_open__c());
						ps.setString(58, lstApl.get(i).getHcr_location_address1__c());
						ps.setString(59, lstApl.get(i).getRequisition_id__c());
						ps.setString(60, lstApl.get(i).getLegacy_taleo_department_extension__c());
						ps.setString(61, lstApl.get(i).getBusinessunit_ps__c());
						ps.setString(62, lstApl.get(i).getSource_details__c());
						ps.setString(63, lstApl.get(i).getSource_primary__c());
						ps.setString(64, lstApl.get(i).getSelected_shift__c());
						ps.setString(65, lstApl.get(i).getCandidateid__c());
						ps.setString(66, lstApl.get(i).getSp_q1_response__c());
						ps.setDate(67, lstApl.get(i).getAppointment_search_filter_date__c());
						ps.setString(68, lstApl.get(i).getApp_rehire_eligibility_status__c());
						ps.setString(69, lstApl.get(i).getHcr_orientation_date_ps__c());
						ps.setString(70, lstApl.get(i).getLegacy_taleo_hiring_area_manager__c());
						ps.setString(71, lstApl.get(i).getLegacy_taleo_shift_comments__c());
						ps.setString(72, lstApl.get(i).getCareer_portal_url__c());
						ps.setString(73, lstApl.get(i).getStatus_onbase__c());
						ps.setString(74, lstApl.get(i).getSp_q2_response__c());
						ps.setString(75, lstApl.get(i).getCurrent_integration_step__c());
						ps.setBoolean(76, lstApl.get(i).isAcknowledge_no_work_experience__c());
						ps.setString(77, lstApl.get(i).getRpt_compare_start_date_with_day1__c());
						ps.setString(78, lstApl.get(i).getHire_back_dated_candidates_ps__c());
						ps.setString(79, lstApl.get(i).getRequisition__c());
						ps.setString(80, lstApl.get(i).getSp_q3_response__c());
						ps.setString(81, lstApl.get(i).getLegacy_taleo_submission_medium__c());
						ps.setBoolean(82, lstApl.get(i).isSelected_shift_valid__c());
						ps.setString(83, lstApl.get(i).getLegacy_taleo_orientation_session__c());
						ps.setBoolean(84, lstApl.get(i).isRewind__c());
						ps.setFloat(85, lstApl.get(i).getHr_hired__c());
						ps.setString(86, lstApl.get(i).getRequisition_function__c());
						ps.setFloat(87, lstApl.get(i).getLegacy_taleo_overall_percentile__c());
						ps.setString(88, lstApl.get(i).getMy_job_status_global__c());
						ps.setString(89, lstApl.get(i).getBgc_disclosure_frca__c());
						ps.setTimestamp(90, lstApl.get(i).getLastvieweddate());
						ps.setString(91, lstApl.get(i).getEmail_notification_subject__c());
						ps.setString(92, lstApl.get(i).getAccount_employee_id__c());
						ps.setString(93, lstApl.get(i).getBgc_authorization2__c());
						ps.setBoolean(94, lstApl.get(i).isPs_integration_enabled__c());
						ps.setBoolean(95, lstApl.get(i).isOwner_id_validator__c());
						ps.setString(96, lstApl.get(i).getHcr_location_postalcode__c());
						ps.setBoolean(97, lstApl.get(i).isSubmitted_app_on_file__c());
						ps.setFloat(98, lstApl.get(i).getReschedule_count__c());
						ps.setBoolean(99, lstApl.get(i).isAgency_conversion_check__c());
						ps.setString(100, lstApl.get(i).getPreferred_location_code__c());
						ps.setString(101, lstApl.get(i).getBgc_authorization1__c());
						ps.setString(102, lstApl.get(i).getMy_job_status_de__c());
						ps.setString(103, lstApl.get(i).getApp_my_job_status_global__c());
						ps.setBoolean(104, lstApl.get(i).isFree_consumer_report_requested__c());
						ps.setBoolean(105, lstApl.get(i).isRespects_special_jurisdiction__c());
						ps.setBoolean(106, lstApl.get(i).isMeets_education_requirement__c());
						ps.setString(107, lstApl.get(i).getStep_substep__c());
						ps.setBoolean(108, lstApl.get(i).isReq_bypass_scheduling__c());
						ps.setFloat(109, lstApl.get(i).getHr_requested__c());
						ps.setString(110, lstApl.get(i).getApplication_shift_code__c());
						ps.setDate(111, lstApl.get(i).getBackgroundchkexpirydate__c());
						ps.setString(112, lstApl.get(i).getWork_flow_rule_trigger__c());
						ps.setString(113, lstApl.get(i).getCurrent_mailing_state_province__c());
						ps.setString(114, lstApl.get(i).getSalary_ps__c());
						ps.setString(115, lstApl.get(i).getLetter_of_intent_selection__c());
						ps.setString(116, lstApl.get(i).getJobcode_ps__c());
						ps.setString(117, lstApl.get(i).getName());
						ps.setString(118, lstApl.get(i).getCandidate_last_name__c());
						ps.setString(119, lstApl.get(i).getRecruiter_employee_id__c());
						ps.setString(120, lstApl.get(i).getContinue_application__c());
						ps.setString(121, lstApl.get(i).getHcr_department_description__c());
						ps.setString(122, lstApl.get(i).getBgc_disclosure_frca_esignature__c());
						ps.setString(123, lstApl.get(i).getDrugtestoverallscore__c());
						ps.setString(124, lstApl.get(i).getLocation_postal_code__c());
						ps.setString(125, lstApl.get(i).getVcpprp_ps__c());
						ps.setFloat(126, lstApl.get(i).getPay_rate__c());
						ps.setString(127, lstApl.get(i).getContract_title_ps__c());
						ps.setString(128, lstApl.get(i).getRole__c());
						ps.setString(129, lstApl.get(i).getStdhours_ps__c());
						ps.setString(130, lstApl.get(i).getHr_hiring_manager_name__c());
						ps.setString(131, lstApl.get(i).getApp_language__c());
						ps.setDate(132, lstApl.get(i).getHire_start_date__c());
						ps.setString(133, lstApl.get(i).getCandidate_first_name__c());
						ps.setDate(134, lstApl.get(i).getHr_day_1_day__c());
						ps.setDate(135, lstApl.get(i).getLetter_of_intent_completed_date__c());
						ps.setString(136, lstApl.get(i).getLegacy_taleo_shift__c());
						ps.setBoolean(137, lstApl.get(i).isConversion__c());
						ps.setTimestamp(138, lstApl.get(i).getLastmodifieddate());
						ps.setString(139, lstApl.get(i).getLocation_city__c());
						ps.setString(140, lstApl.get(i).getMatching_location_code__c());
						ps.setBoolean(141, lstApl.get(i).isApplication_withdrawn__c());
						ps.setDate(142, lstApl.get(i).getHcr_hire_end_date__c());
						ps.setString(143, lstApl.get(i).getOwnerid());
						ps.setBoolean(144, lstApl.get(i).isTech_force_email_rule_execution__c());
						ps.setString(145, lstApl.get(i).getInstance__c());
						ps.setString(146, lstApl.get(i).getRequisition_title__c());
						ps.setTimestamp(147, lstApl.get(i).getAppointment_4__c());
						ps.setString(148, lstApl.get(i).getPhone_screen_results__c());
						ps.setString(149, lstApl.get(i).getRequisition_location_code__c());
						ps.setBoolean(150, lstApl.get(i).isIn_manage_hire__c());
						ps.setString(151, lstApl.get(i).getBest_suitable_skill__c());
						ps.setString(152, lstApl.get(i).getHcr_location_country__c());
						ps.setString(153, lstApl.get(i).getLegacy_taleo_e_signature_ip__c());
						ps.setBoolean(154, lstApl.get(i).isIsdeleted());
						ps.setString(155, lstApl.get(i).getPortal_application_status__c());
						ps.setString(156, lstApl.get(i).getBackground_check_counter__c());
						ps.setFloat(157, lstApl.get(i).getAccurate_screening_check__c());
						ps.setDate(158, lstApl.get(i).getLegacy_taleo_application_creation_date__c());
						ps.setString(159, lstApl.get(i).getCompany_code_ps__c());
						ps.setString(160, lstApl.get(i).getHcr_request_id__c());
						ps.setTimestamp(161, lstApl.get(i).getAppointment_3__c());
						ps.setString(162, lstApl.get(i).getLegacy_taleo_correspondence_information__c());
						ps.setString(163, lstApl.get(i).getRequisition_country__c());
						ps.setString(164, lstApl.get(i).getEmail_notification_body__c());
						ps.setTimestamp(165, lstApl.get(i).getSystemmodstamp());
						ps.setDate(166, lstApl.get(i).getDrugtestexpirydate__c());
						ps.setString(167, lstApl.get(i).getLastmodifiedbyid());
						ps.setBoolean(168, lstApl.get(i).isBypass_dt_bgc_validation__c());
						ps.setBoolean(169, lstApl.get(i).isTimeslots_available__c());
						ps.setString(170, lstApl.get(i).getApp_scheduling_group__c());
						ps.setString(171, lstApl.get(i).getApp_performance_agency__c());
						ps.setString(172, lstApl.get(i).getHcr_department_code__c());
						ps.setString(173, lstApl.get(i).getEmail_notification_rich_text_2__c());
						ps.setBoolean(174, lstApl.get(i).isPart_2_completed__c());
						ps.setString(175, lstApl.get(i).getConnectionsentid());
						ps.setTimestamp(176, lstApl.get(i).getAppointment_2__c());
						ps.setString(177, lstApl.get(i).getNational_id_type_ps__c());
						ps.setString(178, lstApl.get(i).getRehire_eligibility_audit__c());
						ps.setString(179, lstApl.get(i).getHcr_number__c());
						ps.setString(180, lstApl.get(i).getShift_comments__c());
						ps.setString(181, lstApl.get(i).getCurrency_ps__c());
						ps.setTimestamp(182, lstApl.get(i).getAppointment_1__c());
						ps.setDate(183, lstApl.get(i).getLegacy_taleo_hire_end_date__c());
						ps.setString(184, lstApl.get(i).getApplication_shift_description__c());
						ps.setString(185, lstApl.get(i).getCandidatesfdcid__c());
						ps.setString(186, lstApl.get(i).getHr_requistion_id__c());
						ps.setDate(187, lstApl.get(i).getLastactivitydate());
						ps.setString(188, lstApl.get(i).getSpoken_overall__c());
						ps.setString(189, lstApl.get(i).getPreferred_location_description__c());
						ps.setDate(190, lstApl.get(i).getFirst_available_start_date__c());
						ps.setFloat(191, lstApl.get(i).getApp_performance_points__c());
						ps.setString(192, lstApl.get(i).getHcr_location_state__c());
						ps.setString(193, lstApl.get(i).getCurrent_appointment_number__c());
						ps.setFloat(194, lstApl.get(i).getPan_candidate_attempt__c());
						ps.setTimestamp(195, lstApl.get(i).getMost_recent_substep_change_datetime__c());
						ps.setString(196, lstApl.get(i).getTier_3_interview_results__c());
						ps.setString(197, lstApl.get(i).getPan_package_id_trigger__c());
						ps.setString(198, lstApl.get(i).getContract_signer_name_ps__c());
						ps.setFloat(199, lstApl.get(i).getHr_matched__c());
						ps.setString(200, lstApl.get(i).getApp_languagelocalekey__c());
						ps.setString(201, lstApl.get(i).getHr_business_title__c());
						ps.setString(202, lstApl.get(i).getBgc_disclosure__c());
						ps.setTimestamp(203, lstApl.get(i).getContingent_offer_accepted__c());
						ps.setString(204, lstApl.get(i).getContingent_offer_shift_code_description__c());
						ps.setDate(205, lstApl.get(i).getHcr_hire_start_date__c());
						ps.setString(206, lstApl.get(i).getAgency_source_ps__c());
						ps.setString(207, lstApl.get(i).getApp_languagecountrycode__c());
						ps.setString(208, lstApl.get(i).getInterview_completed__c());
						ps.setString(209, lstApl.get(i).getTier_1_interview_results__c());
						ps.setString(210, lstApl.get(i).getLegacy_taleo_scheduling_information__c());
						ps.setString(211, lstApl.get(i).getHcr_location_city__c());
						ps.setString(212, lstApl.get(i).getEmail_template_name__c());
						ps.setFloat(213, lstApl.get(i).getApp_overall_percentile__c());
						ps.setString(214, lstApl.get(i).getReq_hourly_rate__c());
						ps.setBoolean(215, lstApl.get(i).isOverride_bgc_validation__c());
						ps.setString(216, lstApl.get(i).getAppointment_4_interview_results__c());
						ps.setTimestamp(217, lstApl.get(i).getCreateddate());
						ps.setString(218, lstApl.get(i).getHr_shift_differential__c());
						ps.setString(219, lstApl.get(i).getBackgroundcheckstatus__c());
						ps.setString(220, lstApl.get(i).getSubstep__c());
						ps.setString(221, lstApl.get(i).getDuplicate_contact__c());
						ps.setString(222, lstApl.get(i).getEsignaturepart2__c());
						ps.setBoolean(223, lstApl.get(i).isApplication_submitted__c());
						ps.setString(224, lstApl.get(i).getStock_ps__c());
						ps.setString(225, lstApl.get(i).getOrder_id__c());
						ps.setBoolean(226, lstApl.get(i).isSuppress_screening_validation__c());
						ps.setString(227, lstApl.get(i).getHcr_manager_emp_id__c());
						ps.setString(228, lstApl.get(i).getHire_start_date_ps__c());
						ps.setFloat(229, lstApl.get(i).getLegacy_taleo_hours_worked__c());
						ps.setString(230, lstApl.get(i).getStep__c());
						ps.setString(231, lstApl.get(i).getPreferred_last_name_ps__c());
						ps.setString(232, lstApl.get(i).getPaybasis_ps__c());
						ps.setString(233, lstApl.get(i).getSource_other__c());
						ps.setString(234, lstApl.get(i).getDate_component__c());
						ps.setString(235, lstApl.get(i).getTranslated_requisition_title__c());
						ps.setBoolean(236, lstApl.get(i).isTagged__c());
						ps.setString(237, lstApl.get(i).getAppointment_3_interview_results__c());
						ps.setString(238, lstApl.get(i).getLocation_country__c());
						ps.setString(239, lstApl.get(i).getInformatica_key__c());
						ps.setString(240, lstApl.get(i).getAppointment_2_interview_results__c());
						ps.setString(241, lstApl.get(i).getWorkflow_name__c());
						ps.setString(242, lstApl.get(i).getLocation_code_ps__c());
						ps.setFloat(243, lstApl.get(i).getOffer_out__c());
						ps.setFloat(244, lstApl.get(i).getNo_show_count__c());
						ps.setString(245, lstApl.get(i).getEsignature_read_general__c());
						ps.setString(246, lstApl.get(i).getTranslated_address__c());
						ps.setBoolean(247, lstApl.get(i).isNo_show_indicator__c());
						ps.setString(248, lstApl.get(i).getMatched_onbase__c());
						ps.setString(249, lstApl.get(i).getPay_rate_ps__c());
						ps.setBoolean(250, lstApl.get(i).isReq_bypass_scheduling__c());
						ps.setString(251, lstApl.get(i).getHr_shift_description__c());
						ps.setString(252, lstApl.get(i).getShift_differential_ps__c());
						ps.setString(253, lstApl.get(i).getLegacy_taleo_app_interview_info_de__c());
						ps.setString(254, lstApl.get(i).getPreferred_first_name_ps__c());
						ps.setString(255, lstApl.get(i).getAppointment_1_interview_results__c());
						ps.setTimestamp(256, lstApl.get(i).getAppointment_start_time__c());
						ps.setString(257, lstApl.get(i).getLocation_address_line2__c());
						ps.setString(258, lstApl.get(i).getConnectionreceivedid());
						ps.setDate(259, lstApl.get(i).getBackground_check_initiation_date__c());
						ps.setString(260, lstApl.get(i).getHr_alps_code__c());
						ps.setDate(261, lstApl.get(i).getLegacy_taleo_orientation_date__c());
						ps.setString(262, lstApl.get(i).getApp_my_job_status__c());
						ps.setString(263, lstApl.get(i).getApp_performance_pool__c());
						ps.setString(264, lstApl.get(i).getCreatedbyid());
						ps.setString(265, lstApl.get(i).getNationalidcountry__c());
						ps.setString(266, lstApl.get(i).getCandidateidsearchsupport__c());
						ps.setString(267, lstApl.get(i).getSpecial_skills__c());
						ps.setString(268, lstApl.get(i).getApp_performance_counsel__c());
						ps.setString(269, lstApl.get(i).getLegacy_taleo_fclm_job__c());
						ps.setBoolean(270, lstApl.get(i).isIs_node_application__c());
						ps.setString(271, lstApl.get(i).getLegacy_taleo_pool__c());
						ps.setString(272, lstApl.get(i).getLocation_address_line1__c());
						ps.setString(273, lstApl.get(i).getTranslated_directions_instructions__c());
						ps.setString(274, lstApl.get(i).getHr_location_description__c());
						ps.setBoolean(275, lstApl.get(i).isBypassed_cultural_assessment__c());
						ps.setString(276, lstApl.get(i).getSubsource_ps__c());
						ps.setString(277, lstApl.get(i).getAssessmentoverallscore__c());
						ps.setString(278, lstApl.get(i).getHr_department__c());
						ps.setString(279, lstApl.get(i).getAmazon_rejects_detail_picklist__c());
						ps.setString(280, lstApl.get(i).getMaster_shift_code__c());
						ps.setString(281, lstApl.get(i).getOperation__c());
						ps.setBoolean(282, lstApl.get(i).isReq_education__c());
						ps.setString(283, lstApl.get(i).getSource_ps__c());
						ps.setString(284, lstApl.get(i).getRequisition_function_ps__c());
						ps.setTimestamp(285, lstApl.get(i).getCreateddateclone__c());
						ps.setFloat(286, lstApl.get(i).getSubstep_duration__c());
						ps.setString(287, lstApl.get(i).getLocation_state__c());
						ps.setString(288, lstApl.get(i).getNationalidtype__c());
						ps.setFloat(289, lstApl.get(i).getHcr_finance_week_number__c());
						ps.setString(290, lstApl.get(i).getAlps_code_description_ps__c());
						ps.setString(291, lstApl.get(i).getMy_job_status__c());
						ps.setString(292, lstApl.get(i).getLast_modified_date_ps__c());
						ps.setString(293, lstApl.get(i).getLegacy_taleo_amp_eligibility__c());
						ps.setFloat(294, lstApl.get(i).getNumber_of_appointments__c());
						ps.setTimestamp(295, lstApl.get(i).getLastreferenceddate());
						ps.setString(296, lstApl.get(i).getJob_page_label__c());
						ps.setBoolean(297, lstApl.get(i).isActive__c());
						ps.setString(298, lstApl.get(i).getMy_job_status_canada__c());
						ps.setString(299, lstApl.get(i).getEmail_notification_prompt_1_text__c());
						ps.setString(300, lstApl.get(i).getApp_candidate_name__c());
						ps.setString(301, lstApl.get(i).getCandidateaccountid__c());
						ps.setDate(302, lstApl.get(i).getHcr_orientation_date__c());
						ps.setString(303, lstApl.get(i).getWritten_overall__c());
						ps.setString(304, lstApl.get(i).getOrientation_date_ps__c());
						ps.setString(305, lstApl.get(i).getRequisition_type_ps__c());
						ps.setString(306, lstApl.get(i).getHire_end_date_ps__c());
						ps.setString(307, lstApl.get(i).getLegacy_taleo_step_substep__c());
						ps.setTimestamp(308, lstApl.get(i).getEmail_notification_prompt_datetime__c());
						ps.setString(309, lstApl.get(i).getAgency_name__c());
						ps.setString(310, lstApl.get(i).getAlps_code_ps__c());
						ps.setString(311, lstApl.get(i).getEmail_notification_prompt_memo__c());
						ps.setBoolean(312, lstApl.get(i).isAgency_req__c());
						ps.setBoolean(313, lstApl.get(i).isMatched__c());
						ps.setString(314, lstApl.get(i).getFelony_conviction_question_2__c());
						ps.setFloat(315, lstApl.get(i).getPanerrorcount__c());
						ps.setString(316, lstApl.get(i).getEmail_template_formatted_address_label__c());
						ps.setString(317, lstApl.get(i).getLegacy_taleo_shift_differential__c());
						ps.setBoolean(318, lstApl.get(i).isAcknowledge_no_attachment_provided__c());
						ps.setString(319, lstApl.get(i).getEmail_notification_prompt_2_text__c());
						ps.setString(320, lstApl.get(i).getAmzr_error_status__c());
						ps.setString(321, lstApl.get(i).getSfid());
						ps.setLong(322, lstApl.get(i).getId());
						ps.setString(323, lstApl.get(i).get_hc_lastop());
						ps.setString(324, lstApl.get(i).get_hc_err());
						ps.setBoolean(325, lstApl.get(i).isNode_bgc_bypass_for_hire__c());
						ps.setString(326, lstApl.get(i).getInterview_result__c());
						ps.setBoolean(327, lstApl.get(i).isHrloggedascanddiate__c());
						ps.setBoolean(328, lstApl.get(i).isBgc_california_disclosure_fcra__c());
						ps.setString(329, lstApl.get(i).getEmail_notification_prompt_datetime_str__c());
						ps.setBoolean(330, lstApl.get(i).isI9_enabled__c());
						ps.setBoolean(331, lstApl.get(i).isBgc_california_disclosure_icraa__c());
						ps.setString(332, lstApl.get(i).getVirtual_new_hire_event__c());
						ps.setString(333, lstApl.get(i).getSp_q2_first_response__c());
						ps.setBoolean(334, lstApl.get(i).isIs_papi_enabled__c());
						ps.setString(335, lstApl.get(i).getComms_override_nacf_t1_node__c());
						ps.setString(336, lstApl.get(i).getCandidate_last_name_kanji__c());
						ps.setString(337, lstApl.get(i).getSp_q1_first_response__c());
						ps.setString(338, lstApl.get(i).getInclined_value__c());
						ps.setString(339, lstApl.get(i).getNational_id_type__c());
						ps.setString(340, lstApl.get(i).getSp_q3_first_response__c());
						ps.setString(341, lstApl.get(i).getCandidate_first_name_kanji__c());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstApl.size();
					}

				});
	}
	/**
	 * Inserting Assessment data
	 *
	 * @param list of Assessment objects
	 * @return void
	 */ 
	@Override
	public void insertAssessmentData(List<Assessment> lstAssmt) {

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
						ps.setLong(1, lstAssmt.get(i).getId());
						ps.setString(2, lstAssmt.get(i).getAssessment_type__c());
						ps.setString(3, lstAssmt.get(i).getSfid());
						ps.setTimestamp(4, lstAssmt.get(i).getLastmodifieddate());
						ps.setString(5, lstAssmt.get(i).getReplicate_screening__c());
						ps.setString(6, lstAssmt.get(i).getParent_screening__c());
						ps.setTimestamp(7, lstAssmt.get(i).getLastreferenceddate());
						ps.setString(8, lstAssmt.get(i).getApplication_requisition__c());
						ps.setString(9, lstAssmt.get(i).getName());
						ps.setString(10, lstAssmt.get(i).getConnectionsentid());
						ps.setString(11, lstAssmt.get(i).getCandidate__c());
						ps.setString(12, lstAssmt.get(i).getCreatedbyid());
						ps.setBoolean(13, lstAssmt.get(i).isExpired_checkbox__c());
						ps.setString(14, lstAssmt.get(i).getRecordtypeid());
						ps.setString(15, lstAssmt.get(i).getConnectionreceivedid());
						ps.setDate(16, lstAssmt.get(i).getLast_asr_request_date__c());
						ps.setString(17, lstAssmt.get(i).getApplication__c());
						ps.setString(18, lstAssmt.get(i).getScore_name__c());
						ps.setDate(19, lstAssmt.get(i).getInitiation_date__c());
						ps.setDate(20, lstAssmt.get(i).getStatus_date__c());
						ps.setBoolean(21, lstAssmt.get(i).isIs_international_bgc__c());
						ps.setString(22, lstAssmt.get(i).getError_detail_long__c());
						ps.setString(23, lstAssmt.get(i).get_hc_lastop());
						ps.setString(24, lstAssmt.get(i).get_hc_err());
						ps.setBoolean(25, lstAssmt.get(i).isIsdeleted());
						ps.setString(26, lstAssmt.get(i).getApplication_workflow_details__c());
						ps.setString(27, lstAssmt.get(i).getLegacy_taleo_provider_status__c());
						ps.setString(28, lstAssmt.get(i).getLegacy_taleo_screening_requester__c());
						ps.setTimestamp(29, lstAssmt.get(i).getLastvieweddate());
						ps.setString(30, lstAssmt.get(i).getError_detail__c());
						ps.setFloat(31, lstAssmt.get(i).getAccurate_screening_check__c());
						ps.setTimestamp(32, lstAssmt.get(i).getSystemmodstamp());
						ps.setString(33, lstAssmt.get(i).getReceipt_id__c());
						ps.setDate(34, lstAssmt.get(i).getExpirationdate__c());
						ps.setString(35, lstAssmt.get(i).getOriginal_external_order_id__c());
						ps.setBoolean(36, lstAssmt.get(i).isX15_day_screening_validator__c());
						ps.setString(37, lstAssmt.get(i).getCurrent_pan_score__c());
						ps.setString(38, lstAssmt.get(i).getOverall_score__c());
						ps.setBoolean(39, lstAssmt.get(i).isUs_candidate__c());
						ps.setBoolean(40, lstAssmt.get(i).isInvalidated_screening__c());
						ps.setTimestamp(41, lstAssmt.get(i).getCreateddate());
						ps.setString(42, lstAssmt.get(i).getOrder_id__c());
						ps.setString(43, lstAssmt.get(i).getStatus__c());
						ps.setString(44, lstAssmt.get(i).getLastmodifiedbyid());
						ps.setString(45, lstAssmt.get(i).getScreening_pan_package_id__c());
						ps.setString(46, lstAssmt.get(i).getAdpinitiatescreeningurl__c());
						ps.setBoolean(47, lstAssmt.get(i).isBgc_expire_mismatch__c());
						ps.setString(48, lstAssmt.get(i).getAdpscreeningid__c());
						ps.setDate(49, lstAssmt.get(i).getSection1_complete_dt__c());
						ps.setDate(50, lstAssmt.get(i).getTerm_date__c());
						ps.setString(51, lstAssmt.get(i).getI9_status__c());
						ps.setString(52, lstAssmt.get(i).getI9_master_status__c());
						ps.setBoolean(53, lstAssmt.get(i).isCheck_rehire__c());
						ps.setFloat(54, lstAssmt.get(i).getNo_of_retries__c());
						ps.setFloat(55, lstAssmt.get(i).getForm_id__c());
						ps.setString(56, lstAssmt.get(i).getMaster_status__c());
						ps.setString(57, lstAssmt.get(i).getI9_id_type__c());
						ps.setFloat(58, lstAssmt.get(i).getPrevious_i9_status_number__c());
						ps.setString(59, lstAssmt.get(i).getI9_prior_master_status__c());
						ps.setString(60, lstAssmt.get(i).getAirport__c());
						ps.setFloat(61, lstAssmt.get(i).getI9_id__c());
						ps.setBoolean(62, lstAssmt.get(i).isI9_complete__c());
						ps.setFloat(63, lstAssmt.get(i).getI9_status_number__c());
						ps.setDate(64, lstAssmt.get(i).getSection3_complete_dt__c());
						ps.setDate(65, lstAssmt.get(i).getSection2_complete_dt__c());
						ps.setBoolean(66, lstAssmt.get(i).isHas_candidate_screenings__c());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return  lstAssmt.size();
					}

				});

	}
	/**
	 * Inserting EmailMessage data
	 *
	 * @param list of EmailMessage objects
	 * @return void
	 */ 
	@Override
	public void insertEmailMessageData(List<EmailMessage> lstEmms) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.emailmessage "
				+ "(lastmodifieddate,istracked,headers,threadidentifier,activityid,lastopeneddate,emailtemplateid,isexternallyvisible,isclientmanaged,"
				+ "fromname,hasattachment,fromaddress,createdbyid,isopened,ccaddress,parentid,relatedtoid,status,messagedate,isdeleted,incoming,isbounced,"
				+ "validatedfromaddress,subject,systemmodstamp,firstopeneddate,textbody,replytoemailmessageid,htmlbody,createddate,bccaddress,"
				+ "messageidentifier,lastmodifiedbyid,toaddress,sfid,id,_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, lstEmms.get(i).getLastmodifieddate());
						ps.setBoolean(2, lstEmms.get(i).isIstracked());
						ps.setString(3, lstEmms.get(i).getHeaders());
						ps.setString(4, lstEmms.get(i).getThreadidentifier());
						ps.setString(5, lstEmms.get(i).getActivityid());
						ps.setTimestamp(6, lstEmms.get(i).getLastopeneddate());
						ps.setString(7, lstEmms.get(i).getEmailtemplateid());
						ps.setBoolean(8, lstEmms.get(i).isIsexternallyvisible());
						ps.setBoolean(9, lstEmms.get(i).isIsclientmanaged());
						ps.setString(10, lstEmms.get(i).getFromname());
						ps.setBoolean(11, lstEmms.get(i).isHasattachment());
						ps.setString(12, lstEmms.get(i).getFromaddress());
						ps.setString(13, lstEmms.get(i).getCreatedbyid());
						ps.setBoolean(14, lstEmms.get(i).isIsopened());
						ps.setString(15, lstEmms.get(i).getCcaddress());
						ps.setString(16, lstEmms.get(i).getParentid());
						ps.setString(17, lstEmms.get(i).getRelatedtoid());
						ps.setString(18, lstEmms.get(i).getStatus());
						ps.setTimestamp(19, lstEmms.get(i).getMessagedate());
						ps.setBoolean(20, lstEmms.get(i).isIsdeleted());
						ps.setBoolean(21, lstEmms.get(i).isIncoming());
						ps.setBoolean(22, lstEmms.get(i).isIsbounced());
						ps.setString(23, lstEmms.get(i).getValidatedfromaddress());
						ps.setString(24, lstEmms.get(i).getSubject());
						// ps.setBoolean(25, lstEmms.get(i).isIsdeleted());
						ps.setTimestamp(25, lstEmms.get(i).getSystemmodstamp());
						ps.setTimestamp(26, lstEmms.get(i).getFirstopeneddate());
						ps.setString(27, lstEmms.get(i).getTextbody());
						ps.setString(28, lstEmms.get(i).getReplytoemailmessageid());
						ps.setString(29, lstEmms.get(i).getHtmlbody());
						ps.setTimestamp(30, lstEmms.get(i).getCreateddate());
						ps.setString(31, lstEmms.get(i).getBccaddress());
						ps.setString(32, lstEmms.get(i).getMessageidentifier());
						ps.setString(33, lstEmms.get(i).getLastmodifiedbyid());
						ps.setString(34, lstEmms.get(i).getToaddress());
						ps.setString(35, lstEmms.get(i).getSfid());
						ps.setLong(36, lstEmms.get(i).getId());
						ps.setString(37, lstEmms.get(i).get_hc_lastop());
						ps.setString(38, lstEmms.get(i).get_hc_err());


					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstEmms.size();
					}

				});

	}
	/**
	 * Inserting ErrorLog data
	 *
	 * @param list of ErrorLog objects
	 * @return void
	 */ 
	@Override
	public void insertErrorLogData(List<ErrorLog> lstErrlog) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.error_log__c "
				+ "(exception_stack_trace__c,lastmodifieddate,isdeleted,exception_message__c,exception_type__c,"
				+ "apex_class_name__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,"
				+ "connectionreceivedid,exception_line_number__c,lastmodifiedbyid,related_application__c,sfid,id,"
				+ "_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, lstErrlog.get(i).getException_stack_trace__c());
						ps.setTimestamp(2, lstErrlog.get(i).getLastmodifieddate());
						ps.setBoolean(3, lstErrlog.get(i).isIsdeleted());
						ps.setString(4, lstErrlog.get(i).getException_message__c());
						ps.setString(5, lstErrlog.get(i).getException_type__c());
						ps.setString(6, lstErrlog.get(i).getApex_class_name__c());
						ps.setString(7, lstErrlog.get(i).getName());
						ps.setTimestamp(8, lstErrlog.get(i).getSystemmodstamp());
						ps.setString(9, lstErrlog.get(i).getConnectionsentid());
						ps.setString(10, lstErrlog.get(i).getOwnerid());
						ps.setString(11, lstErrlog.get(i).getCreatedbyid());
						ps.setTimestamp(12, lstErrlog.get(i).getCreateddate());
						ps.setString(13, lstErrlog.get(i).getConnectionreceivedid());
						ps.setFloat(14, lstErrlog.get(i).getException_line_number__c());
						ps.setString(15, lstErrlog.get(i).getLastmodifiedbyid());
						ps.setString(16, lstErrlog.get(i).getRelated_application__c());
						ps.setString(17, lstErrlog.get(i).getSfid());
						ps.setLong(18, lstErrlog.get(i).getId());
						ps.setString(19, lstErrlog.get(i).get_hc_lastop());
						ps.setString(20, lstErrlog.get(i).get_hc_err());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstErrlog.size();
					}

				});

	}
	/**
	 * Inserting IntegrationTransaction data
	 *
	 * @param list of IntegrationTransaction objects
	 * @return void
	 */ 
	@Override
	public void insertIntegrationTransactionData(List<IntegrationTransaction> lstIntrans) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.integration_transaction__c "
				+ "(lastmodifieddate,transaction_type__c,lastreferenceddate,name,connectionsentid,transaction_date_ff__c,createdbyid,connectionreceivedid,"
				+ "requestor_id_ps__c,number_of_attempts__c,it_candidate__c,creation_outside__c,it_application__c,outbound_message__c,isdeleted,"
				+ "error_summary__c,it_screening__c,lastvieweddate,processed__c,inbound_message__c,system__c,error_detail__c,systemmodstamp,"
				+ "x15_minutes_from_now__c,transaction_status__c,createddate,lastactivitydate,environment__c,lastmodifiedbyid,transaction_date__c,sfid,"
				+ "_hc_lastop,_hc_err,number_of_noshows__c,is_papi_enabled__c,system_path__c,sub_status__c,id)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, lstIntrans.get(i).getLastmodifieddate());
						ps.setString(2, lstIntrans.get(i).getTransaction_type__c());
						ps.setTimestamp(3, lstIntrans.get(i).getLastreferenceddate());
						ps.setString(4, lstIntrans.get(i).getName());
						ps.setString(5, lstIntrans.get(i).getConnectionsentid());
						ps.setString(6, lstIntrans.get(i).getTransaction_date_ff__c());
						ps.setString(7, lstIntrans.get(i).getCreatedbyid());
						ps.setString(8, lstIntrans.get(i).getConnectionreceivedid());
						ps.setString(9, lstIntrans.get(i).getRequestor_id_ps__c());
						ps.setFloat(10, lstIntrans.get(i).getNumber_of_attempts__c());
						ps.setString(11, lstIntrans.get(i).getIt_candidate__c());
						ps.setBoolean(12, lstIntrans.get(i).isCreation_outside__c());
						ps.setString(13, lstIntrans.get(i).getIt_application__c());
						ps.setString(14, lstIntrans.get(i).getOutbound_message__c());
						ps.setBoolean(15, lstIntrans.get(i).isIsdeleted());
						ps.setString(16, lstIntrans.get(i).getError_summary__c());
						ps.setString(17, lstIntrans.get(i).getIt_screening__c());
						ps.setTimestamp(18, lstIntrans.get(i).getLastvieweddate());
						ps.setBoolean(19, lstIntrans.get(i).isProcessed__c());
						ps.setString(20, lstIntrans.get(i).getInbound_message__c());
						ps.setString(21, lstIntrans.get(i).getSystem__c());
						ps.setString(22, lstIntrans.get(i).getError_detail__c());
						ps.setTimestamp(23, lstIntrans.get(i).getSystemmodstamp());
						ps.setTimestamp(24, lstIntrans.get(i).getX15_minutes_from_now__c());
						ps.setString(25, lstIntrans.get(i).getTransaction_status__c());
						ps.setTimestamp(26, lstIntrans.get(i).getCreateddate());
						ps.setDate(27, lstIntrans.get(i).getLastactivitydate());
						ps.setString(28, lstIntrans.get(i).getEnvironment__c());
						ps.setString(29, lstIntrans.get(i).getLastmodifiedbyid());
						ps.setTimestamp(30, lstIntrans.get(i).getTransaction_date__c());
						ps.setString(31, lstIntrans.get(i).getSfid());
						ps.setString(32, lstIntrans.get(i).get_hc_lastop());
						ps.setString(33, lstIntrans.get(i).get_hc_err());
						ps.setFloat(34, lstIntrans.get(i).getNumber_of_noshows__c());
						ps.setBoolean(35, lstIntrans.get(i).isIs_papi_enabled__c());
						ps.setString(36, lstIntrans.get(i).getSystem_path__c());
						ps.setString(37, lstIntrans.get(i).getSub_status__c());
						ps.setLong(38, lstIntrans.get(i).getId());


					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstIntrans.size();
					}

				});

	}
	/**
	 * Inserting Interview data
	 *
	 * @param list of Interview objects
	 * @return void
	 */ 
	@Override
	public void insertInterviewData(List<Interview> lstInterview) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.interview__c "
				+ "(lastmodifieddate,appt_time_zone__c,appt_end_time__c,special_skills__c,name,candidate__c,createdbyid,candidate_last_name__c,timeslot__c,general_notes__c,recruiting_event_type__c,appt_start_datetime__c,isdeleted,appt_recruiting_event_link__c,lastvieweddate,translated_address__c,requisition_id__c,createddate,appointment_date__c,appt_end_time_text__c,pool_substep__c,active__c,appt_timespan_number__c,interview_type__c,appt_start_date__c,appt_requisition_link__c,scheduling_type__c,shift_comments__c,interview_question_set__c,email_template_name__c,event_type__c,lastreferenceddate,connectionsentid,appt_status__c,candidate_actual_time_zone__c,candidate_first_name__c,connectionreceivedid,appt_start_time_text__c,translated_directions_instructions__c,application__c,appt_end_date__c,interview_outcome__c,role__c,candidate_language__c,shift__c,systemmodstamp,appt_address__c,uniqueness_validation_key__c,appt_time_zone_key__c,appt_start_time__c,lastmodifiedbyid,candidate_email__c,interviewer__c,sfid,id,_hc_lastop,_hc_err,virtual_new_hire_event__c,cid__c\r\n"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, lstInterview.get(i).getLastmodifieddate());
						ps.setString(2, lstInterview.get(i).getAppt_time_zone__c());
						ps.setTimestamp(3, lstInterview.get(i).getAppt_end_time__c());
						ps.setString(4, lstInterview.get(i).getSpecial_skills__c());
						ps.setString(5, lstInterview.get(i).getName());
						ps.setString(6, lstInterview.get(i).getCandidate__c());
						ps.setString(7, lstInterview.get(i).getCreatedbyid());
						ps.setString(8, lstInterview.get(i).getCandidate_last_name__c());
						ps.setString(9, lstInterview.get(i).getTimeslot__c());
						ps.setString(10, lstInterview.get(i).getGeneral_notes__c());
						ps.setString(11, lstInterview.get(i).getRecruiting_event_type__c());
						ps.setTimestamp(12, lstInterview.get(i).getAppt_start_datetime__c());
						ps.setBoolean(13, lstInterview.get(i).isIsdeleted());
						ps.setString(14, lstInterview.get(i).getAppt_recruiting_event_link__c());
						ps.setTimestamp(15, lstInterview.get(i).getLastvieweddate());
						ps.setString(16, lstInterview.get(i).getTranslated_address__c());
						ps.setString(17, lstInterview.get(i).getRequisition_id__c());
						ps.setTimestamp(18, lstInterview.get(i).getCreateddate());
						ps.setDate(19, lstInterview.get(i).getAppointment_date__c());
						ps.setString(20, lstInterview.get(i).getAppt_end_time_text__c());
						ps.setString(21, lstInterview.get(i).getPool_substep__c());
						ps.setBoolean(22, lstInterview.get(i).isActive__c());
						ps.setString(23, lstInterview.get(i).getAppt_timespan_number__c());
						ps.setString(24, lstInterview.get(i).getInterview_type__c());
						ps.setString(25, lstInterview.get(i).getAppt_start_date__c());
						ps.setString(26, lstInterview.get(i).getAppt_requisition_link__c());
						ps.setString(27, lstInterview.get(i).getScheduling_type__c());
						ps.setString(28, lstInterview.get(i).getShift_comments__c());
						ps.setString(29, lstInterview.get(i).getInterview_question_set__c());
						ps.setString(30, lstInterview.get(i).getEmail_template_name__c());
						ps.setString(31, lstInterview.get(i).getEvent_type__c());
						ps.setTimestamp(32, lstInterview.get(i).getLastreferenceddate());
						ps.setString(33, lstInterview.get(i).getConnectionsentid());
						ps.setString(34, lstInterview.get(i).getAppt_status__c());
						ps.setString(35, lstInterview.get(i).getCandidate_actual_time_zone__c());
						ps.setString(36, lstInterview.get(i).getCandidate_first_name__c());
						ps.setString(37, lstInterview.get(i).getConnectionreceivedid());
						ps.setString(38, lstInterview.get(i).getAppt_start_time_text__c());
						ps.setString(39, lstInterview.get(i).getTranslated_directions_instructions__c());
						ps.setString(40, lstInterview.get(i).getApplication__c());
						ps.setString(41, lstInterview.get(i).getAppt_end_date__c());
						ps.setString(42, lstInterview.get(i).getInterview_outcome__c());
						ps.setString(43, lstInterview.get(i).getRole__c());
						ps.setString(44, lstInterview.get(i).getCandidate_language__c());
						ps.setString(45, lstInterview.get(i).getShift__c());
						ps.setTimestamp(46, lstInterview.get(i).getSystemmodstamp());
						ps.setString(47, lstInterview.get(i).getAppt_address__c());
						ps.setString(48, lstInterview.get(i).getUniqueness_validation_key__c());
						ps.setString(49, lstInterview.get(i).getAppt_time_zone_key__c());
						ps.setTimestamp(50, lstInterview.get(i).getAppt_start_time__c());
						ps.setString(51, lstInterview.get(i).getLastmodifiedbyid());
						ps.setString(52, lstInterview.get(i).getCandidate_email__c());
						ps.setString(53, lstInterview.get(i).getInterviewer__c());
						ps.setString(54, lstInterview.get(i).getSfid());
						ps.setLong(55, lstInterview.get(i).getId());
						ps.setString(56, lstInterview.get(i).get_hc_lastop());
						ps.setString(57, lstInterview.get(i).get_hc_err());
						ps.setString(58, lstInterview.get(i).getVirtual_new_hire_event__c());
						ps.setString(59, lstInterview.get(i).getCid__c()); 	


					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstInterview.size();
					}

				});

	}
	/**
	 * Inserting Note data
	 *
	 * @param list of Note objects
	 * @return void
	 */ 
	@Override
	public void insertNoteData(List<Note> lstNotes) {
		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.note "
				+ "(body,parentid,lastmodifieddate,ownerid,isdeleted,systemmodstamp,lastmodifiedbyid,createddate,title,isprivate,createdbyid,sfid,id,_hc_lastop,_hc_err"
				+ "" + ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",

				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setString(1, lstNotes.get(i).getBody());
						ps.setString(2, lstNotes.get(i).getParentid());
						ps.setTimestamp(3, lstNotes.get(i).getLastmodifieddate());
						ps.setString(4, lstNotes.get(i).getOwnerid());
						ps.setBoolean(5, lstNotes.get(i).isIsdeleted());
						ps.setTimestamp(6, lstNotes.get(i).getSystemmodstamp());
						ps.setString(7, lstNotes.get(i).getLastmodifiedbyid());
						ps.setTimestamp(8, lstNotes.get(i).getCreateddate());
						ps.setString(9, lstNotes.get(i).getTitle());
						ps.setBoolean(10, lstNotes.get(i).isIsprivate());
						ps.setString(11, lstNotes.get(i).getCreatedbyid());
						ps.setString(12, lstNotes.get(i).getSfid());
						ps.setLong(13, lstNotes.get(i).getId());
						ps.setString(14, lstNotes.get(i).get_hc_lastop());
						ps.setString(15, lstNotes.get(i).get_hc_err());
					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstNotes.size();
					}

				});

	}
	/**
	 * Inserting Response data
	 *
	 * @param list of Response objects
	 * @return void
	 */
	@Override
	public void insertResponseData(List<Response> lstResponse) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response__c "
				+ "(lastmodifieddate,question_text__c,disqualifying_answer__c,lastreferenceddate,interviewer_comment__c,response__c,interview__c,name,connectionsentid,ownerid,createdbyid,connectionreceivedid,application__c,question__c,isdeleted,legacy_taleo_qa_response_identifier__c,lastvieweddate,systemmodstamp,meets_requirements__c,question_type__c,competency__c,createddate,score__c,lastmodifiedbyid,question_html_type__c,sfid,id,_hc_lastop,_hc_err,related_field__c"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, lstResponse.get(i).getLastmodifieddate());
						ps.setString(2, lstResponse.get(i).getQuestion_text__c());
						ps.setBoolean(3, lstResponse.get(i).isDisqualifying_answer__c());
						ps.setTimestamp(4, lstResponse.get(i).getLastreferenceddate());
						ps.setString(5, lstResponse.get(i).getInterviewer_comment__c());
						ps.setString(6, lstResponse.get(i).getResponse__c());
						ps.setString(7, lstResponse.get(i).getInterview__c());
						ps.setString(8, lstResponse.get(i).getName());
						ps.setString(9, lstResponse.get(i).getConnectionsentid());
						ps.setString(10, lstResponse.get(i).getOwnerid());
						ps.setString(11, lstResponse.get(i).getCreatedbyid());
						ps.setString(12, lstResponse.get(i).getConnectionreceivedid());
						ps.setString(13, lstResponse.get(i).getApplication__c());

						ps.setString(14, lstResponse.get(i).getQuestion__c());
						ps.setBoolean(15, lstResponse.get(i).isIsdeleted());
						ps.setString(16, lstResponse.get(i).getLegacy_taleo_qa_response_identifier__c());
						ps.setTimestamp(17, lstResponse.get(i).getLastvieweddate());

						ps.setTimestamp(18, lstResponse.get(i).getSystemmodstamp());
						ps.setString(19, lstResponse.get(i).getMeets_requirements__c());
						ps.setString(20, lstResponse.get(i).getQuestion_type__c());
						ps.setString(21, lstResponse.get(i).getCompetency__c());
						ps.setTimestamp(22, lstResponse.get(i).getCreateddate());
						ps.setString(23, lstResponse.get(i).getScore__c());
						ps.setString(24, lstResponse.get(i).getLastmodifiedbyid());
						ps.setString(25, lstResponse.get(i).getQuestion_html_type__c());
						ps.setString(26, lstResponse.get(i).getSfid());
						ps.setLong(27, lstResponse.get(i).getId());

						ps.setString(28, lstResponse.get(i).get_hc_lastop());
						ps.setString(29, lstResponse.get(i).get_hc_err());
						ps.setString(30, lstResponse.get(i).getRelated_field__c());
					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstResponse.size();
					}

				});

	}
	/**
	 * Inserting ResponseAnswer data
	 *
	 * @param list of ResponseAnswer objects
	 * @return void
	 */
	@Override
	public void insertResponseAnswerData(List<ResponseAnswer> lstResponseanswer) {

		int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response_answer__c "
				+ "(lastmodifieddate,isdeleted,answer__c,response__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,connectionreceivedid,lastmodifiedbyid,sfid,id,_hc_lastop,_hc_err\r\n"
				+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setTimestamp(1, lstResponseanswer.get(i).getLastmodifieddate());
						ps.setBoolean(2, lstResponseanswer.get(i).getIsdeleted());
						ps.setString(3, lstResponseanswer.get(i).getAnswer__c());
						ps.setString(4, lstResponseanswer.get(i).getResponse__c());
						ps.setString(5, lstResponseanswer.get(i).getName());
						ps.setTimestamp(6, lstResponseanswer.get(i).getSystemmodstamp());
						ps.setString(7, lstResponseanswer.get(i).getConnectionsentid());
						ps.setString(8, lstResponseanswer.get(i).getOwnerid());
						ps.setString(9, lstResponseanswer.get(i).getCreatedbyid());
						ps.setTimestamp(10, lstResponseanswer.get(i).getCreateddate());
						ps.setString(11, lstResponseanswer.get(i).getConnectionreceivedid());
						ps.setString(12, lstResponseanswer.get(i).getLastmodifiedbyid());
						ps.setString(13, lstResponseanswer.get(i).getSfid());

						ps.setLong(14, lstResponseanswer.get(i).getId());
						ps.setString(15, lstResponseanswer.get(i).get_hc_lastop());
						ps.setString(16, lstResponseanswer.get(i).get_hc_err());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return lstResponseanswer.size();
					}

				});

	}
}
