package org.galaxy.merchant.roman;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanSubstractionRulesTest {

	@Test
	public void shouldAllowIf_I_isSubtractedFrom_V_OR_X () {
		RomanSubstractionRules rules = new RomanSubstractionRules();
		assertTrue(rules.isAllowed(Roman.I.getValue(),Roman.V.getValue()));
		assertTrue(rules.isAllowed(Roman.I.getValue(),Roman.X.getValue()));
		assertFalse(rules.isAllowed(Roman.I.getValue(),Roman.C.getValue()));
	}
	
	@Test
	public void shouldAllowIf_X_isSubtractedFrom_L_OR_C () {
		RomanSubstractionRules rules = new RomanSubstractionRules();
		assertTrue(rules.isAllowed(Roman.X.getValue(),Roman.L.getValue()));
		assertTrue(rules.isAllowed(Roman.X.getValue(),Roman.C.getValue()));
		assertFalse(rules.isAllowed(Roman.X.getValue(),Roman.I.getValue()));
	}
	
	@Test
	public void shouldAllowIf_C_isSubtractedFrom_D_OR_M () {
		RomanSubstractionRules rules = new RomanSubstractionRules();
		assertTrue(rules.isAllowed(Roman.C.getValue(),Roman.D.getValue()));
		assertTrue(rules.isAllowed(Roman.C.getValue(),Roman.M.getValue()));
		assertFalse(rules.isAllowed(Roman.C.getValue(),Roman.I.getValue()));
	}
	
	@Test
	public void shouldNotAllow_V_L_or_D_toSubstractFromAny() {
		RomanSubstractionRules rules = new RomanSubstractionRules();
		assertFalse(rules.isAllowed(Roman.V.getValue(),Roman.D.getValue()));
		assertFalse(rules.isAllowed(Roman.L.getValue(),Roman.M.getValue()));
		assertFalse(rules.isAllowed(Roman.D.getValue(),Roman.I.getValue()));
	}


}
