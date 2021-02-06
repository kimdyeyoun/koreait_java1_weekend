package com.kita.first.level2.practice;

public class Practice05 {
	public static void main(String[] args) {
//	 while문에 조건식을 사용하여
//	 1~100 모두 더한값이 출력되도록 하세요
//	 합계 : 5050
		int i = 1;
		int hap = 0;
		
		while(true) {
			if(i==101) {
				break;
			}
			hap = hap +i;
			i++;
		}
		System.out.println("합계: "+hap);
	}
}
