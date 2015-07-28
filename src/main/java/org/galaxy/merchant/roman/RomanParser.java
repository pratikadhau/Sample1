package org.galaxy.merchant.roman;

public class RomanParser {

	private  int[] valuesArray;
	private int length;
	private static RomanSubstractionRules substractionRules = new RomanSubstractionRules();
	
	public RomanParser(int[] valuesArray) {
		this.valuesArray = valuesArray;
		this.length = valuesArray.length;
	}

	public int getTotalValue() {
		int value = 0; 
		for(int i=0,j=1;i<length;i++,j++){
			int predesor = valuesArray[i];
			int successor = (j>=length) ? 0: valuesArray[j];
			if(predesor >= successor){
				value += predesor;
			}else{
				value += getDifference(predesor, successor);
				i++;j++;
			}
		}
		return value;
	}

	private int getDifference(int predesor, int successor) {
		if(substractionRules.isAllowed(predesor, successor)){
			return successor-predesor;
		}else{
			throw new RuntimeException("Not Allowed");
		}
	}

}
