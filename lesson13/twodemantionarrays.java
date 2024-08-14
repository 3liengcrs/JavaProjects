package com.neotech.lesson13;

public class twodemantionarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = {
				{1,6,8,4},
				{5,89,4,55,1,0,12},
				{45,1,33,2,56},
				{45,5}
		};
		
		int num = 0;
		for (int row = 0; row<numbers.length; row++) {
			for(int col = 0; col<numbers[row].length; col++) {
				num +=numbers[row][col];
				System.out.print(numbers[row][col] + " ");
			}System.out.println();
		} System.out.println(num);

	}

}
