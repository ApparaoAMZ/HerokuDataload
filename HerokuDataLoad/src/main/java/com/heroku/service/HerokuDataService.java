package com.heroku.service;

import java.util.List;
/**
 *
 * service class to run data load method in main class
 * 
 */
public interface HerokuDataService {

	public void insertApplicationData();

	public void insertAssessmentData();

	public void insertEmailMessageData();

	public void insertErrorLogData();

	public void insertIntegrationTransactionData();

	public void insertInterviewData();

	public void insertNoteData();

	public void insertResponseData();

	public void insertResponseAnswerData();

}
