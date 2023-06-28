import java.util.*;
public class »¼°j {

	public static int fib1(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib1(n-1)+fib1(n-2);
	}
	public static int fib2(int n) {
		int a=0 ,b=1 ,c=0;
		for (int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println(fib2(45));
		System.out.println(fib1(45));
	}

}
