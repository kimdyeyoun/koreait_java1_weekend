package com.kita.first.level2;

public class ForEach {
		public static void main(String[] args) {
			int[] arr = {34, 67, 2, 11, 6,90};
			//arr 안의 값들 순차적으로 출력
			for (int i = 0; i < arr.length; i++) {
				int val = arr[i];
				System.out.print(arr[i] +", ");
			}
			System.out.println();
			for (int val : arr) {
				System.out.print(val + ", ");
			}
			// foreach문 사용해서 배열 안의 값 출력
			for(int val : arr) {
				System.out.print(val+ ", ");
			}
		}
}
