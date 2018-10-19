package com.LeetCode.com;

public class differentNumber {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,2,2,2,3,4,4,5,6,6};
		int[] b = new int[]{5,5,5,6,7,7,7,7,9,9,9,9,9};
		System.out.println(differentNumber.different_Number(a));
		System.out.println(differentNumber.different_Number(b));
	}

	public static int different_Number(int[] nums) {
		int number = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[number]) {
				number++;
				nums[number] = nums[i];
			}
		}

		return number + 1;
	}
}
