package Module2Prgms;
// developing multiple methods with same name but variation in argument list is called Method overloading
public class MethodOverload 
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void add(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void add(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	 void add (double a) // non static method
	 {
		 double sum=a+6;
			System.out.println(sum);
	 }
	

	public static void main(String[] args) 
	{
		MethodOverload m1 = new MethodOverload(); // calling non static method
		m1.add(3.39);
	   add(11,99);
	   add(20.09,9);
	   add(80.09,23.78);

	}

}
