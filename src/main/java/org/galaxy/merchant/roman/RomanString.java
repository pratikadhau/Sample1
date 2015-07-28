package org.galaxy.merchant.roman;

public class RomanString {
	char[] charArray ;
	private int[] valuesArrays;
	
	public RomanString(String string) {
		RomanStringPaternValidator romanStringValidator = new RomanStringPaternValidator(string);
		boolean isValidString = romanStringValidator.isValid();
		charArray = isValidString ? string.toCharArray():new char[0];
		valuesArrays = new int[charArray.length];
		for(int i=0;i<charArray.length;i++){
			valuesArrays[i]= Roman.valueOf(Character.toString(charArray[i])).getValue();
		}
	}
	
	
	public int intValue(){
		return new RomanParser(valuesArrays).getTotalValue();
	}
	
}