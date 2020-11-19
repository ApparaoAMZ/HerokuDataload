package com.heroku;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.EmptyResultDataAccessException;

import com.heroku.service.HerokuDataService;

@SpringBootApplication
public class HerokuDataApplication implements CommandLineRunner {
	@Autowired
	private HerokuDataService herokuservice;

	public static void main(String[] args) {

		SpringApplication.run(HerokuDataApplication.class, args);
	}

	@Override
	public void run(String... args) {

		try {
			System.out.println("start of call:: " + LocalTime.now());
			herokuservice.insertApplicationData();
			System.out.println("end of application:: " + LocalTime.now());
			herokuservice.insertAssessmentData();
			System.out.println("end of Assessment:: " + LocalTime.now());
			herokuservice.insertEmailMessageData();
			System.out.println("end of emailmessage:: " + LocalTime.now());
			herokuservice.insertErrorLogData();
			System.out.println("end of errorlog:: " + LocalTime.now());
			herokuservice.insertIntegrationTransactionData();
			System.out.println("end of integration:: " + LocalTime.now());
			herokuservice.insertInterviewData();
			System.out.println("end of interview:: " + LocalTime.now());
		    herokuservice.insertNoteData();
			System.out.println("end of note:: " + LocalTime.now());

			herokuservice.insertResponseData();
			System.out.println("end of resonse:: " + LocalTime.now());
			herokuservice.insertResponseAnswerData();
			
			System.out.println("End of call:: " + LocalTime.now());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("Applicaion table dataload issue");
		}

	}
}
