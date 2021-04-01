package Recurrssion;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {88,1,22,45,66,11,21,100}; 
		 int i=0, n= arr.length;
		 int c=0;
		
	     int result = max_number(0,1,c, arr);  
	     System.out.println(result);

	}

	public static int max_number(int k,int m,int max, int array1[])
	
	{
		int flag =0;
		
		int n= array1.length;


		if(m <= (n-1)) {
			flag =1;
		
			if(array1[k]> array1[m])
			{
				max= array1[k];
			}
			else {
				max = array1[m];
			}
			
			k++;
			array1[k]=max;
			m++;
			return(max_number(k,m,max,array1));
		}
		else {
			
			return max;
		}
			
		
		
	}
}
