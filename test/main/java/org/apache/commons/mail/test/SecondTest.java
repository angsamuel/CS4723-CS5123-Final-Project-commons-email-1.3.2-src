package org.apache.commons.mail.test;

import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class SecondTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc() throws EmailException {
		System.out.println("");
		System.out.println("User ID: ccr___");
		System.out.println("This test covers the buildMimeMessage method of Email under a variety of conditions (without subject, without from addr, without reciever, with full info.");
		System.out.println("");
		
	}
		
	public void testBuildMimeMessageWithoutHost() throws EmailException {
		try {
			testEmail.buildMimeMessage(); fail("Mime message cannot be built without host.");
		}catch(EmailException e) {
			assertEquals("Cannot find valid hostname for mail session",e.getMessage());
		}
	}
	
		//this method needs to be tested without subject, from, to, message
	
	public void testBuildMimeMessageWithoutSubject() throws EmailException {
		testEmail.setHostName("email.com");
		try {
			testEmail.buildMimeMessage(); fail("Mime message cannot be built without subject.");
		}catch(EmailException e) {
			;
		}
	}
	
	public void testBuildMimeMessageWithoutFrom() throws EmailException {
		testEmail.setHostName("email.com");
		testEmail.setSubject("test subject");
		try {
			testEmail.buildMimeMessage(); fail("Mime message cannot be built without from address.");
		}catch(EmailException e) {
			;
		}
	}
	
	public void testBuildMimeMessageWithoutReciever() throws EmailException {
		testEmail.setHostName("email.com");
		testEmail.setSubject("test subject");
		testEmail.setFrom("from@email.com");
		try {
			testEmail.buildMimeMessage(); fail("Mime message cannot be built without reciever address.");
		}catch(EmailException e) {
			;
		}
	}
	
	public void testBuildMimeMessageFull() throws EmailException {
		//add minimum requirements for valid call
		testEmail.setHostName("email.com");
		testEmail.setSubject("test subject");
		testEmail.setFrom("from@email.com");
		testEmail.addTo("reciever@gmail.com");
		
		//add optional content to increase test coverage
		testEmail.addCc("cc@email.com");
		testEmail.addBcc("bcc@email.com");
		testEmail.updateContentType("text/plain; charset=UTF-8");
		testEmail.setContent(new MimeMultipart());
		testEmail.addHeader("header name", "header value");
		
		//finally call the actual method
		testEmail.buildMimeMessage();
	}
	

}
