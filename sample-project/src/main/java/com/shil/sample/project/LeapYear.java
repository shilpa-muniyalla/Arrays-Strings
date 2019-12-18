package com.shil.sample.project;

public class LeapYear {
	public boolean checkLeapYear(int year) {
		int leapYearConstant= 4;
		if(year%leapYearConstant==0) {
			
			System.out.println("This is a Leap Year" +year);
			return true;
					}
		else {
			
			System.out.println("This is not a Leap Year" +year);
			return false;
		}
	}
	
	public static void main(String[] args) {
		int b = 2019;
		LeapYear l = new LeapYear();
		l.checkLeapYear(b);
	}

}
