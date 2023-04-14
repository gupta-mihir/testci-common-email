//Mihir Gupta
//*Please note addCCTest and addReplyToTest are in their own .java files, in 
//  this same directory. 
package org.apache.commons.mail;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Test; 

public class EmailTest {

	private static final String[] TEST_EMAILS = { "ab@cd.org", "boy@icloud.com",
	"girl@gmail.com"};
	private static final String HOST_NAME = "Mihir Gupta";
	private static final String INVALID_NAME = null;
	private static final String SERVER_NAME = "localhost";
	private static final String TEST_EMAIL = "ab@cd.org";
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
	
	}
	//AddBcc test case, 84.8% test coverage
	@Test
	public void testAddBcc() throws Exception {
		email.addBcc(TEST_EMAILS);
		assertEquals(3, email.getBccAddresses().size());
	}
	//getHostName, 70.6% test coverage
	@Test
	public void testGetHostName() throws Exception {
			email.setHostName(HOST_NAME);
			assertEquals("Mihir Gupta", email.getHostName());
	}
	//getHostName, another test case function
	@Test
	public void testGetHostNameNull() throws Exception {
		email.setHostName(INVALID_NAME);
		assertEquals(null, email.getHostName());
	}
	
	/*
	//getMailSessions 72.0% test coverage
	@Test
	public void testGetMailSessionsV3() throws Exception {
		email.hostName = "";
		email.getMailSession();
		
	}
	*/

	//getMailSessions another test case function
	@Test
	public void testGetMailSessionsV4() throws Exception {
		email.hostName = "Hello";
		email.getMailSession();
		
	}
	
	/*
	//getSentDate 100% test coverage
	@Test
	public void testGetSentDate() throws Exception {
		final Date emailDate = Calendar.getInstance().getTime();
		assertEquals(emailDate, this.email.getSentDate());
		
	}
	*/

	//getSentDate, another test case function
	@Test
	public void testGetSentDateV2() throws Exception {
		final Date emailDate = Calendar.getInstance().getTime();
		this.email.setSentDate(emailDate);
		final Date sentDate = email.getSentDate();
		assertTrue(Math.abs(sentDate.getTime()- emailDate.getTime()) < 1000);
	}
	
	/*
	//testSetFrom 100% test coverage
	@Test
	public void testSetFrom() throws Exception {
		email.setFrom(TEST_EMAIL);
		assertEquals("ab@cd.org", email.getFromAddress());
	}
	*/
	
	//testGetSocketConnectionTimeout 100% test coverage
	@Test
	public void testGetSocketConnectionTimeout() throws Exception {
		email.setSocketConnectionTimeout(EmailConstants.SOCKET_TIMEOUT_MS);
		assertEquals(EmailConstants.SOCKET_TIMEOUT_MS, email.getSocketConnectionTimeout());
	}
	
	/*
	//testAddHeader total coverage 78.3%
	@Test
	public void testAddHeaderNone() throws Exception {
		email.addHeader("", INVALID_NAME);
	}
	//testAddHeader another test case, with valid input
	@Test
	public void testAddHeader() throws Exception {
		final Map<String, String> header_vals = new HashMap<String, String>();
		header_vals.put("MUST READ NOW!", "WOW!");
		header_vals.put("NOT SCAM", "FREE MONEY");
		header_vals.put("URGENT WORK!", "Clock in");
		
		for (final Map.Entry<String, String> header_val : header_vals.entrySet()) {
			final String str1 = header_val.getKey();
			final String str2 = header_val.getValue();
			email.addHeader(str1, str2);
		}
		assertEquals(header_vals, email.getHeaders());
	}
	//buildMimeMessage, total coverage 1.2% (only one that isn't over 70%)
	@Test
	public void testBuildMimeMessage_01() throws Exception {
		email.subject = new String("");
		email.charset = new String("");
		// email.content = new String("");
		email.content = null;
		email.message = null;
		email.buildMimeMessage();
		
	}
	@Test
	public void testBuildMimeMessage_NOT_NULL() throws Exception {
		
		email.subject = new String("Work");
		email.charset = new String("");
		email.content = null;
		email.message = null;
		email.buildMimeMessage();
		
	}
	
	@Test
	public void testBuildMimeMessage_03() throws Exception {
		
		email.subject = new String("Work");
		email.charset = new String("Why");
		email.content = null;
		email.message = null;
		email.buildMimeMessage();
		
	}
	

	*/
	
	

}
