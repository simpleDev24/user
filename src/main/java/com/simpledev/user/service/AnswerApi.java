package com.simpledev.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("answer-service")
public interface AnswerApi {
	
	@GetMapping("/answer")
	public String getAnswer();

}
