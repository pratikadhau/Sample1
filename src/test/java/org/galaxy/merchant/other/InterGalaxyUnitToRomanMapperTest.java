package org.galaxy.merchant.other;

import static org.galaxy.merchant.roman.Roman.I;
import static org.galaxy.merchant.roman.Roman.L;
import static org.galaxy.merchant.roman.Roman.V;
import static org.galaxy.merchant.roman.Roman.X;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.galaxy.merchant.roman.Roman;
import org.junit.Before;
import org.junit.Test;

public class InterGalaxyUnitToRomanMapperTest {

	private InterGalaxyUnitToRomanMapper mapper;
	
	@Before
	public void before(){
		mapper = new InterGalaxyUnitToRomanMapper();
		mapper.addMapping("glob", I);
		mapper.addMapping("prok", V);
		mapper.addMapping("pish", X);
		mapper.addMapping("tegj", L);
	}

	@Test
	public void shouldAddMapping() throws Exception {
		
		Roman roman = mapper.getRomanUnit("glob");
		Roman roman1 = mapper.getRomanUnit("prok");
		Roman roman2 = mapper.getRomanUnit("pish");
		Roman roman3 = mapper.getRomanUnit("tegj");
		
		assertEquals(I, roman);
		assertEquals(V, roman1);
		assertEquals(X, roman2);
		assertEquals(L, roman3);
	}
	
	@Test
	public void shouldReturnRomanText() {
		List<String> list = new ArrayList<String>();
		list.add("glob");
		list.add("prok");
		list.add("pish");
		list.add("pish");
		String romanString = mapper.mapToRomanString(list);
		
		assertEquals(I.name()+V.name()+X.name()+X.name(), romanString);
	}
	
	@Test(expected=UnderstandingException.class )
	public void shouldThrowUnderstandingExeptionForUnknownGalacticUnit() {
		List<String> list = new ArrayList<String>();
		list.add("glo");//incorrect unti
		list.add("prok");
		list.add("pish");
		list.add("pish");
		String romanString = mapper.mapToRomanString(list);
		
	}
	

}
