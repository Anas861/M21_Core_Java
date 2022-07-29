package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram {
	@Test
	void trueAssumption()
	{
		//assumeTrue says that if your assumption and result both are true then will execute
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	@Test
	void falseAssumptions()
	{
		//Will evaluate the given assumption and test will run if result is false
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	@Test
	void assumptionThat () 
	{
		//It will evaluate the lambda executable only if given assumption is true 
		String str="Anas";
		assumingThat(str.equals("Anas"),
		()->assertEquals(2+3,5));
	}
}
