package com.kita.first.level1.practice;

import java.util.Scanner;

public class Pp1 {
public static void main(String[] args) {
	/*점수를 입력해 주세요: (0~100)
90점 이상 A
80점 이상 B
70점 이상 C
나머지는 D입니다. ( +, - 없다) 
 		
100 초과면 잘못 입력하였습니다.

일의 자리 수가 7점 이상이면 +
일의 자리 수가 3점 이하이면 -
 		
예를 들어, 95점: A, 97점: A+, 83점: B-*/
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력해 주세요: (0~100) : ");
	int num = sc.nextInt();
	int result = 0;
	int a = num - 90; 
	
	if (num >= 90) {
		result = 1;
	}
	else if (num >= 80) {
		result = 2;
	}else if (num >= 70) {
		result = 3;
	}
	
	switch (result) {
	case 1:
		System.out.println("A");
		break;
	case 2:
		System.out.println("B");
		break;
	case 3:
		System.out.println("C");
		break;
	default:
		break;
		}
	}
}

