
public class InsertSort {
	public static void main(String[] args) {
		int[] a = new int[] { 9, 3, 4, 2, 1, 10, 5, 6, 7, 8 };
		new InsertSort().insertSort(a);
	}

	/**
	 * 直接插入排序算法的实现方法
	 */
	public void insertSort(int[] a) {
		System.out.println("-------直接插入排序算法--------");
		int length = a.length;
		int i, j;
		for (i = 1; i < length; i++) {
			/**
			 * 把每次待插入到有序序列的元素用一个临时变量保存
			 */
			int temp = a[i];
			for (j = i - 1; j >= 0 && a[j] > temp; j--) {
				a[j + 1] = a[j];
			}
			/**
			 * 因为是第j个元素不满足的情况下才会跳出循环，所以a[j]<temp,理所当然的要把带插入元素放到第j+1的位置
			 */
			a[j + 1] = temp;
			/**
			 * 把每次 插入一个元素之后的序列打印输出到控制台
			 */
			print(a, length, i);
		}
	}

	/**
	 * 把序列输出到控制台
	 * 
	 * @param a
	 * @param length
	 * @param j
	 */
	public void print(int[] a, int length, int j) {
		System.out.println("第" + j + "次：");
		for (int i = 0; i < length; i++) {
			System.out.print("  " + a[i]);
		}
		System.out.println();
	}
}