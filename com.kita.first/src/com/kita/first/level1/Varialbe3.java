package com.kita.first.level1;

public class Varialbe3 {
	public static void main(String[] args) {
		// int<long<float<double<string
		int v1 = 3;
		int v2 = 5;
		System.out.println(v1 + v2);
		int result1 = v1 + v2;
		System.out.println(result1);
		
		double v3 = 2.4;
		int result2 = v1 + (int)v3;
		System.out.println(result2);
		
		long v4 = 12L;
		double result3 = v4;
		System.out.println(result3);
		float result4 = v4;
		System.out.println(result4);
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		System.out.println(1 + "2" + 3);//문자가 서열이 제일 위임을 알 수 있다.
		System.out.println("1" + 2 + 3);
		
		String s1 = "123";
		int n4 = Integer.parseInt(s1);
		int n5 = 1;
		System.out.println(n4 + n5);
	}

}
