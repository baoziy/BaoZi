package com.Programming.BaoZi;

import java.util.Scanner;
/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生
 * 一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 分析：其实这就是一个数列的问题，脑子的第一反应就是找出数列之间的规律，然后使用递归的办法解决。
 * @author Baozi
 *
 */
public class Sequence {
	public static void main(String[] args) {
		System.out.println("请输入你想查询的月份：");
		 @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 int month = scanner.nextInt();
		 Sequence sequence =new Sequence();
		 System.out.println("第" + month + "月的兔子总数为：" +sequence.Total(month));
	}
	public int Total(int month){
		int total;
		if(month==1||month==2){
			total=1;
			return total;
		}else{
			return Total(month-1)+Total(month-2);
		}
		
		
	}
}
