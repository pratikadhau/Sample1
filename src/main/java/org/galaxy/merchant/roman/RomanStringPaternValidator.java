package org.galaxy.merchant.roman;

public class RomanStringPaternValidator {
	private char[] charArray;
	private String romanString;

	public RomanStringPaternValidator(String string) {
		this.charArray = string.toCharArray();
		this.romanString = string;
	}

	public boolean isValid() {
		return shouldNotHave("IIII") &&
				shouldNotHave("XXXX") &&
				shouldNotHave("CCCC") &&
				shouldNotHave("MMMM") && 
				shouldNotOccurTwice('D') && 
				shouldNotOccurTwice('L') && 
				shouldNotOccurTwice('V');
	}

	private boolean shouldNotHave(String string) {
		if(romanString.contains(string)){
			throw new RuntimeException(string + "is not allowed");
		}
		return true;
	}
	
	
	private boolean shouldNotOccurTwice(char c){
		int cnt =0;
		for (char c1 : charArray) {
			cnt +=(c1 == c )? 1: 0;
			if(cnt>1){
				throw new RuntimeException(c + "is not allowed twice");
			}
		}
		return true;
	}

}
