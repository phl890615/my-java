import java.util.*;
public class 成績以長條圖顯示 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("輸入成績個數");
		int a = in.nextInt();
		int b[] = new int[a];
		int t=0;
		for (int i=0;i<=a;i++) {
			a = (int)(Math.random()*101);
			b[i] = a;
		}for (int i=0;i<=10;i++) {
			for (int j=0;j<b.length;j++) {
				if ((b[i]>=i*10) && (b[i]<=i*10+9))
					t+=1;
		            System.out.print((i*10)+"~"+(i*10+9)+":");
			}if(t>=1)
				for (int k=0;k<t;k++) {
		        System.out.print("*");
				}t=0;
		}System.out.println();
	}
	
}
