package Recurrssion;

import java.util.Arrays;

public class Binary_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,11,66,67,88,98,99,109}; 
      
        int key = 100;  
        System.out.println("\nThe key to be searched:" + key);
        int lb=0,ub=arr.length-1;

       int result = find1(arr,lb,ub,key); 
       System.out.println(result);

       

	}
	public static int find1(int []a,int lb,int ub, int key)
	{
		
		
		if(ub>=lb)
		{
		int mid = lb+(ub-lb)/2;
		
		 if (key == a[mid])
			{
				return mid;
			}
		 
		 else {
			 
			 
				if(key<a[mid])
					return find1(a,lb,mid-1,key);
				else
			
					return find1(a,mid+1,ub,key);
				
		}
		
		}
		
		
			return -1;
			
	}
		
}
