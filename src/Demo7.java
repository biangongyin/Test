import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数
 * @author Administrator
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("输入第一个整数：");
	        int a = sc.nextInt();
	        System.out.println("输入第二个整数：");
	        int b = sc.nextInt();
	        int first = a;
	        int second = b;
	        System.out.println("a=" + a + ";b=" + b);
	        int temp;
	        
	        if (a < b) {
	            temp = a;
	            a = b;
	            b = temp;
	        }
	        while (b != 0) {
	                temp = a % b;
	                a = b;
	                b = temp;
	            }
	            System.out.println("最大公约数为"+a);
	            System.out.println("最小公倍数为"+first*second/a);
	        }

}
