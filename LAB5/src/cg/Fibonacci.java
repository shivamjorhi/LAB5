package cg;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		normalFibo(n);
		recursiveFibo(n);
		
		
	}
	
	public static void normalFibo(int n) 
	{
	  int arr[] = new int[n];
	  arr[0]=1;
	  arr[1]=1;
	  System.out.print(arr[0]);
	  System.out.print(arr[1]);
	  for(int i=2;i<n;i++)
	  {
		  arr[i]=arr[i-1]+arr[i-2];
		  System.out.print(arr[i]);
	  }
	
	}
	public static void recursiveFibo(int n) {
		if(n==1||n==2)
		{
			System.out.print(1);
		}
		else
			System.out.print(recursiveFibo(n-1)+recursiveFibo(n-2));
	
	}
	
		
	

  }
