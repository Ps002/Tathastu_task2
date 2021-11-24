//5. Write a Java program to calculate Permutation and Combination of 2 numbers.

package packages;

import java.util.Scanner;

public class Program5 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
		int n=2;
		int r1=1;
		int r2=2;
        System.out.println("Combination when n=2 and r=1===>" +(fact(n)/(fact(n-r1)*fact(r1))));
        System.out.println("Permutation when n=2 and r=1===>" +(fact(n)/(fact(n-r1)))); 
        System.out.println("Combination when n=2 and r=2===>" +(fact(n)/(fact(n-r2)*fact(r2))));
        System.out.println("Permutation when n=2 and r=2===>" +(fact(n)/(fact(n-r2)))); 
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