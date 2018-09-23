package com.Programming.BaoZi;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		System.out.print("请输入一个你要分解的正整数：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();// 获取输入的数字
		System.out.println();
		System.out.print(input + "=");
		for (int i = 2; i <= input; i++) {
			while (input % i == 0 && input != i) {
				input = input / i;
				System.out.print(i + "*");
			}
			if (input == i) {// 上面的都不能整除，说明这是一个质数
				System.out.print(i);
				break;
			}
		}
		scanner.close();
	}
}
