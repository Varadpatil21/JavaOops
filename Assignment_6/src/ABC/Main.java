package etemock;
//Design and develop a context for given case study and implement an interface for Vehicles Consider the
//example of vehicles like bicycle, car, and bike. All Vehicles have common functionalities such as Gear
//Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle,
//Bike, Car classes should be implemented for all these functionalities in their own class in their own way.
import java.util.*;
interface Vehicle{
	void gear_change(int p);
	void speed_up();
	void apply_brakes();
	void display();
}

class bicycle implements Vehicle{
	int gear,speed;
	Scanner sc=new Scanner(System.in);
	bicycle()
	{
		gear=1;
		speed=10;
	}
	public void gear_change(int p)
	{
		
		if(p>0 && p<7)
		{
			gear=p;
		}
		else {
			System.out.println("Gear out of range");
		}
	}
	public void speed_up()
	{
		if(speed+5>50)
		{
			System.out.println("Highest speed limit reached");
		}
		else
		{
			speed=speed+5;
		}
	}
	public void apply_brakes()
	{
		System.out.println("1. Slow Down\n2. Stop");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		if(ch==1)
		{
			if(speed-5<0)
			{
				System.out.println("Your vehicle is running at slowest speed");
			}
			else
			{
				gear=gear-1;
				speed=speed-5;
			}
		}
		else
		{
			speed=0;
			gear=0;
			System.out.println("Vehicle Stopped!!");
		}
	}
	public void display()
	{
		System.out.println("Current Speed: "+speed+" Gear: "+gear);
	}
}

class bike implements Vehicle{
	int gear,speed;
	Scanner sc=new Scanner(System.in);
	bike()
	{
		gear=1;
		speed=10;
	}
	public void gear_change(int p)
	{
		
		if(p>0 && p<=4)
		{
			gear=p;
		}
		else {
			System.out.println("Gear out of range");
		}
	}
	public void speed_up()
	{
		if(speed+15>100)
		{
			System.out.println("Highest speed limit reached");
		}
		else
		{
			speed=speed+15;
		}
	}
	public void apply_brakes()
	{
		System.out.println("1. Slow Down\n2. Stop");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		if(ch==1)
		{
			if(speed-15<0)
			{
				System.out.println("Your vehicle is running at slowest speed");
			}
			else
			{
				gear=gear-1;
				speed=speed-15;
			}
		}
		else
		{
			speed=0;
			gear=0;
			System.out.println("Vehicle Stopped!!");
		}
	}
	public void display()
	{
		System.out.println("Current Speed: "+speed+" Gear: "+gear);
	}
}

class car implements Vehicle{
	int gear,speed;
	Scanner sc=new Scanner(System.in);
	car()
	{
		gear=1;
		speed=10;
	}
	public void gear_change(int p)
	{
		
		if(p>0 && p<6)
		{
			gear=p;
		}
		else {
			System.out.println("Gear out of range");
		}
	}
	public void speed_up()
	{
		if(speed+25>50)
		{
			System.out.println("Highest speed limit reached");
		}
		else
		{
			speed=speed+25;
		}
	}
	public void apply_brakes()
	{
		System.out.println("1. Slow Down\n2. Stop");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		if(ch==1)
		{
			if(speed-25<0)
			{
				System.out.println("Your vehicle is running at slowest speed");
			}
			else
			{
				gear=gear-1;
				speed=speed-25;
			}
		}
		else
		{
			speed=0;
			gear=0;
		}
	}
	public void display()
	{
		System.out.println("Current Speed: "+speed+" Gear: "+gear);
	}
}
public class Main {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Vehicle v;
	int ch,c;
	do
	{
		System.out.println("-----MENU-----\n1. Bicycle\n2. Bike\n3. Car\n4. Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				v=new bicycle();
				do {
				System.out.println("-----Bicycle-----\n1. Gear Change\n2. Speed Up\n3. Apply Brakes\n4. Display\n5. Exit");
				c=sc.nextInt();
				if(c==1)
				{
					System.out.println("Enter Gear:");
					int g=sc.nextInt();
					v.gear_change(g);
				}
				else if(c==2)
				{
					v.speed_up();
				}
				else if(c==3)
				{
					v.apply_brakes();
				}
				else if(c==4)
				{
					v.display();
				}
				}while(c!=5);
				break;
			case 2:
				v=new bike();
				do
				{
				System.out.println("-----Bike-----\n1. Gear Change\n2. Speed Up\n3. Apply Brakes\n4. Display\n 4. Exit");
				c=sc.nextInt();
				if(c==1)
				{
					System.out.println("Enter Gear:");
					int g=sc.nextInt();
					v.gear_change(g);
				}
				else if(c==2)
				{
					v.speed_up();
				}
				else if(c==3)
				{
					v.apply_brakes();
				}
				else if(c==4)
				{
					v.display();
				}
				}while(c!=5);
				break;
			case 3:
				v=new car();
				do {
				System.out.println("-----Car-----\n1. Gear Change\n2. Speed Up\n3. Apply Brakes\n4. Display\n 5. Exit");
				c=sc.nextInt();
				if(c==1)
				{
					System.out.println("Enter Gear:");
					int g=sc.nextInt();
					v.gear_change(g);
				}
				else if(c==2)
				{
					v.speed_up();
				}
				else if(c==3)
				{
					v.apply_brakes();
				}
				else if(c==4)
				{
					v.display();
				}
				}while(c!=5);
				
			
		}
	}while(ch!=4);

}
}
