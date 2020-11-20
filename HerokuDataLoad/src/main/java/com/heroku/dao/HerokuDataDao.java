package com.heroku.dao;

import java.util.List;

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
  * Dao service to run data load method in main class
  * 
  */
public interface HerokuDataDao {
	public void insertApplicationData(List<Application> lstApl);

	public void insertAssessmentData(List<Assessment> lstAssmt);

	public void insertEmailMessageData(List<EmailMessage> lstEmms);

	public void insertErrorLogData(List<ErrorLog> lstEmms);

	public void insertIntegrationTransactionData(List<IntegrationTransaction> lstIntrans);

	public void insertInterviewData(List<Interview> lstInterview);

	public void insertNoteData(List<Note> lstNotes);

	public void insertResponseData(List<Response> lstResponse);

	public void insertResponseAnswerData(List<ResponseAnswer> lstResponseanswer);
}