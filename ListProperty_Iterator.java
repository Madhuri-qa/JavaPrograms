package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProperty_Iterator {

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add("Hello");
		l1.add("Welcome");
		l1.add("Bangalore");
		l1.add("Happy Stay");
		System.out.println(l1);
		
		Iterator l2=l1.iterator();
		
		//hasnext: return is boolean(True/false)  --- next element checks if the element is present or not
		// next-- object
		
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
	}

}
// using iterator concept only do forwad iterator