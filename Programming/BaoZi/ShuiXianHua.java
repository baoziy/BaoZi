package com.Programming.BaoZi;
/**
 * 打印输出水仙花
 */
import java.util.Scanner;

public class ShuiXianHua {
	public static void main(String[] args) {
		System.out.println("请输入要打印的水仙花的指定范围：");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int last = scanner.nextInt();
		for(int i= first;i<last;i++){
			if(ShuiXianHua.isFlower(i)){
				System.out.println(i);
			}
		}
		scanner.close();
	}
	public static boolean isFlower(int isflower){
		int bite= isflower%10;
		int ten= (isflower/10)%10;
		int hundred=isflower/100;
		if(isflower==(bite*bite*bite)+(ten*ten*ten)+(hundred*hundred*hundred)){
			return true;
		}else{
			return false;
		}
		
	} 
}
