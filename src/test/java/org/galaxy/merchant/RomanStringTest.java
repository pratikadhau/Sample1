package org.galaxy.merchant;

import static org.junit.Assert.*;

import org.galaxy.merchant.roman.RomanString;
import org.junit.Test;

public class RomanStringTest {

		@Test
		public void shouldGetValueOfRomanText() {
			assertEquals(1, new  RomanString("I").intValue());
			assertEquals(10, new  RomanString("X").intValue());
			assertEquals(9, new  RomanString("IX").intValue());
			assertEquals(4, new  RomanString("IV").intValue());
			assertEquals(6, new  RomanString("VI").intValue());
			assertEquals(2006, new  RomanString("MMVI").intValue());
			assertEquals(1944, new  RomanString("MCMXLIV").intValue());
		}
		
		@Test(expected=RuntimeException.class)
		public void shouldThrowExceptionForIIII() throws Exception {
			RomanString romanString = new  RomanString("IIIII");
			romanString.intValue();
		}
		
		@Test(expected=RuntimeException.class)
		public void shouldThrowExceptionForXXXX() throws Exception {
			RomanString romanString = new  RomanString("XXXX");
			romanString.intValue();
		}
		
		@Test(expected=RuntimeException.class)
		public void shouldThrowExceptionForCCCC() throws Exception {
			RomanString romanString = new  RomanString("CCCC");
			romanString.intValue();
		}
		
		@Test(expected=RuntimeException.class)
		public void shouldThrowExceptionForMMMM() throws Exception {
			RomanString romanString = new  RomanString("MMMM");
			romanString.intValue();
		}
		
		@Test(expected=RuntimeException.class)
		public void shouldThrowExceptionIF_D_occurTwice() throws Exception {
			RomanString romanString = new  RomanString("DMMMD");
			romanString.intValue();
		}

}
