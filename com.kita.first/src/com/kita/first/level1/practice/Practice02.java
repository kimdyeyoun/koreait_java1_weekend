package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		System.out.printf("받은 정수 : %d입니다.\n",num);
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		scan.close();
	}

}
