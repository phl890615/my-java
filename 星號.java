import java.util.*;
public class ¬P¸¹ {
	
	public static void printS() {
		for (int i=1;i<=20;i++) 
			System.out.print("*");
		System.out.println();
	}
	public static void printS(int n) {
		for (int i=1;i<=10;i++)
			System.out.print("*");
		System.out.println();
	}
	public static void printS(int n,char c) {
		for (int i=1;i<=8;i++)
			System.out.print(c);
		System.out.println();
	}
	public static void main(String[] args) {
		printS();
		printS(10);
		printS(8,'%');

	}

}
