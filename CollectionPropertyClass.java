package collection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionPropertyClass 
{

	public static void main(String[] args) 
	{
		Collection<Integer> c1= new ArrayList<Integer>(); //<Integer> it is wrapper class
		c1.add(35);
		c1.add(45);
		c1.add(55);
		c1.add(65);
		System.out.println(c1);

	}

}
