import java.util.*;
public class 年月份 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入西元年月:");
		int y = in.nextInt();
		int m = in.nextInt();
		int d = 30;
		switch (y % 4 ) {
		case 0:
			if (m==2) 
				System.out.println("西元"+y+"年"+m+"月有"+(d-1)+"天");
		default :
			if (m==2) 
				System.out.println("西元"+y+"年"+m+"月有"+(d-2)+"天");
			else if ((m==4)||(m==6)||(m==9)||(m==11))
				System.out.println("西元"+y+"年"+m+"月有"+d+"天");
			else
				System.out.println("西元"+y+"年"+m+"月有"+(d+1)+"天");
			}
		
		}
			


	}

