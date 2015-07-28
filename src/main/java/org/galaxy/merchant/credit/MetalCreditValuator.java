package org.galaxy.merchant.credit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.galaxy.merchant.other.InterGalaxyUnitToRomanMapper;
import org.galaxy.merchant.roman.RomanString;

public class MetalCreditValuator {
	private Set<Metal> metals = new HashSet<Metal>();
	private InterGalaxyUnitToRomanMapper mapper = null;
	

	public MetalCreditValuator(InterGalaxyUnitToRomanMapper mapper) {
		this.mapper = mapper;
	}
	
	public void addMetalForCredit(List<String> intergalacticUnits,String metal,int totalCredit){
		RomanString romanString = getRomanString(intergalacticUnits);
		metals.add(new Metal(metal,totalCredit/romanString.intValue()));
	}

	private RomanString getRomanString(List<String> intergalacticUnits) {
		return new RomanString(mapper.mapToRomanString(intergalacticUnits));
	}
	
	public Metal getMetal(String metalString){
		for (Metal metal : metals) {
			if(metal.getName().equals(metalString)){
				return metal;
			}
		}
		return null;
	}
	
	public double getCredit(List<String> intergalacticUnits,String metal){
		return getMetal(metal).getValue() * getRomanString(intergalacticUnits).intValue();
	}
}
