package com.zenosys.vinod.leapyear;

public class LeapYear {

	public static boolean isLeapYear(final int year) {
		return divisible(year,4) && (!divisible(year, 100)||divisible(year, 400));
	}

	private static boolean divisible(final int year,final int denominator) {
		return year%denominator==0;
	}

}
