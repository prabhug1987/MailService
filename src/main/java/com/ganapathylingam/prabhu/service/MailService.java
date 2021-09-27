package com.ganapathylingam.prabhu.service;

import com.ganapathylingam.prabhu.request.MailMessage;

public interface MailService {
	public void sendMail(MailMessage mailMessage);
}
