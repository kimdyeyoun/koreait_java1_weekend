package com.kita.first.level2.practice;

import java.util.Scanner;

import com.kita.first.level1.Scan;

public class Practice15 {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		final int LEN =3;//게임 칸 개수
		int[] rArr =new int[LEN];//컴퓨터가 뽑는 값 배열
		int[] myArr = new int[LEN];// 내가 입력한 값 배열
		int max = 9;
		int min = 1;
		int strike=0;
		int ball=0;
		int out=0;// LEN - strike-ball
		int temp =0;
		System.out.println("숫자 게임 시작!");
		


		
		
	
		
		
		while(true)
		{
		System.out.print("숫자를 입력 : ");
		myArr[0] = scan.nextInt();
		System.out.print("숫자를 입력 : ");
		myArr[1] = scan.nextInt();
		System.out.print("숫자를 입력 : ");
		myArr[2] = scan.nextInt();
		strike = 0;
		ball = 0;
		out =0;
		
			if (myArr[0] == rArr[0]) {
				strike++;
			}else if (myArr[0] == rArr[1] || myArr[0] == rArr[2]) {
				ball++;
			}else {
				out++;
			}
			
			if (myArr[1] == rArr[1]) {
				strike++;
			}else if (myArr[1] == rArr[0] || myArr[1] == rArr[2]) {
				ball++;
			}else {
				out++;
			}
			
			if (myArr[2] == rArr[2]) {
				strike++;
			}else if (myArr[2] == rArr[0] || myArr[2] == rArr[1]) {
				ball++;
			}else {
				out++;
			}
			
			System.out.printf("%d 스트라이크\n",strike);
			System.out.printf("%d 볼\n",ball);
			System.out.printf("%d 아웃\n",out);

			if (strike == 3) {
				System.out.println("3스트라이크 게임을 종료합니다.");
				break;
			}
		}
}
}
