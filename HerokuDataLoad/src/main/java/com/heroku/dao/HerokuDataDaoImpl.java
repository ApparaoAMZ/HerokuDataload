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
	private final int INSERT_BATCH_SIZE = 50000;

	/**
	 * Inserting Application data
	 *
	 * @param list of application objects
	 * @return void
	 */
	@Override
	public void insertApplicationData(List<Application> lstApl) {
		for (int j = 0; j < lstApl.size(); j += INSERT_BATCH_SIZE) {
			final List<Application> batchList = lstApl.subList(j,
					j + INSERT_BATCH_SIZE > lstApl.size() ? lstApl.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchList.size());

			int[] insertCounts = jdbcTemplate.batchUpdate(
					"insert into sf_archive.application__c (candidate__c,national_id_country_ps__c,more_than_one_application__c,legacy_taleo_external_id__c,felony_conviction_question_1__c,requisition_hiring_function__c,email_notification_prompt_3_text__c,bgc_authorization_1_date__c,hcr_hiring_manager_full_name__c,candidate_withdraws_detail__c,candidate_owner_id__c,requisition_reg_temp__c,app_performance_curve__c,tech_insight_score__c,us_candidate__c,legacy_taleo_fclm_area__c,createdfrompostcard__c,email_notification_prompt_4_text__c,bgc_authorization_2_date__c,app_performance_hours__c,peoplesoft_pre_processing_substep__c,most_recent_substep_change_date__c,hr_location_code__c,hr_manager_login__c,agency_subsource_ps__c,gender_ps__c,education_qualification_check__c,previous_step_substep__c,typing_accuracy__c,job_page_url__c,enable_concurrent_contingencies__c,application_esignature_date_time_part2__c,artdoc_candidate_id__c,sign_on_bonus_ps__c,application_esignature_date_time__c,phone_tool_title_ps__c,hcr_hiring_manager_title__c,in_invitation_extension_substep__c,req_auto_send_contingent_offer__c,app_performance_eligibility__c,legacy_taleo_overall_assessment__c,contingent_offer_extended__c,hr_requisition_title__c,cloned_due_to_process_on_other_req__c,workflow__c,backgroundcheckoverallscore__c,legacy_taleo_recruiter__c,typing_speed__c,hcr_day_1_day_ps__c,panattemptcount__c,order_id_override__c,hr_shift_code__c,node_requisition__c,hcr_orientation_session__c,headcount_request__c,bgc_disclosure_date__c,hr_open__c,hcr_location_address1__c,requisition_id__c,legacy_taleo_department_extension__c,businessunit_ps__c,source_details__c,source_primary__c,selected_shift__c,candidateid__c,sp_q1_response__c,appointment_search_filter_date__c,app_rehire_eligibility_status__c,hcr_orientation_date_ps__c,legacy_taleo_hiring_area_manager__c,legacy_taleo_shift_comments__c,career_portal_url__c,status_onbase__c,sp_q2_response__c,current_integration_step__c,acknowledge_no_work_experience__c,rpt_compare_start_date_with_day1__c,hire_back_dated_candidates_ps__c,requisition__c,sp_q3_response__c,legacy_taleo_submission_medium__c,selected_shift_valid__c,legacy_taleo_orientation_session__c,rewind__c,hr_hired__c,requisition_function__c,legacy_taleo_overall_percentile__c,my_job_status_global__c,bgc_disclosure_frca__c,lastvieweddate,email_notification_subject__c,account_employee_id__c,bgc_authorization2__c,ps_integration_enabled__c,owner_id_validator__c,hcr_location_postalcode__c,submitted_app_on_file__c,reschedule_count__c,agency_conversion_check__c,preferred_location_code__c,bgc_authorization1__c,my_job_status_de__c,app_my_job_status_global__c,free_consumer_report_requested__c,respects_special_jurisdiction__c,meets_education_requirement__c,step_substep__c,req_contingency_bypass__c,hr_requested__c,application_shift_code__c,backgroundchkexpirydate__c,work_flow_rule_trigger__c,current_mailing_state_province__c,salary_ps__c,letter_of_intent_selection__c,jobcode_ps__c,name,candidate_last_name__c,recruiter_employee_id__c,continue_application__c,hcr_department_description__c,bgc_disclosure_frca_esignature__c,drugtestoverallscore__c,location_postal_code__c,vcpprp_ps__c,pay_rate__c,contract_title_ps__c,role__c,stdhours_ps__c,hr_hiring_manager_name__c,app_language__c,hire_start_date__c,candidate_first_name__c,hr_day_1_day__c,letter_of_intent_completed_date__c,legacy_taleo_shift__c,conversion__c,lastmodifieddate,location_city__c,matching_location_code__c,application_withdrawn__c,hcr_hire_end_date__c,ownerid,tech_force_email_rule_execution__c,instance__c,requisition_title__c,appointment_4__c,phone_screen_results__c,requisition_location_code__c,in_manage_hire__c,best_suitable_skill__c,hcr_location_country__c,legacy_taleo_e_signature_ip__c,isdeleted,portal_application_status__c,background_check_counter__c,accurate_screening_check__c,legacy_taleo_application_creation_date__c,company_code_ps__c,hcr_request_id__c,appointment_3__c,legacy_taleo_correspondence_information__c,requisition_country__c,email_notification_body__c,systemmodstamp,drugtestexpirydate__c,lastmodifiedbyid,bypass_dt_bgc_validation__c,timeslots_available__c,app_scheduling_group__c,app_performance_agency__c,hcr_department_code__c,email_notification_rich_text_2__c,part_2_completed__c,connectionsentid,appointment_2__c,national_id_type_ps__c,rehire_eligibility_audit__c,hcr_number__c,shift_comments__c,currency_ps__c,appointment_1__c,legacy_taleo_hire_end_date__c,application_shift_description__c,candidatesfdcid__c,hr_requistion_id__c,lastactivitydate,spoken_overall__c,preferred_location_description__c,first_available_start_date__c,app_performance_points__c,hcr_location_state__c,current_appointment_number__c,pan_candidate_attempt__c,most_recent_substep_change_datetime__c,tier_3_interview_results__c,pan_package_id_trigger__c,contract_signer_name_ps__c,hr_matched__c,app_languagelocalekey__c,hr_business_title__c,bgc_disclosure__c,contingent_offer_accepted__c,contingent_offer_shift_code_description__c,hcr_hire_start_date__c,agency_source_ps__c,app_languagecountrycode__c,interview_completed__c,tier_1_interview_results__c,legacy_taleo_scheduling_information__c,hcr_location_city__c,email_template_name__c,app_overall_percentile__c,req_hourly_rate__c,override_bgc_validation__c,appointment_4_interview_results__c,createddate,hr_shift_differential__c,backgroundcheckstatus__c,substep__c,duplicate_contact__c,esignaturepart2__c,application_submitted__c,stock_ps__c,order_id__c,suppress_screening_validation__c,hcr_manager_emp_id__c,hire_start_date_ps__c,legacy_taleo_hours_worked__c,step__c,preferred_last_name_ps__c,paybasis_ps__c,source_other__c,date_component__c,translated_requisition_title__c,tagged__c,appointment_3_interview_results__c,location_country__c,informatica_key__c,appointment_2_interview_results__c,workflow_name__c,location_code_ps__c,offer_out__c,no_show_count__c,esignature_read_general__c,translated_address__c,no_show_indicator__c,matched_onbase__c,pay_rate_ps__c,req_bypass_scheduling__c,hr_shift_description__c,shift_differential_ps__c,legacy_taleo_app_interview_info_de__c,preferred_first_name_ps__c,appointment_1_interview_results__c,appointment_start_time__c,location_address_line2__c,connectionreceivedid,background_check_initiation_date__c,hr_alps_code__c,legacy_taleo_orientation_date__c,app_my_job_status__c,app_performance_pool__c,createdbyid,nationalidcountry__c,candidateidsearchsupport__c,special_skills__c,app_performance_counsel__c,legacy_taleo_fclm_job__c,is_node_application__c,legacy_taleo_pool__c,location_address_line1__c,translated_directions_instructions__c,hr_location_description__c,bypassed_cultural_assessment__c,subsource_ps__c,assessmentoverallscore__c,hr_department__c,amazon_rejects_detail_picklist__c,master_shift_code__c,operation__c,req_education__c,source_ps__c,requisition_function_ps__c,createddateclone__c,substep_duration__c,location_state__c,nationalidtype__c,hcr_finance_week_number__c,alps_code_description_ps__c,my_job_status__c,last_modified_date_ps__c,legacy_taleo_amp_eligibility__c,number_of_appointments__c,lastreferenceddate,job_page_label__c,active__c,my_job_status_canada__c,email_notification_prompt_1_text__c,app_candidate_name__c,candidateaccountid__c,hcr_orientation_date__c,written_overall__c,orientation_date_ps__c,requisition_type_ps__c,hire_end_date_ps__c,legacy_taleo_step_substep__c,email_notification_prompt_datetime__c,agency_name__c,alps_code_ps__c,email_notification_prompt_memo__c,agency_req__c,matched__c,felony_conviction_question_2__c,panerrorcount__c,email_template_formatted_address_label__c,legacy_taleo_shift_differential__c,acknowledge_no_attachment_provided__c,email_notification_prompt_2_text__c,amzr_error_status__c,sfid,id,_hc_lastop,_hc_err,node_bgc_bypass_for_hire__c,interview_result__c,hrloggedascanddiate__c,bgc_california_disclosure_fcra__c,email_notification_prompt_datetime_str__c,i9_enabled__c,bgc_california_disclosure_icraa__c,virtual_new_hire_event__c,sp_q2_first_response__c,is_papi_enabled__c,comms_override_nacf_t1_node__c,candidate_last_name_kanji__c,sp_q1_first_response__c,inclined_value__c,national_id_type__c,sp_q3_first_response__c,candidate_first_name_kanji__c\r\n"
							+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\r\n"
							+ ")",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setString(1, batchList.get(i).getCandidate__c());
							ps.setString(2, batchList.get(i).getNational_id_country_ps__c());
							ps.setBoolean(3, batchList.get(i).isMore_than_one_application__c());
							ps.setString(4, batchList.get(i).getLegacy_taleo_external_id__c());
							ps.setString(5, batchList.get(i).getFelony_conviction_question_1__c());
							ps.setString(6, batchList.get(i).getRequisition_hiring_function__c());
							ps.setString(7, batchList.get(i).getEmail_notification_prompt_3_text__c());
							ps.setTimestamp(8, batchList.get(i).getBgc_authorization_1_date__c());
							ps.setString(9, batchList.get(i).getHcr_hiring_manager_full_name__c());
							ps.setString(10, batchList.get(i).getCandidate_withdraws_detail__c());
							ps.setString(11, batchList.get(i).getCandidate_owner_id__c());
							ps.setString(12, batchList.get(i).getRequisition_reg_temp__c());
							ps.setFloat(13, batchList.get(i).getApp_performance_curve__c());
							ps.setString(14, batchList.get(i).getTech_insight_score__c());
							ps.setBoolean(15, batchList.get(i).isUs_candidate__c());
							ps.setString(16, batchList.get(i).getLegacy_taleo_fclm_area__c());
							ps.setBoolean(17, batchList.get(i).isCreatedfrompostcard__c());
							ps.setString(18, batchList.get(i).getEmail_notification_prompt_4_text__c());
							ps.setTimestamp(19, batchList.get(i).getBgc_authorization_2_date__c());
							ps.setFloat(20, batchList.get(i).getApp_performance_hours__c());
							ps.setBoolean(21, batchList.get(i).isPeoplesoft_pre_processing_substep__c());
							ps.setDate(22, batchList.get(i).getMost_recent_substep_change_date__c());
							ps.setString(23, batchList.get(i).getHr_location_code__c());
							ps.setString(24, batchList.get(i).getHr_manager_login__c());
							ps.setString(25, batchList.get(i).getAgency_subsource_ps__c());
							ps.setString(26, batchList.get(i).getGender_ps__c());
							ps.setBoolean(27, batchList.get(i).isEducation_qualification_check__c());
							ps.setString(28, batchList.get(i).getPrevious_step_substep__c());
							ps.setString(29, batchList.get(i).getTyping_accuracy__c());
							ps.setString(30, batchList.get(i).getJob_page_url__c());
							ps.setBoolean(31, batchList.get(i).isEnable_concurrent_contingencies__c());
							ps.setTimestamp(32, batchList.get(i).getApplication_esignature_date_time_part2__c());
							ps.setString(33, batchList.get(i).getArtdoc_candidate_id__c());
							ps.setString(34, batchList.get(i).getSign_on_bonus_ps__c());
							ps.setTimestamp(35, batchList.get(i).getApplication_esignature_date_time__c());
							ps.setString(36, batchList.get(i).getPhone_tool_title_ps__c());
							ps.setString(37, batchList.get(i).getHcr_hiring_manager_title__c());
							ps.setBoolean(38, batchList.get(i).isIn_invitation_extension_substep__c());
							ps.setString(39, batchList.get(i).getReq_auto_send_contingent_offer__c());
							ps.setString(40, batchList.get(i).getApp_performance_eligibility__c());
							ps.setString(41, batchList.get(i).getLegacy_taleo_overall_assessment__c());
							ps.setTimestamp(42, batchList.get(i).getContingent_offer_extended__c());
							ps.setString(43, batchList.get(i).getHr_requisition_title__c());
							ps.setBoolean(44, batchList.get(i).isCloned_due_to_process_on_other_req__c());
							ps.setString(45, batchList.get(i).getWorkflow__c());
							ps.setString(46, batchList.get(i).getBackgroundcheckoverallscore__c());
							ps.setString(47, batchList.get(i).getLegacy_taleo_recruiter__c());
							ps.setString(48, batchList.get(i).getTyping_speed__c());
							ps.setString(49, batchList.get(i).getHcr_day_1_day_ps__c());
							ps.setFloat(50, batchList.get(i).getPanattemptcount__c());
							ps.setString(51, batchList.get(i).getOrder_id_override__c());
							ps.setString(52, batchList.get(i).getHr_shift_code__c());
							ps.setString(53, batchList.get(i).getNode_requisition__c());
							ps.setString(54, batchList.get(i).getHcr_orientation_session__c());
							ps.setString(55, batchList.get(i).getHeadcount_request__c());
							ps.setTimestamp(56, batchList.get(i).getBgc_disclosure_date__c());
							ps.setFloat(57, batchList.get(i).getHr_open__c());
							ps.setString(58, batchList.get(i).getHcr_location_address1__c());
							ps.setString(59, batchList.get(i).getRequisition_id__c());
							ps.setString(60, batchList.get(i).getLegacy_taleo_department_extension__c());
							ps.setString(61, batchList.get(i).getBusinessunit_ps__c());
							ps.setString(62, batchList.get(i).getSource_details__c());
							ps.setString(63, batchList.get(i).getSource_primary__c());
							ps.setString(64, batchList.get(i).getSelected_shift__c());
							ps.setString(65, batchList.get(i).getCandidateid__c());
							ps.setString(66, batchList.get(i).getSp_q1_response__c());
							ps.setDate(67, batchList.get(i).getAppointment_search_filter_date__c());
							ps.setString(68, batchList.get(i).getApp_rehire_eligibility_status__c());
							ps.setString(69, batchList.get(i).getHcr_orientation_date_ps__c());
							ps.setString(70, batchList.get(i).getLegacy_taleo_hiring_area_manager__c());
							ps.setString(71, batchList.get(i).getLegacy_taleo_shift_comments__c());
							ps.setString(72, batchList.get(i).getCareer_portal_url__c());
							ps.setString(73, batchList.get(i).getStatus_onbase__c());
							ps.setString(74, batchList.get(i).getSp_q2_response__c());
							ps.setString(75, batchList.get(i).getCurrent_integration_step__c());
							ps.setBoolean(76, batchList.get(i).isAcknowledge_no_work_experience__c());
							ps.setString(77, batchList.get(i).getRpt_compare_start_date_with_day1__c());
							ps.setString(78, batchList.get(i).getHire_back_dated_candidates_ps__c());
							ps.setString(79, batchList.get(i).getRequisition__c());
							ps.setString(80, batchList.get(i).getSp_q3_response__c());
							ps.setString(81, batchList.get(i).getLegacy_taleo_submission_medium__c());
							ps.setBoolean(82, batchList.get(i).isSelected_shift_valid__c());
							ps.setString(83, batchList.get(i).getLegacy_taleo_orientation_session__c());
							ps.setBoolean(84, batchList.get(i).isRewind__c());
							ps.setFloat(85, batchList.get(i).getHr_hired__c());
							ps.setString(86, batchList.get(i).getRequisition_function__c());
							ps.setFloat(87, batchList.get(i).getLegacy_taleo_overall_percentile__c());
							ps.setString(88, batchList.get(i).getMy_job_status_global__c());
							ps.setString(89, batchList.get(i).getBgc_disclosure_frca__c());
							ps.setTimestamp(90, batchList.get(i).getLastvieweddate());
							ps.setString(91, batchList.get(i).getEmail_notification_subject__c());
							ps.setString(92, batchList.get(i).getAccount_employee_id__c());
							ps.setString(93, batchList.get(i).getBgc_authorization2__c());
							ps.setBoolean(94, batchList.get(i).isPs_integration_enabled__c());
							ps.setBoolean(95, batchList.get(i).isOwner_id_validator__c());
							ps.setString(96, batchList.get(i).getHcr_location_postalcode__c());
							ps.setBoolean(97, batchList.get(i).isSubmitted_app_on_file__c());
							ps.setFloat(98, batchList.get(i).getReschedule_count__c());
							ps.setBoolean(99, batchList.get(i).isAgency_conversion_check__c());
							ps.setString(100, batchList.get(i).getPreferred_location_code__c());
							ps.setString(101, batchList.get(i).getBgc_authorization1__c());
							ps.setString(102, batchList.get(i).getMy_job_status_de__c());
							ps.setString(103, batchList.get(i).getApp_my_job_status_global__c());
							ps.setBoolean(104, batchList.get(i).isFree_consumer_report_requested__c());
							ps.setBoolean(105, batchList.get(i).isRespects_special_jurisdiction__c());
							ps.setBoolean(106, batchList.get(i).isMeets_education_requirement__c());
							ps.setString(107, batchList.get(i).getStep_substep__c());
							ps.setBoolean(108, batchList.get(i).isReq_bypass_scheduling__c());
							ps.setFloat(109, batchList.get(i).getHr_requested__c());
							ps.setString(110, batchList.get(i).getApplication_shift_code__c());
							ps.setDate(111, batchList.get(i).getBackgroundchkexpirydate__c());
							ps.setString(112, batchList.get(i).getWork_flow_rule_trigger__c());
							ps.setString(113, batchList.get(i).getCurrent_mailing_state_province__c());
							ps.setString(114, batchList.get(i).getSalary_ps__c());
							ps.setString(115, batchList.get(i).getLetter_of_intent_selection__c());
							ps.setString(116, batchList.get(i).getJobcode_ps__c());
							ps.setString(117, batchList.get(i).getName());
							ps.setString(118, batchList.get(i).getCandidate_last_name__c());
							ps.setString(119, batchList.get(i).getRecruiter_employee_id__c());
							ps.setString(120, batchList.get(i).getContinue_application__c());
							ps.setString(121, batchList.get(i).getHcr_department_description__c());
							ps.setString(122, batchList.get(i).getBgc_disclosure_frca_esignature__c());
							ps.setString(123, batchList.get(i).getDrugtestoverallscore__c());
							ps.setString(124, batchList.get(i).getLocation_postal_code__c());
							ps.setString(125, batchList.get(i).getVcpprp_ps__c());
							ps.setFloat(126, batchList.get(i).getPay_rate__c());
							ps.setString(127, batchList.get(i).getContract_title_ps__c());
							ps.setString(128, batchList.get(i).getRole__c());
							ps.setString(129, batchList.get(i).getStdhours_ps__c());
							ps.setString(130, batchList.get(i).getHr_hiring_manager_name__c());
							ps.setString(131, batchList.get(i).getApp_language__c());
							ps.setDate(132, batchList.get(i).getHire_start_date__c());
							ps.setString(133, batchList.get(i).getCandidate_first_name__c());
							ps.setDate(134, batchList.get(i).getHr_day_1_day__c());
							ps.setDate(135, batchList.get(i).getLetter_of_intent_completed_date__c());
							ps.setString(136, batchList.get(i).getLegacy_taleo_shift__c());
							ps.setBoolean(137, batchList.get(i).isConversion__c());
							ps.setTimestamp(138, batchList.get(i).getLastmodifieddate());
							ps.setString(139, batchList.get(i).getLocation_city__c());
							ps.setString(140, batchList.get(i).getMatching_location_code__c());
							ps.setBoolean(141, batchList.get(i).isApplication_withdrawn__c());
							ps.setDate(142, batchList.get(i).getHcr_hire_end_date__c());
							ps.setString(143, batchList.get(i).getOwnerid());
							ps.setBoolean(144, batchList.get(i).isTech_force_email_rule_execution__c());
							ps.setString(145, batchList.get(i).getInstance__c());
							ps.setString(146, batchList.get(i).getRequisition_title__c());
							ps.setTimestamp(147, batchList.get(i).getAppointment_4__c());
							ps.setString(148, batchList.get(i).getPhone_screen_results__c());
							ps.setString(149, batchList.get(i).getRequisition_location_code__c());
							ps.setBoolean(150, batchList.get(i).isIn_manage_hire__c());
							ps.setString(151, batchList.get(i).getBest_suitable_skill__c());
							ps.setString(152, batchList.get(i).getHcr_location_country__c());
							ps.setString(153, batchList.get(i).getLegacy_taleo_e_signature_ip__c());
							ps.setBoolean(154, batchList.get(i).isIsdeleted());
							ps.setString(155, batchList.get(i).getPortal_application_status__c());
							ps.setString(156, batchList.get(i).getBackground_check_counter__c());
							ps.setFloat(157, batchList.get(i).getAccurate_screening_check__c());
							ps.setDate(158, batchList.get(i).getLegacy_taleo_application_creation_date__c());
							ps.setString(159, batchList.get(i).getCompany_code_ps__c());
							ps.setString(160, batchList.get(i).getHcr_request_id__c());
							ps.setTimestamp(161, batchList.get(i).getAppointment_3__c());
							ps.setString(162, batchList.get(i).getLegacy_taleo_correspondence_information__c());
							ps.setString(163, batchList.get(i).getRequisition_country__c());
							ps.setString(164, batchList.get(i).getEmail_notification_body__c());
							ps.setTimestamp(165, batchList.get(i).getSystemmodstamp());
							ps.setDate(166, batchList.get(i).getDrugtestexpirydate__c());
							ps.setString(167, batchList.get(i).getLastmodifiedbyid());
							ps.setBoolean(168, batchList.get(i).isBypass_dt_bgc_validation__c());
							ps.setBoolean(169, batchList.get(i).isTimeslots_available__c());
							ps.setString(170, batchList.get(i).getApp_scheduling_group__c());
							ps.setString(171, batchList.get(i).getApp_performance_agency__c());
							ps.setString(172, batchList.get(i).getHcr_department_code__c());
							ps.setString(173, batchList.get(i).getEmail_notification_rich_text_2__c());
							ps.setBoolean(174, batchList.get(i).isPart_2_completed__c());
							ps.setString(175, batchList.get(i).getConnectionsentid());
							ps.setTimestamp(176, batchList.get(i).getAppointment_2__c());
							ps.setString(177, batchList.get(i).getNational_id_type_ps__c());
							ps.setString(178, batchList.get(i).getRehire_eligibility_audit__c());
							ps.setString(179, batchList.get(i).getHcr_number__c());
							ps.setString(180, batchList.get(i).getShift_comments__c());
							ps.setString(181, batchList.get(i).getCurrency_ps__c());
							ps.setTimestamp(182, batchList.get(i).getAppointment_1__c());
							ps.setDate(183, batchList.get(i).getLegacy_taleo_hire_end_date__c());
							ps.setString(184, batchList.get(i).getApplication_shift_description__c());
							ps.setString(185, batchList.get(i).getCandidatesfdcid__c());
							ps.setString(186, batchList.get(i).getHr_requistion_id__c());
							ps.setDate(187, batchList.get(i).getLastactivitydate());
							ps.setString(188, batchList.get(i).getSpoken_overall__c());
							ps.setString(189, batchList.get(i).getPreferred_location_description__c());
							ps.setDate(190, batchList.get(i).getFirst_available_start_date__c());
							ps.setFloat(191, batchList.get(i).getApp_performance_points__c());
							ps.setString(192, batchList.get(i).getHcr_location_state__c());
							ps.setString(193, batchList.get(i).getCurrent_appointment_number__c());
							ps.setFloat(194, batchList.get(i).getPan_candidate_attempt__c());
							ps.setTimestamp(195, batchList.get(i).getMost_recent_substep_change_datetime__c());
							ps.setString(196, batchList.get(i).getTier_3_interview_results__c());
							ps.setString(197, batchList.get(i).getPan_package_id_trigger__c());
							ps.setString(198, batchList.get(i).getContract_signer_name_ps__c());
							ps.setFloat(199, batchList.get(i).getHr_matched__c());
							ps.setString(200, batchList.get(i).getApp_languagelocalekey__c());
							ps.setString(201, batchList.get(i).getHr_business_title__c());
							ps.setString(202, batchList.get(i).getBgc_disclosure__c());
							ps.setTimestamp(203, batchList.get(i).getContingent_offer_accepted__c());
							ps.setString(204, batchList.get(i).getContingent_offer_shift_code_description__c());
							ps.setDate(205, batchList.get(i).getHcr_hire_start_date__c());
							ps.setString(206, batchList.get(i).getAgency_source_ps__c());
							ps.setString(207, batchList.get(i).getApp_languagecountrycode__c());
							ps.setString(208, batchList.get(i).getInterview_completed__c());
							ps.setString(209, batchList.get(i).getTier_1_interview_results__c());
							ps.setString(210, batchList.get(i).getLegacy_taleo_scheduling_information__c());
							ps.setString(211, batchList.get(i).getHcr_location_city__c());
							ps.setString(212, batchList.get(i).getEmail_template_name__c());
							ps.setFloat(213, batchList.get(i).getApp_overall_percentile__c());
							ps.setString(214, batchList.get(i).getReq_hourly_rate__c());
							ps.setBoolean(215, batchList.get(i).isOverride_bgc_validation__c());
							ps.setString(216, batchList.get(i).getAppointment_4_interview_results__c());
							ps.setTimestamp(217, batchList.get(i).getCreateddate());
							ps.setString(218, batchList.get(i).getHr_shift_differential__c());
							ps.setString(219, batchList.get(i).getBackgroundcheckstatus__c());
							ps.setString(220, batchList.get(i).getSubstep__c());
							ps.setString(221, batchList.get(i).getDuplicate_contact__c());
							ps.setString(222, batchList.get(i).getEsignaturepart2__c());
							ps.setBoolean(223, batchList.get(i).isApplication_submitted__c());
							ps.setString(224, batchList.get(i).getStock_ps__c());
							ps.setString(225, batchList.get(i).getOrder_id__c());
							ps.setBoolean(226, batchList.get(i).isSuppress_screening_validation__c());
							ps.setString(227, batchList.get(i).getHcr_manager_emp_id__c());
							ps.setString(228, batchList.get(i).getHire_start_date_ps__c());
							ps.setFloat(229, batchList.get(i).getLegacy_taleo_hours_worked__c());
							ps.setString(230, batchList.get(i).getStep__c());
							ps.setString(231, batchList.get(i).getPreferred_last_name_ps__c());
							ps.setString(232, batchList.get(i).getPaybasis_ps__c());
							ps.setString(233, batchList.get(i).getSource_other__c());
							ps.setString(234, batchList.get(i).getDate_component__c());
							ps.setString(235, batchList.get(i).getTranslated_requisition_title__c());
							ps.setBoolean(236, batchList.get(i).isTagged__c());
							ps.setString(237, batchList.get(i).getAppointment_3_interview_results__c());
							ps.setString(238, batchList.get(i).getLocation_country__c());
							ps.setString(239, batchList.get(i).getInformatica_key__c());
							ps.setString(240, batchList.get(i).getAppointment_2_interview_results__c());
							ps.setString(241, batchList.get(i).getWorkflow_name__c());
							ps.setString(242, batchList.get(i).getLocation_code_ps__c());
							ps.setFloat(243, batchList.get(i).getOffer_out__c());
							ps.setFloat(244, batchList.get(i).getNo_show_count__c());
							ps.setString(245, batchList.get(i).getEsignature_read_general__c());
							ps.setString(246, batchList.get(i).getTranslated_address__c());
							ps.setBoolean(247, batchList.get(i).isNo_show_indicator__c());
							ps.setString(248, batchList.get(i).getMatched_onbase__c());
							ps.setString(249, batchList.get(i).getPay_rate_ps__c());
							ps.setBoolean(250, batchList.get(i).isReq_bypass_scheduling__c());
							ps.setString(251, batchList.get(i).getHr_shift_description__c());
							ps.setString(252, batchList.get(i).getShift_differential_ps__c());
							ps.setString(253, batchList.get(i).getLegacy_taleo_app_interview_info_de__c());
							ps.setString(254, batchList.get(i).getPreferred_first_name_ps__c());
							ps.setString(255, batchList.get(i).getAppointment_1_interview_results__c());
							ps.setTimestamp(256, batchList.get(i).getAppointment_start_time__c());
							ps.setString(257, batchList.get(i).getLocation_address_line2__c());
							ps.setString(258, batchList.get(i).getConnectionreceivedid());
							ps.setDate(259, batchList.get(i).getBackground_check_initiation_date__c());
							ps.setString(260, batchList.get(i).getHr_alps_code__c());
							ps.setDate(261, batchList.get(i).getLegacy_taleo_orientation_date__c());
							ps.setString(262, batchList.get(i).getApp_my_job_status__c());
							ps.setString(263, batchList.get(i).getApp_performance_pool__c());
							ps.setString(264, batchList.get(i).getCreatedbyid());
							ps.setString(265, batchList.get(i).getNationalidcountry__c());
							ps.setString(266, batchList.get(i).getCandidateidsearchsupport__c());
							ps.setString(267, batchList.get(i).getSpecial_skills__c());
							ps.setString(268, batchList.get(i).getApp_performance_counsel__c());
							ps.setString(269, batchList.get(i).getLegacy_taleo_fclm_job__c());
							ps.setBoolean(270, batchList.get(i).isIs_node_application__c());
							ps.setString(271, batchList.get(i).getLegacy_taleo_pool__c());
							ps.setString(272, batchList.get(i).getLocation_address_line1__c());
							ps.setString(273, batchList.get(i).getTranslated_directions_instructions__c());
							ps.setString(274, batchList.get(i).getHr_location_description__c());
							ps.setBoolean(275, batchList.get(i).isBypassed_cultural_assessment__c());
							ps.setString(276, batchList.get(i).getSubsource_ps__c());
							ps.setString(277, batchList.get(i).getAssessmentoverallscore__c());
							ps.setString(278, batchList.get(i).getHr_department__c());
							ps.setString(279, batchList.get(i).getAmazon_rejects_detail_picklist__c());
							ps.setString(280, batchList.get(i).getMaster_shift_code__c());
							ps.setString(281, batchList.get(i).getOperation__c());
							ps.setBoolean(282, batchList.get(i).isReq_education__c());
							ps.setString(283, batchList.get(i).getSource_ps__c());
							ps.setString(284, batchList.get(i).getRequisition_function_ps__c());
							ps.setTimestamp(285, batchList.get(i).getCreateddateclone__c());
							ps.setFloat(286, batchList.get(i).getSubstep_duration__c());
							ps.setString(287, batchList.get(i).getLocation_state__c());
							ps.setString(288, batchList.get(i).getNationalidtype__c());
							ps.setFloat(289, batchList.get(i).getHcr_finance_week_number__c());
							ps.setString(290, batchList.get(i).getAlps_code_description_ps__c());
							ps.setString(291, batchList.get(i).getMy_job_status__c());
							ps.setString(292, batchList.get(i).getLast_modified_date_ps__c());
							ps.setString(293, batchList.get(i).getLegacy_taleo_amp_eligibility__c());
							ps.setFloat(294, batchList.get(i).getNumber_of_appointments__c());
							ps.setTimestamp(295, batchList.get(i).getLastreferenceddate());
							ps.setString(296, batchList.get(i).getJob_page_label__c());
							ps.setBoolean(297, batchList.get(i).isActive__c());
							ps.setString(298, batchList.get(i).getMy_job_status_canada__c());
							ps.setString(299, batchList.get(i).getEmail_notification_prompt_1_text__c());
							ps.setString(300, batchList.get(i).getApp_candidate_name__c());
							ps.setString(301, batchList.get(i).getCandidateaccountid__c());
							ps.setDate(302, batchList.get(i).getHcr_orientation_date__c());
							ps.setString(303, batchList.get(i).getWritten_overall__c());
							ps.setString(304, batchList.get(i).getOrientation_date_ps__c());
							ps.setString(305, batchList.get(i).getRequisition_type_ps__c());
							ps.setString(306, batchList.get(i).getHire_end_date_ps__c());
							ps.setString(307, batchList.get(i).getLegacy_taleo_step_substep__c());
							ps.setTimestamp(308, batchList.get(i).getEmail_notification_prompt_datetime__c());
							ps.setString(309, batchList.get(i).getAgency_name__c());
							ps.setString(310, batchList.get(i).getAlps_code_ps__c());
							ps.setString(311, batchList.get(i).getEmail_notification_prompt_memo__c());
							ps.setBoolean(312, batchList.get(i).isAgency_req__c());
							ps.setBoolean(313, batchList.get(i).isMatched__c());
							ps.setString(314, batchList.get(i).getFelony_conviction_question_2__c());
							ps.setFloat(315, batchList.get(i).getPanerrorcount__c());
							ps.setString(316, batchList.get(i).getEmail_template_formatted_address_label__c());
							ps.setString(317, batchList.get(i).getLegacy_taleo_shift_differential__c());
							ps.setBoolean(318, batchList.get(i).isAcknowledge_no_attachment_provided__c());
							ps.setString(319, batchList.get(i).getEmail_notification_prompt_2_text__c());
							ps.setString(320, batchList.get(i).getAmzr_error_status__c());
							ps.setString(321, batchList.get(i).getSfid());
							ps.setLong(322, batchList.get(i).getId());
							ps.setString(323, batchList.get(i).get_hc_lastop());
							ps.setString(324, batchList.get(i).get_hc_err());
							ps.setBoolean(325, batchList.get(i).isNode_bgc_bypass_for_hire__c());
							ps.setString(326, batchList.get(i).getInterview_result__c());
							ps.setBoolean(327, batchList.get(i).isHrloggedascanddiate__c());
							ps.setBoolean(328, batchList.get(i).isBgc_california_disclosure_fcra__c());
							ps.setString(329, batchList.get(i).getEmail_notification_prompt_datetime_str__c());
							ps.setBoolean(330, batchList.get(i).isI9_enabled__c());
							ps.setBoolean(331, batchList.get(i).isBgc_california_disclosure_icraa__c());
							ps.setString(332, batchList.get(i).getVirtual_new_hire_event__c());
							ps.setString(333, batchList.get(i).getSp_q2_first_response__c());
							ps.setBoolean(334, batchList.get(i).isIs_papi_enabled__c());
							ps.setString(335, batchList.get(i).getComms_override_nacf_t1_node__c());
							ps.setString(336, batchList.get(i).getCandidate_last_name_kanji__c());
							ps.setString(337, batchList.get(i).getSp_q1_first_response__c());
							ps.setString(338, batchList.get(i).getInclined_value__c());
							ps.setString(339, batchList.get(i).getNational_id_type__c());
							ps.setString(340, batchList.get(i).getSp_q3_first_response__c());
							ps.setString(341, batchList.get(i).getCandidate_first_name_kanji__c());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchList.size();
						}

					});
		}
	}

	/**
	 * Inserting Assessment data
	 *
	 * @param list of Assessment objects
	 * @return void
	 */
	@Override
	public void insertAssessmentData(List<Assessment> lstAssmt) {

		for (int j = 0; j < lstAssmt.size(); j += INSERT_BATCH_SIZE) {
			final List<Assessment> batchListAssmt = lstAssmt.subList(j,
					j + INSERT_BATCH_SIZE > lstAssmt.size() ? lstAssmt.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListAssmt.size());
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
							ps.setLong(1, batchListAssmt.get(i).getId());
							ps.setString(2, batchListAssmt.get(i).getAssessment_type__c());
							ps.setString(3, batchListAssmt.get(i).getSfid());
							ps.setTimestamp(4, batchListAssmt.get(i).getLastmodifieddate());
							ps.setString(5, batchListAssmt.get(i).getReplicate_screening__c());
							ps.setString(6, batchListAssmt.get(i).getParent_screening__c());
							ps.setTimestamp(7, batchListAssmt.get(i).getLastreferenceddate());
							ps.setString(8, batchListAssmt.get(i).getApplication_requisition__c());
							ps.setString(9, batchListAssmt.get(i).getName());
							ps.setString(10, batchListAssmt.get(i).getConnectionsentid());
							ps.setString(11, batchListAssmt.get(i).getCandidate__c());
							ps.setString(12, batchListAssmt.get(i).getCreatedbyid());
							ps.setBoolean(13, batchListAssmt.get(i).isExpired_checkbox__c());
							ps.setString(14, batchListAssmt.get(i).getRecordtypeid());
							ps.setString(15, batchListAssmt.get(i).getConnectionreceivedid());
							ps.setDate(16, batchListAssmt.get(i).getLast_asr_request_date__c());
							ps.setString(17, batchListAssmt.get(i).getApplication__c());
							ps.setString(18, batchListAssmt.get(i).getScore_name__c());
							ps.setDate(19, batchListAssmt.get(i).getInitiation_date__c());
							ps.setDate(20, batchListAssmt.get(i).getStatus_date__c());
							ps.setBoolean(21, batchListAssmt.get(i).isIs_international_bgc__c());
							ps.setString(22, batchListAssmt.get(i).getError_detail_long__c());
							ps.setString(23, batchListAssmt.get(i).get_hc_lastop());
							ps.setString(24, batchListAssmt.get(i).get_hc_err());
							ps.setBoolean(25, batchListAssmt.get(i).isIsdeleted());
							ps.setString(26, batchListAssmt.get(i).getApplication_workflow_details__c());
							ps.setString(27, batchListAssmt.get(i).getLegacy_taleo_provider_status__c());
							ps.setString(28, batchListAssmt.get(i).getLegacy_taleo_screening_requester__c());
							ps.setTimestamp(29, batchListAssmt.get(i).getLastvieweddate());
							ps.setString(30, batchListAssmt.get(i).getError_detail__c());
							ps.setFloat(31, batchListAssmt.get(i).getAccurate_screening_check__c());
							ps.setTimestamp(32, batchListAssmt.get(i).getSystemmodstamp());
							ps.setString(33, batchListAssmt.get(i).getReceipt_id__c());
							ps.setDate(34, batchListAssmt.get(i).getExpirationdate__c());
							ps.setString(35, batchListAssmt.get(i).getOriginal_external_order_id__c());
							ps.setBoolean(36, batchListAssmt.get(i).isX15_day_screening_validator__c());
							ps.setString(37, batchListAssmt.get(i).getCurrent_pan_score__c());
							ps.setString(38, batchListAssmt.get(i).getOverall_score__c());
							ps.setBoolean(39, batchListAssmt.get(i).isUs_candidate__c());
							ps.setBoolean(40, batchListAssmt.get(i).isInvalidated_screening__c());
							ps.setTimestamp(41, batchListAssmt.get(i).getCreateddate());
							ps.setString(42, batchListAssmt.get(i).getOrder_id__c());
							ps.setString(43, batchListAssmt.get(i).getStatus__c());
							ps.setString(44, batchListAssmt.get(i).getLastmodifiedbyid());
							ps.setString(45, batchListAssmt.get(i).getScreening_pan_package_id__c());
							ps.setString(46, batchListAssmt.get(i).getAdpinitiatescreeningurl__c());
							ps.setBoolean(47, batchListAssmt.get(i).isBgc_expire_mismatch__c());
							ps.setString(48, batchListAssmt.get(i).getAdpscreeningid__c());
							ps.setDate(49, batchListAssmt.get(i).getSection1_complete_dt__c());
							ps.setDate(50, batchListAssmt.get(i).getTerm_date__c());
							ps.setString(51, batchListAssmt.get(i).getI9_status__c());
							ps.setString(52, batchListAssmt.get(i).getI9_master_status__c());
							ps.setBoolean(53, batchListAssmt.get(i).isCheck_rehire__c());
							ps.setFloat(54, batchListAssmt.get(i).getNo_of_retries__c());
							ps.setFloat(55, batchListAssmt.get(i).getForm_id__c());
							ps.setString(56, batchListAssmt.get(i).getMaster_status__c());
							ps.setString(57, batchListAssmt.get(i).getI9_id_type__c());
							ps.setFloat(58, batchListAssmt.get(i).getPrevious_i9_status_number__c());
							ps.setString(59, batchListAssmt.get(i).getI9_prior_master_status__c());
							ps.setString(60, batchListAssmt.get(i).getAirport__c());
							ps.setFloat(61, batchListAssmt.get(i).getI9_id__c());
							ps.setBoolean(62, batchListAssmt.get(i).isI9_complete__c());
							ps.setFloat(63, batchListAssmt.get(i).getI9_status_number__c());
							ps.setDate(64, batchListAssmt.get(i).getSection3_complete_dt__c());
							ps.setDate(65, batchListAssmt.get(i).getSection2_complete_dt__c());
							ps.setBoolean(66, batchListAssmt.get(i).isHas_candidate_screenings__c());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListAssmt.size();
						}

					});
		}
	}

	/**
	 * Inserting EmailMessage data
	 *
	 * @param list of EmailMessage objects
	 * @return void
	 */
	@Override
	public void insertEmailMessageData(List<EmailMessage> lstEmms) {
		for (int j = 0; j < lstEmms.size(); j += INSERT_BATCH_SIZE) {
			final List<EmailMessage> batchListEmms = lstEmms.subList(j,
					j + INSERT_BATCH_SIZE > lstEmms.size() ? lstEmms.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListEmms.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.emailmessage "
					+ "(lastmodifieddate,istracked,headers,threadidentifier,activityid,lastopeneddate,emailtemplateid,isexternallyvisible,isclientmanaged,"
					+ "fromname,hasattachment,fromaddress,createdbyid,isopened,ccaddress,parentid,relatedtoid,status,messagedate,isdeleted,incoming,isbounced,"
					+ "validatedfromaddress,subject,systemmodstamp,firstopeneddate,textbody,replytoemailmessageid,htmlbody,createddate,bccaddress,"
					+ "messageidentifier,lastmodifiedbyid,toaddress,sfid,id,_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setTimestamp(1, batchListEmms.get(i).getLastmodifieddate());
							ps.setBoolean(2, batchListEmms.get(i).isIstracked());
							ps.setString(3, batchListEmms.get(i).getHeaders());
							ps.setString(4, batchListEmms.get(i).getThreadidentifier());
							ps.setString(5, batchListEmms.get(i).getActivityid());
							ps.setTimestamp(6, batchListEmms.get(i).getLastopeneddate());
							ps.setString(7, batchListEmms.get(i).getEmailtemplateid());
							ps.setBoolean(8, batchListEmms.get(i).isIsexternallyvisible());
							ps.setBoolean(9, batchListEmms.get(i).isIsclientmanaged());
							ps.setString(10, batchListEmms.get(i).getFromname());
							ps.setBoolean(11, batchListEmms.get(i).isHasattachment());
							ps.setString(12, batchListEmms.get(i).getFromaddress());
							ps.setString(13, batchListEmms.get(i).getCreatedbyid());
							ps.setBoolean(14, batchListEmms.get(i).isIsopened());
							ps.setString(15, batchListEmms.get(i).getCcaddress());
							ps.setString(16, batchListEmms.get(i).getParentid());
							ps.setString(17, batchListEmms.get(i).getRelatedtoid());
							ps.setString(18, batchListEmms.get(i).getStatus());
							ps.setTimestamp(19, batchListEmms.get(i).getMessagedate());
							ps.setBoolean(20, batchListEmms.get(i).isIsdeleted());
							ps.setBoolean(21, batchListEmms.get(i).isIncoming());
							ps.setBoolean(22, batchListEmms.get(i).isIsbounced());
							ps.setString(23, batchListEmms.get(i).getValidatedfromaddress());
							ps.setString(24, batchListEmms.get(i).getSubject());
							// ps.setBoolean(25, batchListEmms.get(i).isIsdeleted());
							ps.setTimestamp(25, batchListEmms.get(i).getSystemmodstamp());
							ps.setTimestamp(26, batchListEmms.get(i).getFirstopeneddate());
							ps.setString(27, batchListEmms.get(i).getTextbody());
							ps.setString(28, batchListEmms.get(i).getReplytoemailmessageid());
							ps.setString(29, batchListEmms.get(i).getHtmlbody());
							ps.setTimestamp(30, batchListEmms.get(i).getCreateddate());
							ps.setString(31, batchListEmms.get(i).getBccaddress());
							ps.setString(32, batchListEmms.get(i).getMessageidentifier());
							ps.setString(33, batchListEmms.get(i).getLastmodifiedbyid());
							ps.setString(34, batchListEmms.get(i).getToaddress());
							ps.setString(35, batchListEmms.get(i).getSfid());
							ps.setLong(36, batchListEmms.get(i).getId());
							ps.setString(37, batchListEmms.get(i).get_hc_lastop());
							ps.setString(38, batchListEmms.get(i).get_hc_err());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListEmms.size();
						}

					});
		}
	}

	/**
	 * Inserting ErrorLog data
	 *
	 * @param list of ErrorLog objects
	 * @return void
	 */
	@Override
	public void insertErrorLogData(List<ErrorLog> lstErrlog) {
		for (int j = 0; j < lstErrlog.size(); j += INSERT_BATCH_SIZE) {
			final List<ErrorLog> batchListErrlog = lstErrlog.subList(j,
					j + INSERT_BATCH_SIZE > lstErrlog.size() ? lstErrlog.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListErrlog.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.error_log__c "
					+ "(exception_stack_trace__c,lastmodifieddate,isdeleted,exception_message__c,exception_type__c,"
					+ "apex_class_name__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,"
					+ "connectionreceivedid,exception_line_number__c,lastmodifiedbyid,related_application__c,sfid,id,"
					+ "_hc_lastop,_hc_err)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setString(1, batchListErrlog.get(i).getException_stack_trace__c());
							ps.setTimestamp(2, batchListErrlog.get(i).getLastmodifieddate());
							ps.setBoolean(3, batchListErrlog.get(i).isIsdeleted());
							ps.setString(4, batchListErrlog.get(i).getException_message__c());
							ps.setString(5, batchListErrlog.get(i).getException_type__c());
							ps.setString(6, batchListErrlog.get(i).getApex_class_name__c());
							ps.setString(7, batchListErrlog.get(i).getName());
							ps.setTimestamp(8, batchListErrlog.get(i).getSystemmodstamp());
							ps.setString(9, batchListErrlog.get(i).getConnectionsentid());
							ps.setString(10, batchListErrlog.get(i).getOwnerid());
							ps.setString(11, batchListErrlog.get(i).getCreatedbyid());
							ps.setTimestamp(12, batchListErrlog.get(i).getCreateddate());
							ps.setString(13, batchListErrlog.get(i).getConnectionreceivedid());
							ps.setFloat(14, batchListErrlog.get(i).getException_line_number__c());
							ps.setString(15, batchListErrlog.get(i).getLastmodifiedbyid());
							ps.setString(16, batchListErrlog.get(i).getRelated_application__c());
							ps.setString(17, batchListErrlog.get(i).getSfid());
							ps.setLong(18, batchListErrlog.get(i).getId());
							ps.setString(19, batchListErrlog.get(i).get_hc_lastop());
							ps.setString(20, batchListErrlog.get(i).get_hc_err());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListErrlog.size();
						}

					});
		}
	}

	/**
	 * Inserting IntegrationTransaction data
	 *
	 * @param list of IntegrationTransaction objects
	 * @return void
	 */
	@Override
	public void insertIntegrationTransactionData(List<IntegrationTransaction> lstIntrans) {
		for (int j = 0; j < lstIntrans.size(); j += INSERT_BATCH_SIZE) {
			final List<IntegrationTransaction> batchListIntrans = lstIntrans.subList(j,
					j + INSERT_BATCH_SIZE > lstIntrans.size() ? lstIntrans.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListIntrans.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.integration_transaction__c "
					+ "(lastmodifieddate,transaction_type__c,lastreferenceddate,name,connectionsentid,transaction_date_ff__c,createdbyid,connectionreceivedid,"
					+ "requestor_id_ps__c,number_of_attempts__c,it_candidate__c,creation_outside__c,it_application__c,outbound_message__c,isdeleted,"
					+ "error_summary__c,it_screening__c,lastvieweddate,processed__c,inbound_message__c,system__c,error_detail__c,systemmodstamp,"
					+ "x15_minutes_from_now__c,transaction_status__c,createddate,lastactivitydate,environment__c,lastmodifiedbyid,transaction_date__c,sfid,"
					+ "_hc_lastop,_hc_err,number_of_noshows__c,is_papi_enabled__c,system_path__c,sub_status__c,id)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setTimestamp(1, batchListIntrans.get(i).getLastmodifieddate());
							ps.setString(2, batchListIntrans.get(i).getTransaction_type__c());
							ps.setTimestamp(3, batchListIntrans.get(i).getLastreferenceddate());
							ps.setString(4, batchListIntrans.get(i).getName());
							ps.setString(5, batchListIntrans.get(i).getConnectionsentid());
							ps.setString(6, batchListIntrans.get(i).getTransaction_date_ff__c());
							ps.setString(7, batchListIntrans.get(i).getCreatedbyid());
							ps.setString(8, batchListIntrans.get(i).getConnectionreceivedid());
							ps.setString(9, batchListIntrans.get(i).getRequestor_id_ps__c());
							ps.setFloat(10, batchListIntrans.get(i).getNumber_of_attempts__c());
							ps.setString(11, batchListIntrans.get(i).getIt_candidate__c());
							ps.setBoolean(12, batchListIntrans.get(i).isCreation_outside__c());
							ps.setString(13, batchListIntrans.get(i).getIt_application__c());
							ps.setString(14, batchListIntrans.get(i).getOutbound_message__c());
							ps.setBoolean(15, batchListIntrans.get(i).isIsdeleted());
							ps.setString(16, batchListIntrans.get(i).getError_summary__c());
							ps.setString(17, batchListIntrans.get(i).getIt_screening__c());
							ps.setTimestamp(18, batchListIntrans.get(i).getLastvieweddate());
							ps.setBoolean(19, batchListIntrans.get(i).isProcessed__c());
							ps.setString(20, batchListIntrans.get(i).getInbound_message__c());
							ps.setString(21, batchListIntrans.get(i).getSystem__c());
							ps.setString(22, batchListIntrans.get(i).getError_detail__c());
							ps.setTimestamp(23, batchListIntrans.get(i).getSystemmodstamp());
							ps.setTimestamp(24, batchListIntrans.get(i).getX15_minutes_from_now__c());
							ps.setString(25, batchListIntrans.get(i).getTransaction_status__c());
							ps.setTimestamp(26, batchListIntrans.get(i).getCreateddate());
							ps.setDate(27, batchListIntrans.get(i).getLastactivitydate());
							ps.setString(28, batchListIntrans.get(i).getEnvironment__c());
							ps.setString(29, batchListIntrans.get(i).getLastmodifiedbyid());
							ps.setTimestamp(30, batchListIntrans.get(i).getTransaction_date__c());
							ps.setString(31, batchListIntrans.get(i).getSfid());
							ps.setString(32, batchListIntrans.get(i).get_hc_lastop());
							ps.setString(33, batchListIntrans.get(i).get_hc_err());
							ps.setFloat(34, batchListIntrans.get(i).getNumber_of_noshows__c());
							ps.setBoolean(35, batchListIntrans.get(i).isIs_papi_enabled__c());
							ps.setString(36, batchListIntrans.get(i).getSystem_path__c());
							ps.setString(37, batchListIntrans.get(i).getSub_status__c());
							ps.setLong(38, batchListIntrans.get(i).getId());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListIntrans.size();
						}

					});
		}
	}

	/**
	 * Inserting Interview data
	 *
	 * @param list of Interview objects
	 * @return void
	 */
	@Override
	public void insertInterviewData(List<Interview> lstInterview) {
		for (int j = 0; j < lstInterview.size(); j += INSERT_BATCH_SIZE) {
			final List<Interview> batchListInterview = lstInterview.subList(j,
					j + INSERT_BATCH_SIZE > lstInterview.size() ? lstInterview.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListInterview.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.interview__c "
					+ "(lastmodifieddate,appt_time_zone__c,appt_end_time__c,special_skills__c,name,candidate__c,createdbyid,candidate_last_name__c,timeslot__c,general_notes__c,recruiting_event_type__c,appt_start_datetime__c,isdeleted,appt_recruiting_event_link__c,lastvieweddate,translated_address__c,requisition_id__c,createddate,appointment_date__c,appt_end_time_text__c,pool_substep__c,active__c,appt_timespan_number__c,interview_type__c,appt_start_date__c,appt_requisition_link__c,scheduling_type__c,shift_comments__c,interview_question_set__c,email_template_name__c,event_type__c,lastreferenceddate,connectionsentid,appt_status__c,candidate_actual_time_zone__c,candidate_first_name__c,connectionreceivedid,appt_start_time_text__c,translated_directions_instructions__c,application__c,appt_end_date__c,interview_outcome__c,role__c,candidate_language__c,shift__c,systemmodstamp,appt_address__c,uniqueness_validation_key__c,appt_time_zone_key__c,appt_start_time__c,lastmodifiedbyid,candidate_email__c,interviewer__c,sfid,id,_hc_lastop,_hc_err,virtual_new_hire_event__c,cid__c\r\n"
					+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setTimestamp(1, batchListInterview.get(i).getLastmodifieddate());
							ps.setString(2, batchListInterview.get(i).getAppt_time_zone__c());
							ps.setTimestamp(3, batchListInterview.get(i).getAppt_end_time__c());
							ps.setString(4, batchListInterview.get(i).getSpecial_skills__c());
							ps.setString(5, batchListInterview.get(i).getName());
							ps.setString(6, batchListInterview.get(i).getCandidate__c());
							ps.setString(7, batchListInterview.get(i).getCreatedbyid());
							ps.setString(8, batchListInterview.get(i).getCandidate_last_name__c());
							ps.setString(9, batchListInterview.get(i).getTimeslot__c());
							ps.setString(10, batchListInterview.get(i).getGeneral_notes__c());
							ps.setString(11, batchListInterview.get(i).getRecruiting_event_type__c());
							ps.setTimestamp(12, batchListInterview.get(i).getAppt_start_datetime__c());
							ps.setBoolean(13, batchListInterview.get(i).isIsdeleted());
							ps.setString(14, batchListInterview.get(i).getAppt_recruiting_event_link__c());
							ps.setTimestamp(15, batchListInterview.get(i).getLastvieweddate());
							ps.setString(16, batchListInterview.get(i).getTranslated_address__c());
							ps.setString(17, batchListInterview.get(i).getRequisition_id__c());
							ps.setTimestamp(18, batchListInterview.get(i).getCreateddate());
							ps.setDate(19, batchListInterview.get(i).getAppointment_date__c());
							ps.setString(20, batchListInterview.get(i).getAppt_end_time_text__c());
							ps.setString(21, batchListInterview.get(i).getPool_substep__c());
							ps.setBoolean(22, batchListInterview.get(i).isActive__c());
							ps.setString(23, batchListInterview.get(i).getAppt_timespan_number__c());
							ps.setString(24, batchListInterview.get(i).getInterview_type__c());
							ps.setString(25, batchListInterview.get(i).getAppt_start_date__c());
							ps.setString(26, batchListInterview.get(i).getAppt_requisition_link__c());
							ps.setString(27, batchListInterview.get(i).getScheduling_type__c());
							ps.setString(28, batchListInterview.get(i).getShift_comments__c());
							ps.setString(29, batchListInterview.get(i).getInterview_question_set__c());
							ps.setString(30, batchListInterview.get(i).getEmail_template_name__c());
							ps.setString(31, batchListInterview.get(i).getEvent_type__c());
							ps.setTimestamp(32, batchListInterview.get(i).getLastreferenceddate());
							ps.setString(33, batchListInterview.get(i).getConnectionsentid());
							ps.setString(34, batchListInterview.get(i).getAppt_status__c());
							ps.setString(35, batchListInterview.get(i).getCandidate_actual_time_zone__c());
							ps.setString(36, batchListInterview.get(i).getCandidate_first_name__c());
							ps.setString(37, batchListInterview.get(i).getConnectionreceivedid());
							ps.setString(38, batchListInterview.get(i).getAppt_start_time_text__c());
							ps.setString(39, batchListInterview.get(i).getTranslated_directions_instructions__c());
							ps.setString(40, batchListInterview.get(i).getApplication__c());
							ps.setString(41, batchListInterview.get(i).getAppt_end_date__c());
							ps.setString(42, batchListInterview.get(i).getInterview_outcome__c());
							ps.setString(43, batchListInterview.get(i).getRole__c());
							ps.setString(44, batchListInterview.get(i).getCandidate_language__c());
							ps.setString(45, batchListInterview.get(i).getShift__c());
							ps.setTimestamp(46, batchListInterview.get(i).getSystemmodstamp());
							ps.setString(47, batchListInterview.get(i).getAppt_address__c());
							ps.setString(48, batchListInterview.get(i).getUniqueness_validation_key__c());
							ps.setString(49, batchListInterview.get(i).getAppt_time_zone_key__c());
							ps.setTimestamp(50, batchListInterview.get(i).getAppt_start_time__c());
							ps.setString(51, batchListInterview.get(i).getLastmodifiedbyid());
							ps.setString(52, batchListInterview.get(i).getCandidate_email__c());
							ps.setString(53, batchListInterview.get(i).getInterviewer__c());
							ps.setString(54, batchListInterview.get(i).getSfid());
							ps.setLong(55, batchListInterview.get(i).getId());
							ps.setString(56, batchListInterview.get(i).get_hc_lastop());
							ps.setString(57, batchListInterview.get(i).get_hc_err());
							ps.setString(58, batchListInterview.get(i).getVirtual_new_hire_event__c());
							ps.setString(59, batchListInterview.get(i).getCid__c());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListInterview.size();
						}

					});
		}
	}

	/**
	 * Inserting Note data
	 *
	 * @param list of Note objects
	 * @return void
	 */
	@Override
	public void insertNoteData(List<Note> lstNotes) {
		for (int j = 0; j < lstNotes.size(); j += INSERT_BATCH_SIZE) {
			final List<Note> batchListNotes = lstNotes.subList(j,
					j + INSERT_BATCH_SIZE > lstNotes.size() ? lstNotes.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListNotes.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.note "
					+ "(body,parentid,lastmodifieddate,ownerid,isdeleted,systemmodstamp,lastmodifiedbyid,createddate,title,isprivate,createdbyid,sfid,id,_hc_lastop,_hc_err"
					+ "" + ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",

					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setString(1, batchListNotes.get(i).getBody());
							ps.setString(2, batchListNotes.get(i).getParentid());
							ps.setTimestamp(3, batchListNotes.get(i).getLastmodifieddate());
							ps.setString(4, batchListNotes.get(i).getOwnerid());
							ps.setBoolean(5, batchListNotes.get(i).isIsdeleted());
							ps.setTimestamp(6, batchListNotes.get(i).getSystemmodstamp());
							ps.setString(7, batchListNotes.get(i).getLastmodifiedbyid());
							ps.setTimestamp(8, batchListNotes.get(i).getCreateddate());
							ps.setString(9, batchListNotes.get(i).getTitle());
							ps.setBoolean(10, batchListNotes.get(i).isIsprivate());
							ps.setString(11, batchListNotes.get(i).getCreatedbyid());
							ps.setString(12, batchListNotes.get(i).getSfid());
							ps.setLong(13, batchListNotes.get(i).getId());
							ps.setString(14, batchListNotes.get(i).get_hc_lastop());
							ps.setString(15, batchListNotes.get(i).get_hc_err());
						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListNotes.size();
						}

					});
		}
	}

	/**
	 * Inserting Response data
	 *
	 * @param list of Response objects
	 * @return void
	 */
	@Override
	public void insertResponseData(List<Response> lstResponse) {

		for (int j = 0; j < lstResponse.size(); j += INSERT_BATCH_SIZE) {
			final List<Response> batchListResponse = lstResponse.subList(j,
					j + INSERT_BATCH_SIZE > lstResponse.size() ? lstResponse.size() : j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchListResponse.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response__c "
					+ "(lastmodifieddate,question_text__c,disqualifying_answer__c,lastreferenceddate,interviewer_comment__c,response__c,interview__c,name,connectionsentid,ownerid,createdbyid,connectionreceivedid,application__c,question__c,isdeleted,legacy_taleo_qa_response_identifier__c,lastvieweddate,systemmodstamp,meets_requirements__c,question_type__c,competency__c,createddate,score__c,lastmodifiedbyid,question_html_type__c,sfid,id,_hc_lastop,_hc_err,related_field__c"
					+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setTimestamp(1, batchListResponse.get(i).getLastmodifieddate());
							ps.setString(2, batchListResponse.get(i).getQuestion_text__c());
							ps.setBoolean(3, batchListResponse.get(i).isDisqualifying_answer__c());
							ps.setTimestamp(4, batchListResponse.get(i).getLastreferenceddate());
							ps.setString(5, batchListResponse.get(i).getInterviewer_comment__c());
							ps.setString(6, batchListResponse.get(i).getResponse__c());
							ps.setString(7, batchListResponse.get(i).getInterview__c());
							ps.setString(8, batchListResponse.get(i).getName());
							ps.setString(9, batchListResponse.get(i).getConnectionsentid());
							ps.setString(10, batchListResponse.get(i).getOwnerid());
							ps.setString(11, batchListResponse.get(i).getCreatedbyid());
							ps.setString(12, batchListResponse.get(i).getConnectionreceivedid());
							ps.setString(13, batchListResponse.get(i).getApplication__c());

							ps.setString(14, batchListResponse.get(i).getQuestion__c());
							ps.setBoolean(15, batchListResponse.get(i).isIsdeleted());
							ps.setString(16, batchListResponse.get(i).getLegacy_taleo_qa_response_identifier__c());
							ps.setTimestamp(17, batchListResponse.get(i).getLastvieweddate());

							ps.setTimestamp(18, batchListResponse.get(i).getSystemmodstamp());
							ps.setString(19, batchListResponse.get(i).getMeets_requirements__c());
							ps.setString(20, batchListResponse.get(i).getQuestion_type__c());
							ps.setString(21, batchListResponse.get(i).getCompetency__c());
							ps.setTimestamp(22, batchListResponse.get(i).getCreateddate());
							ps.setString(23, batchListResponse.get(i).getScore__c());
							ps.setString(24, batchListResponse.get(i).getLastmodifiedbyid());
							ps.setString(25, batchListResponse.get(i).getQuestion_html_type__c());
							ps.setString(26, batchListResponse.get(i).getSfid());
							ps.setLong(27, batchListResponse.get(i).getId());

							ps.setString(28, batchListResponse.get(i).get_hc_lastop());
							ps.setString(29, batchListResponse.get(i).get_hc_err());
							ps.setString(30, batchListResponse.get(i).getRelated_field__c());
						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchListResponse.size();
						}

					});
		}
	}

	/**
	 * Inserting ResponseAnswer data
	 *
	 * @param list of ResponseAnswer objects
	 * @return void
	 */
	@Override
	public void insertResponseAnswerData(List<ResponseAnswer> lstResponseanswer) {
		for (int j = 0; j < lstResponseanswer.size(); j += INSERT_BATCH_SIZE) {
			final List<ResponseAnswer> batchResponseanswer = lstResponseanswer.subList(j,
					j + INSERT_BATCH_SIZE > lstResponseanswer.size() ? lstResponseanswer.size()
							: j + INSERT_BATCH_SIZE);

			System.out.println("batchList size::" + batchResponseanswer.size());

			int[] insertCounts = jdbcTemplate.batchUpdate("insert into sf_archive.response_answer__c "
					+ "(lastmodifieddate,isdeleted,answer__c,response__c,name,systemmodstamp,connectionsentid,ownerid,createdbyid,createddate,connectionreceivedid,lastmodifiedbyid,sfid,id,_hc_lastop,_hc_err\r\n"
					+ ")  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", new BatchPreparedStatementSetter() {
						public void setValues(PreparedStatement ps, int i) throws SQLException {
							ps.setTimestamp(1, batchResponseanswer.get(i).getLastmodifieddate());
							ps.setBoolean(2, batchResponseanswer.get(i).getIsdeleted());
							ps.setString(3, batchResponseanswer.get(i).getAnswer__c());
							ps.setString(4, batchResponseanswer.get(i).getResponse__c());
							ps.setString(5, batchResponseanswer.get(i).getName());
							ps.setTimestamp(6, batchResponseanswer.get(i).getSystemmodstamp());
							ps.setString(7, batchResponseanswer.get(i).getConnectionsentid());
							ps.setString(8, batchResponseanswer.get(i).getOwnerid());
							ps.setString(9, batchResponseanswer.get(i).getCreatedbyid());
							ps.setTimestamp(10, batchResponseanswer.get(i).getCreateddate());
							ps.setString(11, batchResponseanswer.get(i).getConnectionreceivedid());
							ps.setString(12, batchResponseanswer.get(i).getLastmodifiedbyid());
							ps.setString(13, batchResponseanswer.get(i).getSfid());

							ps.setLong(14, batchResponseanswer.get(i).getId());
							ps.setString(15, batchResponseanswer.get(i).get_hc_lastop());
							ps.setString(16, batchResponseanswer.get(i).get_hc_err());

						}

						@Override
						public int getBatchSize() {
							// TODO Auto-generated method stub
							return batchResponseanswer.size();
						}

					});
		}
	}
}
