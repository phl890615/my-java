import java.util.*;
public class �j�� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�п�J��r�հհ�!");
		String a1 = in.nextLine();
		String a2 ="";
		for (int i=a1.length();i>0;i--) {
			char t = a1.charAt(i-1);
			a2 = a2 + t;
		}
		if (a1.equals(a2))
			System.out.println("�O�j��");
		else
			System.out.println("���O�j��");

	}

}
