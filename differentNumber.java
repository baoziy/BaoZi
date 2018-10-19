package com.LeetCode.com;
/**
 * 题目：给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 思路：1、按照题目要求把数组中重复的元素删除掉，言外之意就是遇到相同的元素就跳过，不同的元素保留
 *      2、只有元素不相等的时候才满足要求，但此时需要把满足要求的数字元素存在表示数组新下标的位置
 * @author Baozi
 *
 */
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
