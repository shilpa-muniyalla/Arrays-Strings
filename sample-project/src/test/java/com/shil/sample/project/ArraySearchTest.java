package com.shil.sample.project;

import org.junit.Assert;
import org.junit.Test;

public class ArraySearchTest {
	
	int[] number= {1,2,3,4,5};
	@Test
	public void numberFound() {
		int a=3;
		ArraySearch arraySearch = new ArraySearch();
		Assert.assertTrue("TRUE",arraySearch.checkArraySearch(number,a));
	}

	@Test
	public void numberNotFound() {
		int a=8;
		ArraySearch arraySearch = new ArraySearch();
		Assert.assertFalse("FALSE",arraySearch.checkArraySearch(number,a));
	}
}
