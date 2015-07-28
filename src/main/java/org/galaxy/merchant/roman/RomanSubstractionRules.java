package org.galaxy.merchant.roman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanSubstractionRules {
	private static List<Roman> emptyList = new ArrayList<Roman>(0);
	private static Map<Roman,List<Roman>> allowedSubstractionMap = new HashMap<Roman, List<Roman>>(){{
		put(Roman.I, Arrays.asList(Roman.V,Roman.X));
		put(Roman.X, Arrays.asList(Roman.L,Roman.C));
		put(Roman.C, Arrays.asList(Roman.D,Roman.M));
		put(Roman.V, emptyList);
		put(Roman.L, emptyList);
		put(Roman.D, emptyList);
	}};

	public boolean isAllowed(int rightOpeand, int leftOperand) {
		Roman rightOperand = Roman.getByValue(rightOpeand);
		List<Roman> list = allowedSubstractionMap.get(rightOperand);
		return list.contains(Roman.getByValue(leftOperand));
	}
  
}
