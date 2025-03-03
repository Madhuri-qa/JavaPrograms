package Module2Prgms;

public class MainMethod_Overload 
{
	public static void main()
	{
		System.out.println("1");
	}

	public static void main(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		
        System.out.println("3");
        main();
        main(90);
	}

}
