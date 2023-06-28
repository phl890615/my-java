import java.util.ArrayList;

public class 每一個字的出現頻率 {

	public static void main(String[] args) {
		String s = "I have a pen. I have an apple, Apple pen. I have a pen. I have pineapple. pineapple pen, Apple pen, Pineapple pen, Pen pineapple, apple pen.";
		s = s.replace(".", "");
		s = s.replace(",", "");
		s = s.toLowerCase();
		String t[] = s.split(" ");
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<Integer> c = new ArrayList<Integer>();   
		int b;
			for (int i=0;i<t.length;i++) {
				if (!a.contains(t[i])) {
					a.add(t[i]);
					int n=a.indexOf(t[i]);
					c.add(n,1);}
									
				else {
					int n=a.indexOf(t[i]);
					int x=c.get(n)+1;
					c.remove(n);
					c.add(n,x);
				
		}
		}System.out.println(a);
		System.out.print(c);
		
	}

}
