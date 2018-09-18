package com.baozi.Sort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] array = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64 };
		System.out.println("原始的数组为：" +Arrays.toString(array));
		int arraylength = array.length;
		// 循环建堆，并且保证每次循环一遍都要把交换到后边的元素不能再参与建堆和交换的过程
		for (int i = 0; i < arraylength - 1; i++) {
			buildMaxHeap(array, arraylength - 1 - i);
			// 交换堆顶和最后一个元素的位置
			swap(array, 0, arraylength - 1 - i);
			//每次循环打印输出一次待排序序列
			
		}
		System.out.println("排序后的数组为："+Arrays.toString(array));
	}

	// 对data数组从0到lastindex创建大根堆
	public static void buildMaxHeap(int[] data, int lastIndex) {
		// 从lastIndex（最后一个节点）处节点的父节点开始
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// 变量k用来保存正在判断的节点
			int k = i;
			// 如果当前k节点的子节点存在的话
			while ((2 * k + 1) <= lastIndex) {
				// k节点的左子节点的索引
				int biggerIndex = 2 * k + 1;
				// 如果biggerIndex小于（没有等于）lastIndex，换言之biggerIndex+1代表的k节点的右节点存在
				if (biggerIndex < lastIndex) {
					// 如果右子节点的值比较大
					if (data[biggerIndex] < data[biggerIndex + 1]) {
						// biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				// 如果K节点的值小于其较大的子节点的值
				if (data[k] < data[biggerIndex]) {
					// 交换他们的值
					swap(data, k, biggerIndex);
					/**
					 * 将biggerIndex的值赋值给K，开始while循环的下一次循环，重新保证k节
					 * 点的值大于其左右子节点的值
					 */
					k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}

	// 交换
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
