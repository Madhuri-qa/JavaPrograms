package Module2Prgms;

public class ThisCallingStatement 
{

	    
		ThisCallingStatement(int a)
		{   
			System.out.println("Constructor 1");
		}
		
		ThisCallingStatement(double a)
		{
			System.out.println("Constructor 2");
		}
		
		ThisCallingStatement(boolean b1, boolean b2, char gender, String name)
		{
			System.out.println("Constructor 3");
		}


		public static void main(String[] args) 
		{
			
			
			//new ConstructorOverloading(90);
			//new ConstructorOverloading(false,true,'F',"Madhu");
		}
		
		

	

		

	}


