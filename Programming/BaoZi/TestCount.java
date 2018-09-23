package com.Programming.BaoZi;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCount {
	public static void main(String[] args) {
		System.out.println("请输入数字和个数：");
		Scanner scanner = new Scanner(System.in);
		int number;// 输入的数字
		int count;// 数值的个数
		int temp;
		int Count = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		number = scanner.nextInt();
		count = scanner.nextInt();
		arrayList.add(number);
		temp = number;
		for (int i = 2; i <= count; i++) {
			temp = (int) (temp + number * Math.pow(10, i - 1));
			arrayList.add(temp);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			Count = Count + arrayList.get(i);
		}
		System.out.println("最后的和为：" + Count);
		scanner.close();
	}
}
