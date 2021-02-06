package com.kita.first.level2.practice;

public class Practice08 {
	public static void main(String[] args) {
		//10칸짜리 정수(int) 배열 arr 만들어서
		//1~10과 같이 값을 집어 넣기
		int[] arr1 = new int[10];
		int len = arr1.length;
		int b = 1;
		int c = 0;
		for(int a = 0;a < arr1.length;a++)
		{	
			arr1[a] = b;
			b= b+1;
		}
		for(int a = 0;a < arr1.length-1;a++)
		{
			System.out.print(arr1[a]+", ");	
		}System.out.print(arr1[9]+" ");
	}
}
