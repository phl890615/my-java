import java.util.*;
public class �G���}�C {

	public static void main(String[] args) {
		int a[][] =new int [4][5];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a[i][j] = (int)(Math.random()*100)+1;
			}
		}for (int i=0;i<a.length;i++) 
			System.out.println(Arrays.toString(a[i]));
		//1.���
		
		for (int i=0;i<a.length;i++) {
			int max = 0;
			for (int j=0;j<a[i].length;j++)
			if (a[i][j]>max)
				max = a[i][j];
			System.out.println("��"+i+"�C�̤j��:"+ max+" ");
		//2.�C�C�̤j��	
			
		}for (int i=0;i<5;i++) {
			System.out.print("��"+i+"��p��60���Ӽ�:");
			for (int j=0;j<4;j++) {
				if (a[j][i]<60) 
			System.out.print(+a[j][i]+" ");	
			}System.out.println();
		}
		//3.�C�@��p��60���Ӽ�
	}
}
