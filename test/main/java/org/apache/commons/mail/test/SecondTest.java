package org.apache.commons.mail.test;

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
		System.out.println("This is the second test!");
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}

}