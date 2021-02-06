package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n = Math.random();//0~0.99999999999;
					  			 // 0 <= n < 1
		System.out.println("n : "+ n);
		
		int n2 = (int)(Math.random()*10 + 1);
		System.out.println(n2);

		int n3 = (int)(Math.random()*5 + 1);
		if(1 <= n3 && n3 < 6) {
		System.out.println("n3 : "+ n3);
		}
		
		int n4 = (int)(Math.random()*12 + +2);
		if(2 <= n4 && n4 < 14) {
		System.out.println("n4 : "+ n4);
		}
		
		int n5 = (int)(Math.random()*35 + 17);
		if(17 <= n5 && n5 < 52) {
		System.out.println("n5 : "+ n5);
		
		int max = 51;
		int min = 17;
		int rNum = (int)(Math.random()*(max - min + 1) + min);
		}
	}
}
