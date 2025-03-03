package Module2Prgms;

import java.util.Scanner;

public class LocalVariable 
{
//Any variable which is present under any method is called as local variable
	
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in); // s1 is a local variable bcoz it is under method(any method)
		System.out.println("Please enter the value of a");
		int a=s1.nextInt(); // a is local variable
		
		System.out.println("Please enter the value of b");
		int b=s1.nextInt(); // b is local variable
		
		int sum=a+b; // sum is local variable
		System.out.println("Addition of two numbers is:-->");
		System.out.println(sum);
		s1.close();
		
		
		

	}

}
