package abc;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		int n1,n2;
		
		Scanner sc=new Scanner(System.in);
		try {
			int p=Integer.parseInt("\0");
			System.out.println("Enter first number:");
			n1=sc.nextInt();
			System.out.println("Enter second number:");
			n2=sc.nextInt();
			int q=n1/n2;
			System.out.println("Quotient is "+q);
			int arr[]= {1,2,3,4,5,6,7,8};
			for(int i=0;i<=arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format Exception Generated"+e);
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("Arithmetic Exception Generated"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of bound Exception Generated"+e);
		}
	}

}
