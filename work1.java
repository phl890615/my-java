import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c =scanner.nextInt();
		double d =Math.abs(Math.sqrt((b*b)-(4*a*c)));
		double x1=((-b)+(d))/(2*a);
		double x2=((-b)-(d))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
	}

}
