package com.neotech.practice;



public class MovesZeros {
	
	public void move(int arry[]) {
		
		int n = arry.length;
		int [] arr2 = new int[n];
		System.out.println(n);
		for(int i=0 ; i <n; i++) {
			if(arry[i]== 0) {
				arr2[n]=arry[i];	
				n--;
				} else {
					arr2[0]=arry[i];
				}
		
		}System.out.println(arr2);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovesZeros a  = new MovesZeros();
		int  [] ar = {1,6,0,3,0,4};
		a.move(ar);

	}

}
