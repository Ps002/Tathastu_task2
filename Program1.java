//1. Write a Java program to perform basic Calculator operations.

package packages;

import java.util.Scanner;

public class Program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int var=2;
        double arr[]=new double[1];
        while(var!=3)
        {
            System.out.print("Choose:1]Addition 2]Subtraction3]Multiplication 4]Division==>");
            int x=sc.nextInt();
            if(var==2)
            {
                System.out.print("Enter total numbers for operation=");
                int n=sc.nextInt();
                arr=new double[n];
                System.out.println("Enter numbers=>");
                int i=0;
                for(double z:arr)
                {
                    arr[i]=sc.nextInt();
                    i++;
                }
            }
            switch(x)
            {
                case 1:
                    add(arr);
                    break;
                case 2:
                    sub(arr);
                    break;
                case 3:
                    mul(arr);
                    break;
                case 4:
                    div(arr);
                    break;
                default:
                    System.out.println("Invalid choise.");
            }
            System.out.print("Enter==>1]One more operation with samenumbers 2]One more operation with different numbers 3]Exit=");
            var=sc.nextInt();
        }
    }
    public static void add(double arr[])
    {
        double ans=0;
        for(double x:arr)
        {
            ans=ans+x;
        }
        System.out.println("Addition="+ans);
    }
    public static void sub(double arr[])
    {
        double ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=ans-arr[i];
        }
        System.out.println("Subtraction="+ans);
    }
    public static void mul(double arr[])
    {
        double ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=ans*arr[i];
        }
        System.out.println("Multiplication="+ans);
    }
    public static void div(double arr[])
    {
        double ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=ans/arr[i];
        }
        System.out.println("Division="+ans);
    }
}