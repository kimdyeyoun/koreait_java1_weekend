package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice14 {
	public static void main(String[] args) {
		// 성적 배열
		int[][] arr = {{67, 49, 87},//국
		{89, 92 ,56}//수
		,{76, 39, 98}//영
		};
//		과목이름 배역
		String[] clsArr = {"국어", "수학", "영어"};
//		각 과목 성적 합계 배열
		int[] sumArr = new int[clsArr.length];
//		국어 합계 : ?, 평균 : ?
//		수학 합계 : ?, 평균 : ?
//		영어 합계 : ?, 평균 : ?
//		전체 합계 : ?, 평균 : ?
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumArr[i] += arr[i][j];
			}
		}
		for (int i = 0; i < clsArr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n",clsArr[i],sumArr[i],(float)sumArr[i]/arr[i].length);
			System.out.println();
		}
		int totalSum =0;
		int totalCnt =0;
		for (int i = 0; i < sumArr.length; i++) {
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
			
		}System.out.printf("전체 합계: %d, 평균 : %.1f",totalSum,(float)totalSum/totalCnt);
	}
}
