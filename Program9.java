//9. Write a Java program to remove elements from an ArrayList

package packages;

import java.util.Scanner;

public class Program9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch=2;
		int arr[]=new int[1];
		while(ch!=3)
		{
			if(ch==2)
			{
				System.out.print("Enter total elements of array=");
				int n=sc.nextInt();
				arr=new int[n];
				System.out.println("<==Enter array elements==>");
				for(int i=0;i<n;i++)
				{
					System.out.print("arr["+i+"]=");
					arr[i]=sc.nextInt();
				}
			}
			System.out.print("Array==>");
			printarr(arr);
			System.out.print("\nEnter element to remove from array=");
			int x=sc.nextInt();
			arr=removele(arr,x);
			System.out.print("Array after deleting element==>");
			printarr(arr);
			System.out.print("\n\nChoose:1]Delete 1 more element of same array 2]Another array 3]exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static void printarr(int arr[])
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static int[] removele(int arr[],int x)
	{
		int n=0;
		for(int y:arr)
		{
			if(y==x)
			{
				n++;
			}
		}
		if(n==0)
		{
			System.out.println("The deleting element="+x+" not found in array.");
		}
		int arr2[]=new int[arr.length-n];
		int i=0;
		for(int y:arr)
		{
			if(y!=x)
			{
				arr2[i]=y;
				i++;
			}
		}
		return arr2;
	}
}
