package arrayconcept;
//WAP to check if 24 is a part of your array if yes print its indexing
public class ArrayPrb5 
{

	public static void main(String[] args) 
	{
		int arr1[]=new int[4];
		arr1[0]=45;
		arr1[1]=55;
		arr1[2]=65;
		arr1[3]=24;
		
		int numtocheck=24;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(numtocheck==arr1[i])
			{
				System.out.println("The num is present in array and its indexing is:-" +i);
			}
		}
	}

}
