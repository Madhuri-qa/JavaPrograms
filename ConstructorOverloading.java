package Module2Prgms;
//Developing multiple constructors but variation in the argument list is called as 
//Constructor overloading.
public class ConstructorOverloading 
{
	ConstructorOverloading(int a)
	{
		System.out.println("Constructor 1");
	}
	
	ConstructorOverloading()
	{
		System.out.println("Constructor 2");
	}
	
	ConstructorOverloading(boolean b1, boolean b2, char gender, String name)
	{
		System.out.println("Constructor 3");
	}


	public static void main(String[] args) 
	{
		
		new ConstructorOverloading();
		new ConstructorOverloading(90);
		new ConstructorOverloading(false,true,'F',"Madhu");
	}
	
	

}
