import java.util.*;
public class �~��� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�п�J�褸�~��:");
		int y = in.nextInt();
		int m = in.nextInt();
		int d = 30;
		switch (y % 4 ) {
		case 0:
			if (m==2) 
				System.out.println("�褸"+y+"�~"+m+"�릳"+(d-1)+"��");
		default :
			if (m==2) 
				System.out.println("�褸"+y+"�~"+m+"�릳"+(d-2)+"��");
			else if ((m==4)||(m==6)||(m==9)||(m==11))
				System.out.println("�褸"+y+"�~"+m+"�릳"+d+"��");
			else
				System.out.println("�褸"+y+"�~"+m+"�릳"+(d+1)+"��");
			}
		
		}
			


	}

