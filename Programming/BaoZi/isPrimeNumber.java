package com.Programming.BaoZi;

import java.util.Scanner;

public class isPrimeNumber {
	public static void main(String[] args) {
		System.out.println("请分别输入其实数字和终止数字：");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int last = scanner.nextInt();
		int count = 0;
		for (int i = first; i < last; i++) {
			if (isPrimeNumber.is_Prime_Number(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("一共有" + count + "个素数。");
		scanner.close();
	}

	public static boolean is_Prime_Number(int i) {
		for (int j = 2; j < Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
