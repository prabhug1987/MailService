package com.ganapathylingam.prabhu.request;

public class MailMessage {
	private String cc;
	private String bcc;
	private String body;
	private String subject;
	private String to;

	public MailMessage() {

	}

	public MailMessage(String cc, String bcc, String body, String subject, String to) {
		super();
		this.cc = cc;
		this.bcc = bcc;
		this.body = body;
		this.subject = subject;
		this.to = to;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
