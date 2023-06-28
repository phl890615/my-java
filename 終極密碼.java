import java.util.Scanner;
public class 終極密碼 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Min = 0,num,answer = 0;
		int Max = 100;
		num = (int)(Math.random()*101);
		System.out.print("輸入1~100:");
		while(true) {
			answer = in.nextInt();
			if (answer > Min && answer < Max){
				if (answer > num) {
					System.out.print("輸入"+Min+"~"+answer+":");
			   		Max = answer;
				}else if (answer < num) {
			   		System.out.print("輸入"+answer+"~"+Max+":");
					Min = answer;
			   	}else{
			    	System.out.print("恭喜猜對了");
			    	break;
			   	}
			}else {
				System.out.println("超出範圍了");
				System.out.println("請重新輸入");
			}
	
		}
	}
	
}
