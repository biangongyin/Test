/**
 * 有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大  　　　　两岁。最后问第一个人，他说是10岁。请问第五个人多大？ 
 * @author Administrator
 *
 */
public class Demo10 {

	public static int getAge(int num){
		if (num == 1) {
			return 10;
		} else {
			return getAge(num-1) + 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		System.out.println(getAge(num));
	}

}
