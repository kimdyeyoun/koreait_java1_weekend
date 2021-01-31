package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("수학 응시 유형을 입력해 주세요  : (가/나) ");
	String type = scan.next();
	System.out.print("점수를 입력해 주세요 : ");
	int num = scan.nextInt();
	System.out.println("가형기준 : 60");
	System.out.println("나형기준 : 70");
	
	if ("가".equals(type) || "나".equals(type)) {System.out.printf("시험 유형은 %s형입니다.\n",type);}

	if ("가".equals(type) && num == 60) {System.out.println("평균입니다.");}
	else if ("가".equals(type) && num <  60) {System.out.println("평균 미만입니다.");}
	else if ("가".equals(type) && num >  60){System.out.println("평균 초과입니다.");}
	else if ("나".equals(type) && num == 70) {System.out.println("평균입니다.");}
	else if ("나".equals(type) && num <  70) {System.out.println("평균 미만입니다.");}
	else if ("나".equals(type) && num >  60){System.out.println("평균 초과입니다.");}
	else {System.out.println("오류");}
	scan.close();
		}
	}
	

