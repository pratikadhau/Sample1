package org.galaxy.merchant.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.galaxy.merchant.credit.MetalCreditValuator;
import org.galaxy.merchant.roman.Roman;
import org.galaxy.merchant.roman.RomanString;

public class InterGalacticMerchant {
	private InterGalaxyUnitToRomanMapper mapper;
	private MetalCreditValuator creditValuator;

	public InterGalacticMerchant() {
		mapper = new InterGalaxyUnitToRomanMapper();
		creditValuator = new MetalCreditValuator(mapper);
	}

	public void addRomanMapping(String interGalaticUntit, Roman roman) {
		mapper.addMapping(interGalaticUntit, roman);
	}

	public void addGivenCreditStatement(List<String> interGalcticUnits,
			String metalString, int totalCredit) {
		creditValuator.addMetalForCredit(interGalcticUnits, metalString,
				totalCredit);
	}

	public int getVaue(List<String> stringList) {
		String romanStr = mapper.mapToRomanString(stringList);
		RomanString romanString = new RomanString(romanStr);
		return romanString.intValue();
	}

	public double getCredit(List<String> intergalacticUnits, String metal) {
		return creditValuator.getCredit(intergalacticUnits, metal);
	}

	public void printValue(String statement) {
		String statementString = statement
				.substring(12, statement.length() - 1);
		String[] inergalcticUnits = statementString.split(" ");
		try {
			System.out.println(statementString + " is "
					+ getVaue(getLastButOneArrayAsList(inergalcticUnits)));
		} catch (UnderstandingException exception) {
			System.out.println("I have no idea what you are talking about");
		} catch (RuntimeException exception) {
			System.out.println(statementString + " is not allowed");
		}
	}

	public void printCredit(String statement) {
		String statementString = statement
				.substring(20, statement.length() - 1);
		String[] inergalcticUnits = statementString.split(" ");
		try {
			System.out.println(statementString
					+ "is "
					+ getCredit(getLastButOneArrayAsList(inergalcticUnits),
							inergalcticUnits[inergalcticUnits.length - 1])
					+ " Credits.");
		} catch (UnderstandingException exception) {
			System.out.println("I have no idea what you are talking about");
		} catch (RuntimeException exception) {
			System.out.println(statementString + " is not allowed");
		}
	}

	private List<String> getLastButOneArrayAsList(String[] inergalcticUnits) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < inergalcticUnits.length; i++) {
			if (i != (inergalcticUnits.length - 1)) {
				list.add(inergalcticUnits[i]);
			}
		}
		return list;
	}

}
