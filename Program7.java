//7. Write a Java Program to reverse the letters present in the given String.

package packages;

import java.util.Scanner;

public class Program7 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter String to reverse it:");
			String str=sc.nextLine();
			reverse(str);
			System.out.print("\nChoose:1]For one more time 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
			sc.nextLine();
		}
	}
	public static void reverse(String str1) 
	{
		char arr1[]=str1.toCharArray();
		int len=arr1.length-1;
		char arr2[]=new char[len+1];
		int i=0;
		for(char x:arr1)
		{
			arr2[len-i]=x;
			i++;
		}
		String str2=new String(arr2);
		System.out.println("Given String==>"+str1);
		System.out.println("After Reverse==>"+str2);
	}
}
