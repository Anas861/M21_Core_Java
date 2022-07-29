package com.cg.testing;
//Program on assertions 
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram {
	@Test
	void display()
	{
		int arr[]= {1,2,3,4};
		//AssertEqual method will check whether the two parameters value are same or not
		//if it is same you'll not get any failures 
		assertAll("arr",()->assertEquals(arr[0],1));
	}
}
