package org.galaxy.merchant.roman;

public enum Roman {
	I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

	private int value;

	private Roman(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	
	public static Roman getByValue(int value){
		Roman roman = null;
		switch(value){
		case 1:
			roman = I;
			break;
		case 5 :
			roman = V;
			break;
		case 10 :
			roman = X;
			break;
		case 50 :
			roman = L;
			break;
		case 100 :
			roman = C;
			break;
		case 500 : 
			roman = D;
			break;
		case 1000 :
			roman = M;
			break;
		}
		return roman;
	}
	
	
}
