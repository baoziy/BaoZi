
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = new int[]{6,3,2,8,9,1};
		new BubbleSort().bubbleSort(a);
	}

	public void bubbleSort(int[] a) {
		/**
		 * 外层循环控制循环的次数
		 * 内层循环控制每一次的循环中需要比较的次数
		 */
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				/**
				 * 这是循环中关键的部分，当前一个元素比后一个元素大的时候调换位置，这样每一次比较都会把较大的
				 * 元素放到后边
				 */
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			/**
			 * 每循环一次打印一下当前的序列
			 */
			print(a, i);
		}
	}
	private void print(int[] a,int i){
		System.out.println("第"+(i+1)+"次：");
		for(int j=0;j<a.length;j++){
			System.out.print("  " + a[j]);
		}
		System.out.println();
	}
}
