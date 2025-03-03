package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram_Iterator 
{

	public static void main(String[] args) 
	{
		Set<Integer> s1= new HashSet<Integer>();
		s1.add(45);
		s1.add(2);
		s1.add(67);
		s1.add(98);
		System.out.println(s1);
		System.out.println("Forward Iteration");
		Iterator<Integer> i1= s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
