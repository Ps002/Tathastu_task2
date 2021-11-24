//2. Write a Java program to calculate Fibonacci Series up to n numbers.

package packages;

import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter number to calculate Fibonacci Series up to it=");
			int n=sc.nextInt();
			System.out.println("Fibonacci Series of "+n+" is as follows=>");
			findfibo(n);
			System.out.print("\n\nChoose: 1]For one more time 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static void findfibo(int n)
	{
		int i=1;
		int a=0;
		int b=1;
		while(i!=3&&i<=n)
		{
			if(i==1)
			{
				System.out.print(a+" ");
			}
			if(i==2)
			{
				System.out.print(b+" ");
			}
			i++;
		}
		while(i<=n)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
}
