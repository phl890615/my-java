import java.util.Scanner;
public class �׷��K�X {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Min = 0,num,answer = 0;
		int Max = 100;
		num = (int)(Math.random()*101);
		System.out.print("��J1~100:");
		while(true) {
			answer = in.nextInt();
			if (answer > Min && answer < Max){
				if (answer > num) {
					System.out.print("��J"+Min+"~"+answer+":");
			   		Max = answer;
				}else if (answer < num) {
			   		System.out.print("��J"+answer+"~"+Max+":");
					Min = answer;
			   	}else{
			    	System.out.print("���߲q��F");
			    	break;
			   	}
			}else {
				System.out.println("�W�X�d��F");
				System.out.println("�Э��s��J");
			}
	
		}
	}
	
}
