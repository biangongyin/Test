/**
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一 
　　　　个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中 
　　　　，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * @author Administrator
 *
 */
public class Demo11 {

	public static int getNum(int m){
		if (m < 5) {
			return getNum(m+1) * 5 +1;
		} else {
			return 1;//每只猴子最少一个只一个桃子
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//假设第五只猴子来分，正好一只分一个，扔掉一个，总共是6.
		//gtNum(1)*5+1 = (getNum(2)*5+1)*5 + 1 = ((getNum(2)*5+1)*5 + 1) * 5+1=.....
		//getNum(5) = 1;
		System.out.println(getNum(0));
	}

}
