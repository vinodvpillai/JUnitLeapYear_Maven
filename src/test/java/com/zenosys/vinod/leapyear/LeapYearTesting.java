package com.zenosys.vinod.leapyear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTesting {

	//No. divisible by 4
	//No. must not be divisible by 100 or divisible by 400
	
	@Test
	public void leapYearDivisibleByFour(){
		assertTrue(LeapYear.isLeapYear(2016));
	}	
	
	@Test
	public void normalYearNotDivisibleByFour(){
		assertFalse(LeapYear.isLeapYear(3));
	}
	
	@Test
	public void leapYearNotDivisibleByOneHundred(){
		assertFalse(LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void leapYearDivisibleByFourHundred(){
		assertTrue(LeapYear.isLeapYear(2000));
	}
}
