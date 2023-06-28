
public class 多型矩形圓形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[] = new Shape[5];
		s[0] = new Rectangle(4,5);
		s[1] = new Rectangle(6,4);
		s[2] = new Rectangle(8,5);
		s[3] = new Circle(6);
		s[4] = new Circle(5);
		double sum = 0;
		for (int i=0;i<5;i++) 
			sum += s[i].area();
		System.out.println(sum);
		
	}

}
	abstract class Shape {
		
		abstract double area(); 
		}
	class Rectangle extends Shape{
		private int length,width;
		public Rectangle(int width,int length) {
			this.length = length;
			this.width = width;
		}double area(){
			return length*width;
		}
	}
	class Circle extends Shape{
		private int radius;
		public Circle(int radius) {
			this.radius = radius;
		}double area(){
			return radius*radius*(3.14);
			
		}
	}