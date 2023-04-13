package org.apache.commons.mail;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test; 

public class addCcTest {

	private static final String[] TEST_EMAILS = { "ab@cd.org", "boy@icloud.com",
	"girl@gmail.com"};
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	//testAddCc test coverage 84.8%
	@Test
	public void testAddCc() throws Exception {
		email.addCc(TEST_EMAILS);
		assertEquals(3, email.getCcAddresses().size());
	}
	
	
	
	
	
	
}
