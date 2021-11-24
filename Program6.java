//6. Write a program in Java to print Diamond Pattern.

package packages;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter n to print its diamond pattern=");
			int n=sc.nextInt();
			diamondprint(n);
			System.out.print("\nChoose:1]For one more 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static void diamondprint(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>n-i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
