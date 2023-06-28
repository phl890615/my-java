import java.util.Scanner;
public class 繩子長度 {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
System.out.print("輸入一條繩子的長度：");
		
double a = in.nextDouble();
		
int t = 0;
		
while (a >=100 ) {
			
a = a/2;
			
t++;
		
}
		
System.out.println(t);
		
System.out.println(a);
		
	}

}
