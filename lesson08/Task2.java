package com.neotech.lesson08;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean workDay = true;
		int day = 1;
		
		while (workDay) {
			System.out.println("I need a day off");
			day++;
			if (day == 6) {
				System.out.println("I do not need a day off anymore");
				workDay = false;
			}
		}
	}

}
