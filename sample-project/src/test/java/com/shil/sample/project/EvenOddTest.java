package com.shil.sample.project;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {

	@Test
	public void evenNumberTest() {
		EvenOdd evenOdd =new EvenOdd();
		Assert.assertEquals("Actual and expected are not same","EVEN",evenOdd.checkEvenOdd(4));
		
	}
	
	@Test
	public void oddNumberTest() {
		EvenOdd evenOdd2=new EvenOdd();
		Assert.assertEquals("ODD", evenOdd2.checkEvenOdd(3));
	}
	
	@Test
	public void zeroTest() {
		EvenOdd evenOdd3=new EvenOdd();
		Assert.assertEquals("ZERO", evenOdd3.checkEvenOdd(0));
	}

}
