package com.kita.first.level2;

public class Method1 {
	public static void main(String[] args) {
		int n1 =2;
		int n2 =3;
		System.out.println(n1 + n2);
		
		int result = Method1.sum(2, 3);
		System.out.println(result);
		int result1 = Method1.minus(2, 3);
		System.out.println(result1);
	}
	
//	비void형 메소드
//	public static 리턴타입 매소드명(매개변수1, 매겨번수2, ...) {
//		코드
//		return 리턴타입 값;
//	}
//	
//	void형 메소드
//	public static void 매소드명(매개변수1, 매겨번수2, ...) {
//		코드
//	}
	
	// 비void형으로 int값을 리턴하는 sum 메소드
	// 매개변수는 int 값 2개 가짐
	// 두 매개변수를 더해서 리턴
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	//비 void형으로 리턴 타입이 int인 minus 메소드
	//매개변수 1,2 전부 int 타입
	// 매개변수1에서 매개변수2를 뺀 값을 리턴
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
