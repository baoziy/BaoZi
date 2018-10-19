package com.LeetCode.com;

import java.util.Scanner;
/**
 * 题目：判断一个整数是不是一个回文数字。这里边时要考虑正负号的
 * 思路：1、首先把一个整数（无论正负）转换成一个字符数组的形式；
 *      2、使用for循环的方法判断首尾对应位置上的字符是否一样，如果比较中间有不一样会直接跳出循环
 *      3、通过定义的一个局部变量每比较成功一次自增加一的方法判断循环进行的次数从而知道是不是回文数字
 *      4、比较这个局部变量的值是不是个比较的次数一致，只有一致的情况下才是回文数字
 * @author Baozi
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int scannerIn = scanner.nextInt();
		System.out.println(Palindrome.isPalindrome(scannerIn));
		scanner.close();
	}

	public static boolean isPalindrome(int nums) {
		int xboolean = 0;
		char[] xchar = String.valueOf(nums).toCharArray();
		for (int i = 0; i < xchar.length / 2; i++) {
			if (xchar[i] != xchar[xchar.length - 1 - i]) {
				break;
			} else {
				xboolean++;
			}
		}
		if (xboolean == xchar.length / 2) {
			return true;
		} else {
			return false;
		}
	}
}
