package com.baozi.Sort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] array={22, 18, 36, -20, 93, 6, -1, 17, 9, 69, 38};
		System.out.println("排序前的元素序列为：");
		System.out.println(Arrays.toString(array));
		System.out.println("排序后的元素序列为：");
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectSort(int[] array) {
		// 外层循环控制每次选择一个最小的元素
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			//将这一趟遍历得到的最小的元素索引位置和当前的元素位置i交换
			if(minIndex!=i){
				int temp = array[minIndex];
				array[minIndex]= array[i];
				array[i] = temp;
			}
		}
	}
}
