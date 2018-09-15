import java.util.Arrays;

/**
 * 快速排序的思想还是比较简单的，简单一点说就是：
 *  ：在待排序的数列中指定一个称为基准数，通过一趟排序就能把这个基准数的最终位置确定下来
 *  ： 其中基准数的左边的数都比这个基准数小，基准数右边的数都比这个基准数要大
 * 大致的算法过程就是：
 *  1，定义i=0，j=A.lenght-1，i为第一个数的下标，j为最后一个数下标
 *  2，从数组的最后一个数Aj从右往左找，找到第一小于key的数，记为Aj；
 *  3，从数组的第一个数Ai 从左往右找，找到第一个大于key的数，记为Ai；
 *  4，交换Ai 和Aj 
 *  5，重复这个过程，直到 i=j
 *  6，调整key的位置，把A[i] 和key交换
 * @author Baozi
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int[] a = new int[]{5,2,8,9,2,3,4,9};
		System.out.println(Arrays.toString(a));
		qiuckSort(a);
		System.out.println("下边是排序后的结果：");		
		System.out.println(Arrays.toString(a));
	}
	
	public static void qiuckSort(int[] a){
		if(a.length > 0){
			quicksort(a, 0, a.length-1);
		}
	}
	
	private static void quicksort(int[] a,int low,int high){
		/**
		 * 只能是当low比higth小的时候才能满足条件执行下边的代码，
		 * 所以这里需要进行一个验证
		 */
		if(low > high){
			return;
		}
		/**
		 * 指定i 和 j的值分别是待排序表的第一个元素和最后一个元素
		 */
		int i = low;
		int j = high;
		
		int Key = a[low];
		while(i < j){
			//从右向左逐个比较找到第一个小于Key的数
			while(i<j && a[j]> Key){
				j--;
			}
			//从左向右逐个比较找到第一个大于Key的数
			while(i<j && a[i]<= Key){
				i++;
			}
			if(i<j){
				int temp = a[i];
				a[i]= a[j];
				a[j] = temp;
			}
		}
		int p = a[i];
		a[i] = a[low];
		a[low] = p;
		quicksort(a, low, i-1);
		quicksort(a, i+1, high);
	}
	
}
