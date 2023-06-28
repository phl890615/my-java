
public class 亂數 {

	public static void main(String[] args) {
		int a,b,c= 0;
		do {
			a = (int)(Math.random()*6);
			b = (int)(Math.random()*6);
			c = (int)(Math.random()*6);
			System.out.print(a+" "+b+" "+c);
			System.out.println();
		}while(a!=b && a!=c && b!=c);

	}

}
