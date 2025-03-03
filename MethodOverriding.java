package Module2Prgms;
class Parent_Class
{
	void login()
	{
		System.out.println("Login with email id");
	}
	
}

public class MethodOverriding extends Parent_Class 
{
	void login()
	{
		System.out.println("Login with mobile number");
		super.login(); //super keyword
	}

	public static void main(String[] args) 
	{
		MethodOverriding m1=new MethodOverriding();
		m1.login();
		

	}

}
