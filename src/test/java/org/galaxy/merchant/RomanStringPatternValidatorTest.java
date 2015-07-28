package org.galaxy.merchant;

import static org.junit.Assert.assertTrue;

import org.galaxy.merchant.roman.RomanStringPaternValidator;
import org.junit.Test;

public class RomanStringPatternValidatorTest {

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfIOccurs4TimesContinously() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("IIII");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfXOccurs4TimesContinously() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("XXXXMX");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfMOccurs4TimesContinously() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("MMMM");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfCOccurs4TimesContinously() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("CCCC");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfD_occursTwice() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("DCCCD");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfL_occursTwice() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("LLCCCD");
		classUnderTest.isValid();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfV_occursTwice() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("LCCCDVV");
		classUnderTest.isValid();
	}
	
	@Test
	public void shouldReturnTrueForValidString() {
		RomanStringPaternValidator classUnderTest = new RomanStringPaternValidator("LCCCDV");
		assertTrue(classUnderTest.isValid());
	}

	@Test
	public void should() throws Exception {
		
	}
}
