import java.util.Scanner;

/**
 * 一个数组，随意输入一个元素，以获取数组下角标。
 * @author dell
 *
 */
public class TestDemo1 {

	public static int isHasElementOne(int[] arr,int value){
		for(int i = 0,vlen = arr.length; i < vlen; i++){
			if(arr[i] == value){
				return i;
			}
		}
		return -1;
	}
	//实现二：
	public static int isHasElementTwo(int[] arr,int value){
	    String str = arr.toString();
		int index = str.indexOf(value);
		if(index >= 0){
		   return index;
		}else{
			return -1;//不存在此项
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] array = {1,2,3,6,5,4};
		System.out.println(isHasElementOne(array,num));
	}

}
