package com.LeetCode.com;
/**
 * 题目：给定一个数组和一个值，需要原地移除这个数组中所有等于这个数值的元素，返回移除后新数组的长度。
 * 注意：不能使用额外的数组空间，元素的顺序可以改变。
 * 思路：1、在一个方法中定义一个局部变量，把待判断数组的长度赋值给它
 *      2、使用for循环的方法，如果当前位置的元素和给定值相等的话，就从当前位置开始进行一个for
 *         循环把后一位的元素往前移一位，相当于覆盖掉当前的元素
 *      3、如果第二层嵌套的循环执行的话，意味着找到一个和给定值相等的元素，那么局部变量的值就要相应减一
 * @author Baozi
 *
 */
public class Solution_removeElement {
	public static void main(String[] args) {
		System.out.println("移除元素的算法：");
		int[] re = new int[]{0,1,2,3,0,4,2};
		System.out.println("处理的结果为："+Solution_removeElement.removeElement(re, 2));
	}
	public static  int removeElement(int[] nums,int val){
		int count=nums.length;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				for(int j=i;j<nums.length-1;j++){
					nums[j]=nums[j+1];
				}
				count--;
			}
		}
		return count;
	}
}
