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

public interface HerokuDataDao {
	public void insertApplicationData(List<Application> apl);

	public void insertAssessmentData(List<Assessment> assmt);

	public void insertEmailMessageData(List<EmailMessage> emms);

	public void insertErrorLogData(List<ErrorLog> emms);

	public void insertIntegrationTransactionData(List<IntegrationTransaction> intrans);

	public void insertInterviewData(List<Interview> interview);

	public void insertNoteData(List<Note> notes);

	public void insertResponseData(List<Response> response);

	public void insertResponseAnswerData(List<ResponseAnswer> responseanswer);
}