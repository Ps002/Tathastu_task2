//10.Write a Java Program to find the Transpose of a given Matrix.

package packages;

import java.util.Scanner;

public class Program10
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter total rows=");
			int row=sc.nextInt();
			System.out.print("Enter total columns=");
			int col=sc.nextInt();
			System.out.println("<==Enter Matrix["+row+"]["+col+"] elements==>");
			int arr[][]=new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print("arr["+i+"]["+j+"]=");
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("<==Given Matrix==>");
			displaymat(arr);
			int trans[][]=transpose(arr);
			System.out.println("<==Transpose Matrix==>");
			displaymat(trans);
			System.out.print("\nchoosse:1]One more 2]Exit=");
			ch=sc.nextInt();
			System.out.println();
		}
	}
	public static void displaymat(int arr[][])
	{
		for(int x[]:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static int[][] transpose(int arr[][])
	{
		int arr2[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[0].length;j++)
			{
				arr2[i][j]=arr[j][i];
			}
		}
		return arr2;
	}
}
