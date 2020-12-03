package org.apache.commons.mail.test;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class FirstTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
		System.out.println("");
		System.out.println("User ID: ccr___");
		System.out.println("This test covers the AddBcc, AddBccMulti methods of Email.");
		System.out.println("");
		
	}
	
	//Test Add single BCC
	public void testAddBcc() throws EmailException {
		testEmail.addBcc("a@b.com");
		assertEquals("First Bcc address was expected to be a@b.com but was instead " + testEmail.getBccAddresses().get(0).toString(), "a@b.com", testEmail.getBccAddresses().get(0).toString());
	}
	
	//TEST ADD BCC Multiple
	public void testAddBccMulti() throws EmailException {
		String[] addresses = {"a@b.com", "b@c.com","c@d.com","d@e.com"};
		testEmail.addBcc(addresses);
		
		//run through each address and ensure they match the array we passed
		for(int i = 0; i<addresses.length; i++) {
			assertEquals("added Bcc at position " + i + " was supposed to be " + addresses[i] + " but instead was " + testEmail.getBccAddresses().get(i).toString(),
					addresses[i],testEmail.getBccAddresses().get(i).toString());
		}
		
	}
	
	

}
