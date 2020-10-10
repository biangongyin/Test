
/**
 * 利用递归方法求5! 1*2*3*4*5
 * @author Administrator
 *
 */
public class Demo9 {

	public static int jieCheng(int n){
		if (n == 1) {
			return 1;
		} else {
			return jieCheng((n-1))*n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jieCheng(5));
	}

}
