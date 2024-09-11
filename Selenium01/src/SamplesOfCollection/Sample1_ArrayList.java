package SamplesOfCollection;

import java.util.ArrayList;

public class Sample1_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add("Rushi");
		a.add(1234);
		a.add('A');
		a.add(75.9f);
		a.add(null);
		a.add(null);
		
		
		System.out.println(a); 
		System.out.println(a.size());   //6
		System.out.println(a.isEmpty()); //false
		System.out.println(a.contains(null)); //true
		System.out.println(a.get(3));  //75.9
		
		
		a.add(2,"Rushikesh");
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		a.set(2, "Mrs.");
		System.out.println(a);
	}
}
