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

public class EmailTest extends TestCase{
	EmailMock testEmail;
	
	//Setup using EmailMock which extends Simple Email
	public void setUp() {
		testEmail = new EmailMock();
	}
	
    /*
	 * testAddCc() adds a cc email and checks
	 */
	public void testAddCc() throws EmailException {
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}
}
	