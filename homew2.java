import java.util.Arrays;
public class homew2 {
public static void range(int a) {
	int d[]=new int[a];
	for (int i=0;i<d.length;i++) {
		d[i]=i;
	}System.out.println(Arrays.toString(d));
}public static void range(int x,int y) {
	int d[]=new int[y-x];
	for (int i=0;i<d.length;i++,x++) {
		d[i]=x;	
	}System.out.println(Arrays.toString(d));
}public static void range(int x,int y,int z) {
	int d[]=new int[Math.round(y/z)];
	for (int i=0;i<d.length;i++,x+=z) {
		d[i]=x;}
	System.out.println(Arrays.toString(d));
}
	public static void main(String[] args) {
		range(10);
		range(1,8);
		range(1,10,2);
	}

}
