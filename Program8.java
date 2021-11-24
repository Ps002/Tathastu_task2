//8. Write a Java Program to check whether the given array is Mirror Inverse or not.

package packages;

import java.util.Scanner;

public class Program8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter total array elements=");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter array elements=>");
			for(int i=0;i<n;i++)
			{
				System.out.print("arr["+i+"]=");
				arr[i]=sc.nextInt();
			}
			checkmirr(arr);
			System.out.print("\n\nChoose:1]One more 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static void show(int arr[])
	{
		System.out.print("Array==>");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void checkmirr(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int x=arr[i];
			if(x>n||arr[x]!=i)
			{
				show(arr);
				System.out.print("-------is not mirror inverse.");
				return;
			}
		}
		show(arr);
		System.out.print("-------is mirror inverse.");
	}
}
