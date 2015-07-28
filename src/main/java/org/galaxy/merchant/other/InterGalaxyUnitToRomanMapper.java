package org.galaxy.merchant.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.galaxy.merchant.roman.Roman;

public class InterGalaxyUnitToRomanMapper {
	private  Map<String,Roman> otherUnitsToRomanMap = new HashMap<String, Roman>();
	
	public String mapToRomanString(List<String> list) {
		StringBuilder builder = new StringBuilder();
		for (String string : list) {
			try{
				builder.append(otherUnitsToRomanMap.get(string).name());
			}catch(NullPointerException exception){
				throw new UnderstandingException();
			}
		}
		return builder.toString();
	}

	public void addMapping(String interGalaticUntit, Roman roman) {
		otherUnitsToRomanMap.put(interGalaticUntit, roman);
	}

	public Roman getRomanUnit(String otherUnit) {
		return otherUnitsToRomanMap.get(otherUnit);
	}

}
