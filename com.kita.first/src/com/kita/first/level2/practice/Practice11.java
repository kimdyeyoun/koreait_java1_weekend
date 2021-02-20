package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원
		
//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		
		Scanner scan = new Scanner(System.in);
		
		String[] menuArr = {"콜라", "사이다","캔커피","데자와","환타","웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		
		int total=0;
		System.out.println("--메뉴--");
		for (int i = 0; i < priceArr.length; i++) {
			System.out.printf("%d. %s %d원\n",i+1,menuArr[i],priceArr[i]);
		}
		while (true) {
			System.out.print("메뉴를 입력하세요(0 입력 시 종료):");
			int num = scan.nextInt();
		if(num == 1){
			System.out.println(menuArr[0]+" "+priceArr[0]+"원");
			total = total + priceArr[0];
		}else if(num == 2) {
			System.out.println(menuArr[1]+" "+priceArr[1]+"원");
			total = total + priceArr[1];
		}else if(num == 3) {
			System.out.println(menuArr[2]+" "+priceArr[2]+"원");
			total = total + priceArr[2];
		}else if(num == 4) {
			System.out.println(menuArr[3]+" "+priceArr[3]+"원");
			total = total + priceArr[3];
		}else if(num == 5) {
			System.out.println(menuArr[4]+" "+priceArr[4]+"원");
			total = total + priceArr[4];
		}else if(num == 6) {
			System.out.println(menuArr[5]+" "+priceArr[5]+"원");
			total = total + priceArr[5];
		}	else {
			break;
		}
		}System.out.println("합계 : "+total+"원");
	}
}