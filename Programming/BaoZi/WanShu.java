package com.Programming.BaoZi;

public class WanShu {
	public static void main(String[] args) {
		System.out.println("1000之内的完数有：");
		for(int i= 1;i< 1000;i++){
			int sum = 0;
			for(int j=1;j<=(i/2+1);j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}
}
