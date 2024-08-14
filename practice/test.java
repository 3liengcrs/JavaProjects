package com.neotech.practice;

public class test {
	
//	public void test(){
//		System.out.println("Hello World");
//	}
	static String schoolName;
	public test(String name ,String last ) {
		System.out.println(name + " this is my name "+ last + " is my lat name");
		
	}
	
	

	public test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test tst = new test("Ali","Mo");
		tst.schoolName = "Hello World";
		System.out.println(tst.schoolName);
		
	}

}
