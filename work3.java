import java.util.*;
public class work3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c =scanner.nextInt();
		if  ((a<b)|(b<c)) {
			if (a<b) {
				if (c>b) {
					System.out.println(a+","+b+","+c);
				}
				else {
					if(a>c) {
						System.out.println(c+","+a+","+b);
					}
					else {
						System.out.println(a+","+c+","+b);
					}
				}
			}
			else {
				if (c<b) {
					System.out.println(c+","+b+","+a);
				}
				else {
					if (a>c) {
						System.out.println(b+","+c+","+a);
					}
					else {
						System.out.println(b+","+a+","+c);
					}
				}
			}
		}
		else {
			System.out.println(c+","+b+","+a);
		}
			
	}

}

