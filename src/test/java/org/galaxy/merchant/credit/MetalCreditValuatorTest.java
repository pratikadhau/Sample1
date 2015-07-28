package org.galaxy.merchant.credit;

import static org.galaxy.merchant.roman.Roman.I;
import static org.galaxy.merchant.roman.Roman.L;
import static org.galaxy.merchant.roman.Roman.V;
import static org.galaxy.merchant.roman.Roman.X;

import java.util.Arrays;

import org.galaxy.merchant.other.InterGalaxyUnitToRomanMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MetalCreditValuatorTest {

	private InterGalaxyUnitToRomanMapper mapper;
	private MetalCreditValuator creditValuator;
	
	@Before
	public void init(){
		mapper = new InterGalaxyUnitToRomanMapper();
		mapper.addMapping("glob", I);
		mapper.addMapping("prok", V);
		mapper.addMapping("pish", X);
		mapper.addMapping("tegj", L);
		creditValuator = new MetalCreditValuator(mapper);
	}

	@Test
	public void shouldAddMetalsValueOnBasesInput() {
		
		String metalString = "Silver";
		creditValuator.addMetalForCredit(Arrays.asList("glob","glob"), metalString, 34);
		creditValuator.addMetalForCredit(Arrays.asList("glob","prok"), "Gold", 57800);
		creditValuator.addMetalForCredit(Arrays.asList("pish","pish"), "Iron", 3910);
		
		Metal silver = creditValuator.getMetal(metalString);
		Metal gold = creditValuator.getMetal("Gold");
		Metal iron = creditValuator.getMetal("Iron");	
		Assert.assertEquals(17.0, silver.getValue(),1);
		Assert.assertEquals(14450.0, gold.getValue(),1);
		Assert.assertEquals(195.0, iron.getValue(),1);
	}

}
