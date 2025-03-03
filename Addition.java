package accessspecifier_pac1;

// Access Specifier for Methods within the class

public class Addition 
{
      public static void add()
      {
    	  System.out.println("One");
      }
       static void add1()
      {
    	   System.out.println("Two");
      }
      protected static void add2()
      {
    	  System.out.println("Three");
      }
      private static void add3()
      {
    	  System.out.println("Four");
      }
	public static void main(String[] args) 
	{
		add();
		add1();
		add2();
		add3();

	}

}
