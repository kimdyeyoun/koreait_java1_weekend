package com.kita.first.level2.practice;

github.com/black-phantom2020
public class Practice10 {
	public static void main(String[] args) {
		// int 배열 9칸짜리로 만들고
		// 1~9 랜덤으로 값을 뽑아 배열에 집어넣기
		
		//랜던값 겹치지 않게 배열에 집어넣기
		int temp =0;
		int o;
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*9 + 1);
			if(1 <= n && n <= 9) {
				if (temp != n) {
					arr[i] = n;
					System.out.printf("arr[%d] ",n);
					
				}	
			}
		}	
	}
}
