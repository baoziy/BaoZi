package com.Programming.BaoZi;


public class CompletelySquared {
	public static void main(String[] args) {
		long stsrt = System.currentTimeMillis();
		int count = 0;
		for(int i=1;i<100000;i++){
			int num1= (int)Math.sqrt(i+100);
			int num2= (int)Math.sqrt(i+268);
			if(num1*num1==(i+100)&&num2*num2 ==(i+268)){
				System.out.println("符合条件的数有：" + i);
				count++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("程序运行时间为：" + (end-stsrt)+ "毫秒！");
		System.out.println("统计出来一共有：" + count  + "个符合条件的数！");
	}
}
