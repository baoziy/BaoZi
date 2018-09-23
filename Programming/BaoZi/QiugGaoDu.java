package com.Programming.BaoZi;

import java.util.Scanner;
/**
 * 题目：求小球下落的高度，在h米的高度自由落下，每次落地后又跳回到原高度的一半，在落下来
 * 求在它第n次落地的时候共经过多少米?第n次反弹的高度是多少？
 * @author Baozi
 *
 */
public class QiugGaoDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入小球是从H高的地方落下来的:");
		double h = scanner.nextDouble();
		System.out.println("请输入要求第几次落地时走过的路程:");
		// 表示落地的次数
		int cishu = scanner.nextInt();
		double path = 0;// 表示的是小球经过的路程
		if (cishu == 1) {
			System.out.println("在它第1次落地的时候共经过" + h + "米！");
			path = h;
		} else {
			path = h;
			for (int i = 2; i <= cishu; i++) {
				double temp = (h * Math.pow(0.5, i - 1)) * 2;
				System.out.println("第" + i + "次反弹的高度为:" + (temp / 2));
				path = path + temp;
			}
			System.out.println("在它第" + cishu + "次落地的时候，共经过" + path + "米。");
		}
		scanner.close();

	}
}
