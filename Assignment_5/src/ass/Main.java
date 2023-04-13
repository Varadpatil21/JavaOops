package ass;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Shape S;
		Rectangle R=new Rectangle();
		Triangle T=new Triangle();
		S=R;
		S.input();
		S.compute_area();
		S=T;
		S.input();
		S.compute_area();	
	}

}

abstract class Shape{
	double v1,v2;
	abstract public void compute_area();
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter first dimension:");
		v1=sc.nextDouble();
		System.out.println("Enter second dimension:");
		v2=sc.nextDouble();	
	}
}

class Rectangle extends Shape{
	public void compute_area() {
		System.out.println("Area of rectangle is "+(v1*v2));
	}
}

class Triangle extends Shape{
	public void compute_area() {
		System.out.println("Area of triangle is "+(0.5*v1*v2));
	}
}
