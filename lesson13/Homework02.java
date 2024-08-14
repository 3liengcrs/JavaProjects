package com.neotech.lesson13;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] students = {
				{"Jennifer","Justin","Betul","Mona"},
				{"A","B","C","A"}
		};
		for (int i = 0; i<students[0].length ; i++) {
			if (students[1][i].equals("A") || students[1][i].equals("B") ) {
				System.out.print(students[0][i]+" "+students[1][i]+"; ");
			}
		}
 
	}

}
