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

public class TestAddCC extends TestCase{
	SimpleEmail testEmail;
	
	//Setup using EmailMock which extends Simple Email
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	
    /*
	 * testAddCc() adds a cc email and checks
	 */
	public void testAddCc() throws EmailException {
		System.out.println("Class TestAddCC tests whether the .addCc function works correctly by adding cc emails then accessing them with the object's .get() function.  Student nhf___");

		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}
}
	