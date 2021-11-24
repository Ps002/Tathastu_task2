//3. Write a Java program to calculate a Factorial of a number.

package packages;

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter number to find its factorial=");
			int n=sc.nextInt();
			System.out.println("Factorial of "+n+"="+fact(n));
			System.out.print("\nChoose:1]For one more time 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}else 
		{
			return n*fact(n-1);
		}
	}
}
