import java.util.*;
public class ArrayList¤j¼Ö³z {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		while (a.size()<6) {
		int x = (int) (Math.random()*49+1);
		if (!a.contains(x))
			a.add(x);
		}
		Collections.sort(a);
		System.out.println(a);
	}

}
