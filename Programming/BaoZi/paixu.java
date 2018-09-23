package com.Programming.BaoZi;

import java.util.Scanner;
/**
 * 题目：输入三个整数，请把这三个数由小到大输出出来。
 * @author Baozi
 *
 */
public class paixu {
	public static void main(String[] args) {
		System.out.println("请输入三个数字：");
		Scanner scanner  =  new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		if(first > second){
			int temp = first;
			first = second;
			second= temp;
		}
		if(first>third){
			int temp = first;
			first = third;
			third= temp;
		}
		if(second> third){
			int temp = second;
			second = third;
			third= temp;
		}
		System.out.println("从小到大的顺序是：" + first + "  " +  second+ "  " + third);
		scanner.close();
	}
}
