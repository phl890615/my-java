import java.util.*;
public class 迴文 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入文字啦啦啦!");
		String a1 = in.nextLine();
		String a2 ="";
		for (int i=a1.length();i>0;i--) {
			char t = a1.charAt(i-1);
			a2 = a2 + t;
		}
		if (a1.equals(a2))
			System.out.println("是迴文");
		else
			System.out.println("不是迴文");

	}

}
