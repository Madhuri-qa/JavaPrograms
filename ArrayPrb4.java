package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrb4 
{


	//WAP to accept the values of 2 arrays at run-time and compare if both are equal
	
	
		public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of an array1");
			int array1[]= new int[s1.nextInt()];
			for(int i=0; i<=array1.length-1; i++)
			{
				System.out.println("Enter the value of array1 at index:- " +i);
				array1[i]=s1.nextInt();
			}
			System.out.println("Enter the size of an array2");
			int array2[]=new int[s1.nextInt()];
			for(int j=0; j<=array2.length-1; j++)
			{
				System.out.println("Enter the value of array2 at index:- " +j);
				array2[j]=s1.nextInt();
			}
			
			System.out.println("The first array is:- " +Arrays.toString(array1));
			System.out.println("The first array is:- " +Arrays.toString(array2));
			
			boolean answer=Arrays.equals(array1, array2);
			if(answer==true)
			{
				System.out.println("Arrays are equals");
				
			}
			else
			{
				System.out.println("Arrays are not equals");
			}
			s1.close();
					

}
}
