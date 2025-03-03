package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty_Wrraper 
{

	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(65);
		l1.add(75);
		l1.add(105);
		l1.add(2);
		l1.add(50);
		l1.add(30);
	    System.out.println(l1);
	    System.out.println("Iterator:-forward iteration");
	    Iterator<Integer> l2 = l1.iterator();
	    while(l2.hasNext())
	    {
	    	System.out.println(l2.next());
	    }
	    
	    System.out.println("ListIterator:-Forward Iteration");
		ListIterator<Integer> l3= l1.listIterator();
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		System.out.println("\"ListIterator:-Backward Iteration");
         while(l3.hasPrevious())
         {
        	 System.out.println(l3.previous());
         }
	}

}
