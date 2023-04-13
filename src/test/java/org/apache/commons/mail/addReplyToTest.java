package org.apache.commons.mail;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test; 

public class addReplyToTest {

	private static final String TEST_EMAIL = "ab@cd.org";
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}
	@Test
	public void testAddReplyTo() throws Exception {
		email.addReplyTo(TEST_EMAIL);
		assertEquals(1, email.getReplyToAddresses().size());
	}
	
	
	
	
	
	
}
