package com.Programming.BaoZi;


/**
 * 有1、2、3、4个数字，能组成多少个互不相同其无重复数字的三位数？都是多少?
 * 
 * @author Baozi
 *
 */
public class SortQuestion {
	public static void main(String[] args) {
		int sum = 0;
		for (int bite = 1; bite <= 4; bite++) {
			for (int ten = 1; ten <= 4; ten++) {
				for (int hundred = 1; hundred <= 4; hundred++) {
					if(bite!= ten&&bite!=hundred&&ten!=hundred){
						System.out.print(hundred*100+ten*10 +bite + "  ");
						sum ++;
						if(sum%10==0){
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("\n总共有：" +sum+ "个互不相同且不重复的三位数！");
	}
}
