package com.LeetCode.com;
/**
 * 题目：给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 * 		返回其最大和。
 * 思路：这其实就是一个动态规划的问题。
 * 步骤：1、令dp[i]表示以A[i]作为末尾的连续序列的最大和（这里的A[i]必须作为连续序列的末尾）
 *      2、作如下的考虑：因为dp[i]要求必须是以A[i]作为结尾的连续子序列，那么只会出现两种情况：
 *        这个最大和的连续子序列只有一个元素，即以A[i]开始，也是以A[i]结束
 *        这个最大和的连续子序列包含有多个元素，即从前面的某处A[p](p<i),一直到A[i]结尾。
 *      3、针对第一种情况，最大和就是它本身；针对第二种情况，最大和就是dp[i-1]+A[i]
 *      4、于是得到状态转移方程：dp[i] = max{A[i],dp[i-1]+A[i]}
 *      5、这个式子只和 i 与 i 之前的元素有关，且边界为 dp[0] = A[0]，由此从小到大枚举 i，
 *         即可得到整个 dp 数组。接着输出 dp[0]，dp[1]，...，dp[n-1] 中的最大子即为最大连续
 *         子序列的和。
 * @author BaoZi
 *
 */
public class Solution_maxSubArray {
	public static void main(String[] args) {
		int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1 = new int[]{1,2,3,4,5};
		System.out.println(Solution_maxSubArray.maxSubArray(nums));
		System.out.println(Solution_maxSubArray.maxSubArray(nums1));
	}
	public static int maxSubArray(int[] nums){
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for(int i= 1;i<nums.length;i++){
			dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
		}
		int k = dp[0];
		for(int i=1;i<dp.length;i++){
			if(k<dp[i]){
				k=dp[i];
			}
		}
		return k;
	}
}
