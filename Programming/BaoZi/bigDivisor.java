package com.Programming.BaoZi;

import java.util.Scanner;

public class bigDivisor {
	public static void main(String[] args) {
		int bigDivisor;//定义的最大公约数
		int multiple;//定义最小公倍数
		System.out.println("请输入两个整数：");
		Scanner scanner = new Scanner(System.in);
		int in1 = scanner.nextInt();
		int in2= scanner.nextInt();
		int temp = 1;
		//这样的交换保证了第一个数绝对大于第二个数
		if(in2> in1){
			int temp1 = in1;
			in1 = in2;
			in2 = temp1;
		}
		while(temp !=0){
			temp = in1%in2;
			in1= in2;
			in2= temp;
		}
		bigDivisor = in1;
		multiple = (in1*in2)/bigDivisor;
		System.out.println("最大公约数为：" + bigDivisor);
		System.out.println("最小公倍数为：" + multiple);
		scanner.close();
		
	}
}
