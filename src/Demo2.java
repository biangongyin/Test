/**
 * 求出最大的连续的元素和或者数组最长的公共子串
 * @author Administrator
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {2, -3, 4, 5, -2, -3, 1, 2, -1};
		
		int sum = 0;
		int left = 0;
		int leftMax = 0;
		int rigthMax = 0;
		int maxSum = 0;
		
		for (int i=0;i<array.length;i++) {
			if (sum < 0) {
				sum = array[i];
				left = i;
			} else {
				sum = sum + array[i];
			}
			
			if (sum > maxSum) {
				leftMax = left;
				rigthMax = i;
				maxSum = sum;
			}
		}
		
		System.out.println("leftMax:" + leftMax + ",rigthMax:" + rigthMax);
		
		int totalSum = 0;
		for (int j=0;j<array.length;j++) {
			if (j >= leftMax && j <= rigthMax) {
				totalSum += array[j];
			}
		}
		System.out.println("连续最大的值:totalSum= " + totalSum);
	}

}
