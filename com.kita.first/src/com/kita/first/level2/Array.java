package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		char[] arr2 = new char[10];
		double[] arr3 = new double[100];
		//기본형 변수들의 기본값
		//숫자형 : 0
		//char: (빈값)
		//boolean : false
		
		String[] arr4 = new String[10];
		//참조형 변수의 기본 값 : null
		
		arr1[0] = 1;
		arr1[2] = 5;
		System.out.println("arr1[0]: "+ arr1[0]);
		System.out.println("arr1[2]: "+ arr1[2]);
		
		int [] arr7 = {10,20,30,40};
		arr7 = new int[] {10,20,30};
		
		int len = arr1.length;
		
		//배열 안에 값 집어넣기
		for(int a = 0;a < arr1.length;a++)
		{
			arr1[a] = 3;
		}
		//배열 아느이 값 출력하기
		for(int a = 0;a < arr1.length;a++) {
			System.out.print(arr1[a]+" ");
		}
	}
}
