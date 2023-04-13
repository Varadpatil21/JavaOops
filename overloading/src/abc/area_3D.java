package abc;
import java.util.*;
public class area_3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,y=1;
		double s,l,b,h,r,t;
		do {
			System.out.println("-------Total Surface Area------\n1. Cube\n2. Cuboid\n3. Cylinder");
			System.out.print("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter side of Cube:");
				s=sc.nextDouble();
				area3(s);
			case 2:
				System.out.print("Enter length of Cuboid:");
				s=sc.nextDouble();
				System.out.print("Enter breadth of Cuboid:");
				s=sc.nextDouble();
				System.out.print("Enter height of Cuboid:");
				s=sc.nextDouble();
				
				
				
			}
			
		}while(y==1);
		
		
	}
	static void area3(double l)
	{
		System.out.println("TSA of Cube :"+6*l);
	}
	static void area3(double l,double b,double h)
	{
		System.out.println("TSA of Cuboid :"+2*(l*b+b*h+h*l));
	}
	static void area3(double r,double h)
	{
		System.out.println("TSA of Cylinder :"+2*3.14*r*(r+h));
	}

}
