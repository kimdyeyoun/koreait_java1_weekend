package com.kita.first.level2.practice;

public class Practice04 {
	public static void main(String[] args) {
		// 삼각형 별 찍기
		//*
		//**
		//***
		//****
		for (int i = 1; i <= 4; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
