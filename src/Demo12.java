/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 1.程序分析：请抓住分子与分母的变化规律。
 * @author Administrator
 *
 */
public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[20];
		int[] array2 = new int[20];
		array1[0] = 2;
		array1[1] = 3;
		array2[0] = 1;
		array2[1] = 2;
		double sum = 0;
		for (int i = 2;i < 20; i++) {
			array1[i] = array1[i-1] + array1[i-2];
		}
		
		for (int j = 2;j < 20; j++) {
			array2[j] = array2[j-1] + array2[j-2];
		}
		
		for (int n = 0;n < 20; n++) {
			sum += array1[n]/array2[n];
		}
		
		System.out.println("相加总和：sum:" + sum);
	}

}
