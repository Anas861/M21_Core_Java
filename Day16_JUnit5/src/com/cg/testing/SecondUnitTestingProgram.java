package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	@Test
	void print()
	{
		System.out.println("Hello Guys");
	}
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("@BeforeEach-executes before each the test methods in the class");
	}
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@BeforeAll-executes once before all the test methods in the class");
	}

}
