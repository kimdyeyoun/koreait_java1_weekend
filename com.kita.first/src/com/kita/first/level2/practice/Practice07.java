package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
public static void main(String[] args) {
	//랜던값 10~90을 맞추는 게임
	// UP / DOWN / Great!!
	
	Scanner sc = new Scanner(System.in);
	
	int max = 90;
	int min = 10;
	int num = (int)(Math.random()*(max - min + 1) + min);
	
	while(true)
	{
		System.out.print("숫자를 입력 : ");
		int num1 = sc.nextInt();
		if(num1 >= max || num1 < min)
		{
			System.out.println("잘못 입력 했습니다.다시 입력해주세요");
			continue;
		}
		if (num > num1) {
			System.out.println("up");
		}else if (num < num1) {
			System.out.println("down");
		}else if (num == num1) {
			sc.close();
			System.out.println("great");
			break;
		}
	}
}
}
