package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_IsEmpty 
{

	public static void main(String[] args) 
	{
		Collection<Character> c1= new ArrayList<Character>();	
        boolean b1= c1.isEmpty();
        System.out.println(b1);
        c1.add('A');
        c1.add('U');
        c1.add('Y');
        c1.add('G');
        System.out.println(c1);
        
        Collection<Character> c2= new ArrayList<Character>();	
        c2.add('a');
        c2.add('u');
        c2.add('y');
        c2.add('g');
        c2.addAll(c1);
        System.out.println(c2);
        
      //  c2.clear();
        
        boolean b2=c2.equals(c1);
        System.out.println(b2);
        
        boolean b3=c2.contains('Y');
        System.out.println(b3);
        
        boolean b4=c2.containsAll(c1);
        System.out.println(b4);
        
        
        
        
        
        
        
        
        
        
	}

}
