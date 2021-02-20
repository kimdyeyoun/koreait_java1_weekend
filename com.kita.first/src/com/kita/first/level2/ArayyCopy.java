package com.kita.first.level2;

public class ArayyCopy {
	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = arr1;
		// {0, 2, 3, 4}
//		arr2[0] = 0;
//		System.out.println(arr1[0]);
		int[] arr3 = new int[arr1.length];
		// {0, 0, 0, 0}
		for (int i = 0; i < arr1.length; i++) {
			
		}
		System.out.println(arr2[2]);
	}
}
