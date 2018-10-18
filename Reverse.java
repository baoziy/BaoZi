package com.LeetCode.com;

import java.util.Scanner;
/**
 * 题目：给定一个32位之内的整数，将整数中的数字进行反转
 * 思路：1、首先要判断这个整数的正负性，无论正负都将其抓换位无符号整数
 *      2、将无符号整数转换为字符数组的形式
 *      3、然后使用前后相对应位置互换的形式进行调换位置，具体方法就是使用for循环，第一个位
 *         置的字符和最后一个位置的字符进行调换，以此类推
 *      4、调换之后在将字符数组转换为整数类型
 *      5、这里需要进行异常的处理，因为规定是32位整数，如果位数超出，就让它return 0
 *      6、在主方法中进行调用就可以了
 * @author Baozi
 *
 */
public class Reverse {
	public static void main(String[] args) {
		Reverse  reverse1 = new Reverse();
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		 System.out.println(reverse1.reverse(a));
		 scanner.close();
	}

	public int reverse(int x) {
		int abcX = 0;
		if(x<0){
			//如果是负数，将其转换成无符号的整数
			abcX = Math.abs(x);
		}else {
			abcX = x;
		}
		int result = 0;
		//先转换成字符数组
		char[] xchar =  String.valueOf(abcX).toCharArray();
		char temp;
		for(int i=0;i<xchar.length/2;i++){
			temp=xchar[i];
			xchar[i]= xchar[xchar.length-1-i];
			xchar[xchar.length-1-i] = temp;
		}
		try{
			result = Integer.parseInt(String.valueOf(xchar));
		}catch(Exception exception){
			return 0 ;
		}
		if(x<0){
			result = (-1)*result;
			return result;
		}else {
			return result;
		}
	}
}
