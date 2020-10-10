import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 1.程序分析：利用while语句,条件为输入的字符不为'\n'.
 * @author Administrator
 *
 */
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stringCount = 0;
		int intCount = 0;
		int spaceCount = 0;
		int otherCount = 0;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("输入的String字符串：" + str);
		char[] ch = str.toCharArray();
		for (int i = 0;i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				intCount++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaceCount++;
			} else if (Character.isLetter(ch[i])) {
				stringCount++;
			} else {
				otherCount++;
			}
		}
		
		System.out.println("字母个数"+stringCount);
        System.out.println("数字个数"+intCount);
        System.out.println("空格个数"+spaceCount);
        System.out.println("其他字符个数"+otherCount);
	}

}
