package arrayconcept;

import java.util.Arrays;

//WAP to create an array of size 4 which belongs to int type and copy its values into a new array in reverse order
public class ArrayPrb3 
{

	public static void main(String[] args) 
	{
		 int n1[]=new int[4];
	        int reverse[]=new int[n1.length];
	        n1[0]=10;
	        n1[1]=20;
	        n1[2]=30;
	        n1[3]=40;
	        
	        for(int i=0,j=3;i<=3;i++,j--)
	        {
	        	reverse[j]=n1[i];
	        	
	        }
	        System.out.println("Given Array is:" +Arrays.toString(n1));
	        System.out.print("Reverse order is:-");
	        System.out.println(Arrays.toString(reverse));
	}

}
