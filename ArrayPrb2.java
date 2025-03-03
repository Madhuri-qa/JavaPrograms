package arrayconcept;
//WAP to create an array of size 4 which belongs to int type and copy its values into a new array
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrb2 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int num[]= new int[s1.nextInt()];
		int num1[]=new int[num.length];
		
		for(int i=0; i<=num.length-1; i++)
		{
			System.out.println("Enter the value of array at index:- " +i);
			num[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(num));
		
		for(int j=0; j<=num1.length-1;j++)
		{
			num1[j]=num[j];
		}
		System.out.print("Copied arrays:-");
		System.out.println(Arrays.toString(num1));
		s1.close();
		
	}

}
