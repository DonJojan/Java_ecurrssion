package Recurrssion;

import java.util.Scanner;

public class practiseque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character:");
		Scanner reader = new Scanner(System.in);
		String value = reader.nextLine();
		String c1="";
		String ans = revrev(value);
		System.out.println(ans);

		/*String ans = revrev(c);
		c++;
		String str="";
		System.out.println(c);
	
		System.out.println(ans);
*/
	}
	
	public static String revrev(String c)
	{
		if(c.equals("A"))
		{
		//	c2=String.valueOf(c)+c2+String.valueOf(c);
			return "A";
		}
		else
		{
			
			//c2 =String.valueOf(c);
			int charValue = c.charAt(0);
			System.out.println(charValue);
			if(charValue>= 65)
			{
			
			String next = String.valueOf( (char) (charValue -1));
			
			System.out.println(next);
			System.out.println(c);
			
			//return "s";
		
			return (revrev(next)+c+revrev(next));
			
		
		}
			return "t";
		}
	}

}
