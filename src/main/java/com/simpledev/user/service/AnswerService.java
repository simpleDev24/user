package com.simpledev.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
	
	@Autowired
	AnswerApi answerApi;
	
	public String getAnswer() {
		return answerApi.getAnswer();
	}

}
