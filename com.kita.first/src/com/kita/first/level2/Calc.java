package com.kita.first.level2;

import java.util.Scanner;

public class Calc {
//	public static (리턴타입 or void) 메소드명동사형(매개변수){
//		실행코드
//		return 리턴타입 값;
//	}
	
	public static void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	//전원 끄는 메소드
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//int값을 2개 받아서 둘을 더한 값을 돌려주는 메소드
	public static int sum(int n1,int n2){
		int result = n1 + n2;
		System.out.println("result: "+result);
		return result;
	}
	public static int sum(int... arr) {
		//int[] arr = {1,2,3,4,5,6,7,8}
		int result5 = 0;
		for(int i=0;i<arr.length;i++) {
			result5 += arr[i];
		}
		System.out.println("result: "+result5);
		return result5;
	}
	// 개수, 타입, 
	public static double sum(double n1,double n2){
		//overloding
		double result = n1 + n2;
		System.out.println("result: "+result);
		return result;
	}
	//int값을 2개 받아서 둘을 뺀 값을 돌려주는 메소드
	//단, 두 값 중에 큰 수에서 작은 수를 빼서
	public static int minus(int n3, int n4) {
		int result1;
		if (n3 > n4) {
			result1 = n3 - n4;
		}else {
			result1 = n4 - n3;
		}
		System.out.println("result1: "+result1);
		return result1;
	}
	//결과가 무조건 양수로 나오게 만드시오
	//int값을 2개 받아서 둘을 곱한 값을 돌려주는 메소드
	public static int multiply(int n5, int n6) {
		int result2 = n5 * n6;
		System.out.println("result2:"+result2);
		return result2;
	}
	//int값을 2개 받아서 둘을 나눈 값(실수)을 돌려주는 메소드
	public static double divide(int n7, int n8) {
		double result3 = (double)n7 / n8;
		System.out.println("result3:"+result3);
		return result3;
	}
}
