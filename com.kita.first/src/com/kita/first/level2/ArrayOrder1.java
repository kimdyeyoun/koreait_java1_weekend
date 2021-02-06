package com.kita.first.level2;

public class ArrayOrder1 {
	public static void main(String[] args) {
		//arr[0] = arr[2];
		//{2,67,2,11,6,90}
		//int temp;

		
		
//		temp = arr[0];
//		arr[0] = arr[2];//{2,67,2,11,6,90}
//		arr[2] = temp;//{2,67,34,11,6,90}
		
		//arr를 오름차순으로 순차정렬하기
		int [] arr = {34 ,67, 2, 11, 6, 90};
		int temp1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j]= temp1;
				}
			}System.out.print(arr[i] +" ");
		}
	}
}
