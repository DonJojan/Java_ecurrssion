package Recurrssion;

import java.util.Scanner;

public class Stringrevself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s=sc.next();
		String ans="";
		String result = strrev(s,ans);
		System.out.println(result);

	}
	
	public static String strrev( String str, String ans1)
	{
		if(str.length() == 1)
		{
			return(ans1+str);
		}
		else
		{
			ans1=ans1+str.substring(str.length()-1);
			return(strrev(str.substring(0,str.length()-1),ans1));
		}
		
	}

}
