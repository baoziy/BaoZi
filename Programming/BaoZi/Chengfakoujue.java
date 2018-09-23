package com.Programming.BaoZi;
/**
 * 输出9*9乘法口诀
 * @author Baozi
 *
 */
public class Chengfakoujue {
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i +"*" + j  +"=" + i*j + "   ");
			}
			System.out.println();
		}
	}
}
