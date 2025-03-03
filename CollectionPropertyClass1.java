package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPropertyClass1 
{

	public static void main(String[] args) 
	{
		Collection<String> c1= new ArrayList<String>();
        c1.add("arjun");
        c1.add("Ram");
        c1.add("bheem");
        c1.add("laxman");
        System.out.println(c1);
        
        Collection<String> c2= new ArrayList<String>();
        c2.add("bharat");
        c2.add("Harsha");
        c2.add("Sairam");
        c2.add("Kanav");
        System.out.println(c2);
        c2.addAll(c1);
        System.out.println(c2);
        c2.remove("Kanav");
        c2.removeAll(c1);
        System.out.println(c2);
        
        
        
        
        
	}

}
