package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProperty 
{

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		   l1.add("Ram");
		   l1.add(42);
		   l1.add('M');
		   l1.add(780000);
		   l1.add(false);
		   l1.add("Ram"); //duplicate values
		   l1.add(null); // null values except
		   System.out.println(l1);
		   

	}

}
