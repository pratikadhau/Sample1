package org.galaxy.merchant;

import static org.galaxy.merchant.roman.Roman.C;
import static org.galaxy.merchant.roman.Roman.D;
import static org.galaxy.merchant.roman.Roman.I;
import static org.galaxy.merchant.roman.Roman.L;
import static org.galaxy.merchant.roman.Roman.M;
import static org.galaxy.merchant.roman.Roman.V;
import static org.galaxy.merchant.roman.Roman.X;

import org.junit.Assert;
import org.junit.Test;

public class RomanTest {

	@Test
	public void shouldTestValuesOfAllRomanNumbers() {
		Assert.assertEquals(1, I.getValue());
		Assert.assertEquals(5, V.getValue());
		Assert.assertEquals(10, X.getValue());
		Assert.assertEquals(50, L.getValue());
		Assert.assertEquals(100, C.getValue());
		Assert.assertEquals(500, D.getValue());
		Assert.assertEquals(1000, M.getValue());
	}

}
