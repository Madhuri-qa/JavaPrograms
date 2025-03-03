package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty 
{

	public static void main(String[] args) 
	{
	   Collection c1= new ArrayList();
	   c1.add("Ram");
	   c1.add(42);
	   c1.add('M');
	   c1.add(780000);
	   c1.add(false);
	   c1.add("Ram"); //duplicate values
	   c1.add(null); // null values except
	   System.out.println(c1);
	   
	   
	}

}
