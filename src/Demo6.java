
/**
 * 两个有序数组的合并
 * @author Administrator
 *
 */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = {3,5,6,7,8};
		int[] secArray = {1,2,4,9};
		
		int[] totalArray = new int[firstArray.length + secArray.length];
		int i,j,temp;
		
		for (i = 0; i < firstArray.length; i++) {
			totalArray[i] = firstArray[i];
		}
		
		for (j = 0;j < secArray.length; j++,i++) {
			totalArray[i] = secArray[j];
		}
		
		for (int n = 0;n < totalArray.length;n++) {
			for (int m = n + 1;m < totalArray.length; m++) {
				if (totalArray[n] > totalArray[m]) {
					temp = totalArray[n];
					totalArray[n] = totalArray[m];
					totalArray[m] = temp;
				}
			}
		}
		
		for (int k = 0; k < totalArray.length; k++) {
			System.out.println(totalArray[k]);
		}
	}

}
