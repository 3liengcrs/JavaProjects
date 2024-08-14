package com.neotech.lesson12;

public class RetreiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {12,45,65,10,84,20};
		//TASK 01
		// way 1
		int sum = 0;
		for (int i = 0; i<numbers.length; i++) {
			sum+=numbers[i];
			
			
		}System.out.println(sum);
		
		// way 2
		int num = 0;

		for(int number:numbers) {
			num+=number;
			
		}System.out.println(num);	
		//TASK 02
		// way 1
		
		int max = 0;
		for (int i = 0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}System.out.println(max);
		// way 2
		
	}

}
