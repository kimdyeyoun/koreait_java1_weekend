package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : ");
		int num = sc.nextInt();
		int result = 0;
		
		if(num >= 3 && num <= 5) {
			result = 1;
		}else if (num >= 6 && num <= 8) {
			result = 2;
		}else if (num >= 9 && num <= 11) {
			result = 3;
		}else if(num == 1 || num == 2 || num == 12){
			result = 4;
		}
		
		
		switch (result) {
		case 1:
			System.out.println("봄입니다.");
			break;
		case 2:
			System.out.println("여름입니다.");
			break;
		case 3:
			System.out.println("가을입니다.");
			break;
		case 4:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

}
