import java.util.Scanner;
public class while無窮迴圈 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int t = 0;
		while(true) {
			System.out.print("輸入一數：");
			int a = in.nextInt();
			if (a==-1) break;
			sum +=a;
			t++;	
		}
		System.out.println("個數："+t);
		System.out.println("總和："+sum);
	}

}
