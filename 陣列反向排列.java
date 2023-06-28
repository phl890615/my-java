
public class °}¦C¤Ï¦V±Æ¦C {

	public static void main(String[] args) {
		int a[] = {62,7,12,3,8,47};
		int t = 0;
		for (int i=0;i<a.length/2;i++) {
			t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
