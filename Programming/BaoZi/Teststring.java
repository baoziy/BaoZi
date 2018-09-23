package com.Programming.BaoZi;

import java.util.Scanner;

public class Teststring {
	public static void main(String[] args) {
		int num = 0; // 数字的个数
		int letter = 0;// 字符的个数
		int space = 0;// 空格的个数
		int others = 0;// 其他字符的个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String string = scanner.nextLine();
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 48 && charArray[i] <= 57) {
				num++;
			}else if(charArray[i]>=65&&charArray[i]<=90){
				letter++;
			}else if(charArray[i]>=97&&charArray[i]<=122){
				letter++;
			}else if(charArray[i]==32){
				space++;
			}else{
				others++;
			}			
		}
		System.out.println("数字：" + num + "个");
		System.out.println("字符：" + letter + "个");
		System.out.println("空格：" + space + "个");
		System.out.println("其他字符：" + others + "个");
		scanner.close();
	}
}
