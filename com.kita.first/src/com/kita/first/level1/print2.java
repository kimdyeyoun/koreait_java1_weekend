package com.kita.first.level1;

public class print2 {
	public static void main(String[] args) {
		String name = "김대용";
		int age = 345;
		
		
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "세입니다.");
		//System.out.printf("문자열 형식",변수. 변수2,...);
		System.out.printf("제 이름은 %s이고 나이는 %d세입니다.\n",name,age);
		
		double grade = 3.33333333333;
		System.out.printf("제 학점은 평균 %.2f입니다.\n",grade);
	}

}
