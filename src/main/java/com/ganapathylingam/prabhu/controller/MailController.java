package com.ganapathylingam.prabhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganapathylingam.prabhu.service.MailService;

@RestController
@RequestMapping(value = "/mail")
public class MailController {
	
	@Autowired
	private MailService mailServiceImpl;
	
	@PostMapping(value = "send")
	public void createMail() {
		
	}

}
