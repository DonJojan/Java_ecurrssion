package Recurrssion;

import java.util.Scanner;

public class Pract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int z=0;
		boolean result = teddy(n,z);
		System.out.println(result);

	}
	
	public static boolean teddy(int n, int p)
	{
		
		if (n == 42)
		{
			return true;
		}
		else
		{
		if (n%5==0)
		{p++;
			System.out.println("5"+p);
			return teddy((n-42),p);
		}
		if (n%2 ==0)
		{
			p++;
			System.out.println("2"+p);
			return teddy((n/2),p);
		}
		if ((n%3 ==0)||(n%4==0))
		{
			p++;
			System.out.println("3,4"+p);
			int m = n%10;
			int y = (n % 100)/10;
			int x=n-(m*y);
			return teddy(x,p);
		}
		return false;
		}
		
	}

}
