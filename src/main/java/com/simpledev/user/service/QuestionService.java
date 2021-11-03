package com.simpledev.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuestionService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public String getQuestion() {
		return restTemplate.getForObject("http://question-service/question", String.class);
	}

}
