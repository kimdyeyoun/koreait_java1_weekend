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
	System.out.print("점수를 입력해 주세요(0~100) : ");
	int num = sc.nextInt();
	int result = 0;
	int a = num - 90; 
	
	if (num >= 90 && num <= 96) {
		result = 1;
	}
	else if (num >= 80 && num <= 86) {
		result = 2;
	}else if (num >= 70 && num <= 76) {
		result = 3;
	}
	else if (num >= 97 && num <= 99) {
		result = 4;
	}
	else if (num >= 87 && num <= 89) {
		result = 5;
	}
	else if (num >= 77 && num <= 79) {
		result = 6;
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
	case 4:
		System.out.println("A+");
		break;
	case 5:
		System.out.println("B+");
		break;
	case 6:
		System.out.println("C+");
		break;
	default:
		System.out.println("오류입니다.");
		break;
		}
	}
}

