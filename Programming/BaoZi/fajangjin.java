package com.Programming.BaoZi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class fajangjin {
	public static void main(String[] args) {
		System.out.println("请输入利润总和：");
		Scanner scanner = new Scanner(System.in);
		double profit = scanner.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		double bonus = 0;
		if (profit <= 10) {
			bonus = profit * 0.1;
		} else if (profit <= 20) {
			bonus = (profit - 10) * 0.075 + 10 * 0.1;
		} else if (profit <= 40) {
			bonus = (profit - 20) * 0.05 + 10 * 0.1 + 10 * 0.075;
		} else if (profit <= 60) {
			bonus = (profit - 40) * 0.03 + 20 * 0.05 + 10 * 0.1 + 10 * 0.075;
		} else if (profit <= 100) {
			bonus = (profit-60)*0.015 + 20*0.03 + 20*0.05 +10*0.1 + 10*0.075;
		}else {
			bonus = (profit-100)*0.01 + 40*0.015 + 20*0.03 + 20*0.05 + 10*0.075 + 10*01;
		}
		System.out.println("应该发放的奖金为：" + df.format(bonus));
		System.out.println(String.format("%.2f", bonus));
		scanner.close();
	}
}
