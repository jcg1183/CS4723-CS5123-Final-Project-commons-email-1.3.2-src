//Josh Greene
//CS5123 Project 2
//12-4-20

//Reused from Project 1

package org.apache.commons.mail;

import java.util.ArrayList;
import javax.mail.internet.MimeMultipart;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import java.util.HashMap;
import java.util.Date;
import junit.framework.TestCase;

public class TestAddBcc extends TestCase{
	EmailMock testEmail;
	
	//Setup using EmailMock which extends Simple Email
	public void setUp() {
		testEmail = new EmailMock();
	}
	
	/* testAddBcc() passes an array of emails and
	 * checks the first in the list.
	 */
	public void testAddBcc() throws EmailException {
		String[] emails = {"a@b.com", "b@b.com"}; 
		testEmail.addBcc(emails);
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}

}