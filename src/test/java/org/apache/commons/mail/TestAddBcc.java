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
import org.apache.commons.mail.SimpleEmail;

public class TestAddBcc extends TestCase{
	SimpleEmail testEmail;
	
	//Setup using EmailMock which extends Simple Email
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	
	/* testAddBcc() passes an array of emails and
	 * checks the first in the list.
	 */
	public void testAddBcc() throws EmailException {
        System.out.println("Class TestAddBcc tests whether the .addBcc function works correctly by adding bcc emails then accessing them with the object's .get() function.  Student nhf___");
		String[] emails = {"a@b.com", "b@b.com"}; 
		testEmail.addBcc(emails);
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}

}