package Module2Prgms;

// Any variable which is present inside the class but outside any method is called as global variable.
public class GlobalVariable 
{
      static double pi=3.14; // pi is Global variable
      int noofdaysinmonth_12=31; // Global variable
      
      static void area()
      {
    	  double ar= pi*5*5; // circle area=pi*r*r
      }
      
      
	public static void main(String[] args) 
	{
		double circum= 2*pi*5*5; // 2*pi*r*r
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.noofdaysinmonth_12);

	}

}
