package com.shil.sample.project;

import org.junit.*;

public class LeapYearTest {

	@Test
	public void leapYearTrue() {
		LeapYear leapYear= new LeapYear();
		Assert.assertTrue("TRUE",leapYear.checkLeapYear(2020));
	}
	
	@Test
	public void leapYearFalse() {
		LeapYear leapYear= new LeapYear();
		Assert.assertFalse("FALSE",leapYear.checkLeapYear(2019));
	}
}
