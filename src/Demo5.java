
/**
 * 斐波那契数列求值
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 * @author Administrator
 *
 */
public class Demo5 {

	//递归算法
	public static int fib(int month){
		if (month == 1 || month == 2) {
			return 1;
		} else {
			return fib(month - 1) + fib(month - 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("第一种算法：：");
		//1、递归算法
		int n = 15;
		for (int i=1;i <= n; i++) {
			System.out.println("第" + i + "个月，兔子的数量：" + fib(i));
		}
		
		System.out.println("第二种算法：：");
		//2、普通算法
		int f1 =1 ,f2 = 1;
		int f;
		for(int i=3;i<=n;i++){
            f=f1+f2;
            f1=f2;
            f2=f;
            System.out.println("第"+i+"个月的兔子对数："+f2);
        }
	}

}
