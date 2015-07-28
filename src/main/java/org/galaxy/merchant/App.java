package org.galaxy.merchant;

import java.util.Arrays;

import org.galaxy.merchant.other.InterGalacticMerchant;
import org.galaxy.merchant.roman.Roman;

public class App {

	
	public static void main(String[] args) {
			InterGalacticMerchant galacticMerchant = new InterGalacticMerchant();
		// Set up roman Mapping
			galacticMerchant.addRomanMapping("glob", Roman.I);
			galacticMerchant.addRomanMapping("prok", Roman.V);
			galacticMerchant.addRomanMapping("pish", Roman.X);
			galacticMerchant.addRomanMapping("tegj", Roman.L);
		//Set up credit statement
			galacticMerchant.addGivenCreditStatement(Arrays.asList("glob","glob"), "Silver", 34);
			galacticMerchant.addGivenCreditStatement(Arrays.asList("glob","prok"), "Gold", 57800);
			galacticMerchant.addGivenCreditStatement(Arrays.asList("pish","pish"), "Iron", 3910);
			
		//Start exchange	
			galacticMerchant.printValue("how much is pish tegj glob glob ?");
			galacticMerchant.printCredit("how many Credits is glob prok Silver ?");
			galacticMerchant.printCredit("how many Credits is glob prok Gold ?");
			galacticMerchant.printCredit("how many Credits is glob prok Iron ?");
		    galacticMerchant.printValue("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
	}
}
