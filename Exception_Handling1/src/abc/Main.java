package abc;
import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int top=-1,ch;
		System.out.print("Enter size of stack:");
		int n=sc.nextInt();
		int A[]=new int[n];
		do
		{
			System.out.println("----Stack Operation----\n1. Push\n2. Pop");
			System.out.print("Enter Choice:");
			ch=sc.nextInt();
			if(ch==1)
			{
			 try 
			 {
				top++;
				System.out.print("Enetr number:");
				int v=sc.nextInt();
				A[top]=v;
			 }
			 catch(Exception e)
			 {
				System.out.println("Overflow");	
			 }
				
			}
			else
			{
				try
				{
					System.out.println("Popped element is"+A[top]);
					top--;
			
				}
				catch(Exception e)
				{
					System.out.println("Underflow");	
				}
			}
				
		}while(ch!=3);

}
}

