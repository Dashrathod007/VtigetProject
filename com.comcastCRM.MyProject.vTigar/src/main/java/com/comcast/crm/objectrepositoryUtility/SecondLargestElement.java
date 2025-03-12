package com.comcast.crm.objectrepositoryUtility;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 7, 8 };
		int smax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax && arr[i] != max) {
				smax = arr[i];

			}
		}

		System.out.println(smax);

	}

}
