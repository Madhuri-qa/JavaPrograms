package arrayconcept;
import java.util.Arrays;
import java.util.Scanner;
// WAP to create an array of size 4 which belongs to int type and accept its input at run-time
public class ArrayPrb1 
{
public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int num[]= new int[s1.nextInt()];
		
		for(int i=0; i<=num.length-1; i++)
		{
			System.out.println("Enter the value of array at index:- " +i);
			num[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(num));
		s1.close();
	}

}
