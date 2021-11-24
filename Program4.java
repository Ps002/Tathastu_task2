//4. Write a Java program to find out whether the given String is Palindrome or not.

package packages;

import java.util.Scanner;

public class Program4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter String to check it is palindrome or not:");
			String str=sc.nextLine();
			checkpali(str);
			System.out.print("\nChoose:1]For one more time 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
			sc.nextLine();
		}
	}
	public static void checkpali(String str1) 
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
		if(str1.equals(str2))
		{
			System.out.println("Given String:-"+str1+" is Palindrome");
		}else 
		{
			System.out.println("Given String:-"+str1+" is not Palindrome");
		}
	}
}
