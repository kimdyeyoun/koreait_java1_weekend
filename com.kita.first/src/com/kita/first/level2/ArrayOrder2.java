package com.kita.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int [] arr = {34 ,67, 2, 11, 6, 90};
		int min;//가장 작은 값의 인덱스 담을 변수
		int templ;//임시 값 저장 변스
		
		//arr를 선택정렬로 정렬 후에
		// arr.length-1 : 가장 마지막 인덱스
		for (int i = 0; i < arr.length-2; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]> arr[j]) {
					min = j;
					//arr[i]값이랑 arr[z]값 비교하다가
					//arr[z]값이 더 작을 때
				}
				//temp 사용해서 값 교환
				if(min != i) {
					templ = arr[i];
					arr[i] = arr[min];
					arr[min] = templ;
				}
			}
		}
		//arr를 선택정렬로 정렬 후에 forEach문 사용해서 arr안의 값 출력
	}
}
