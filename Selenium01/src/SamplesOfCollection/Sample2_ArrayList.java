package SamplesOfCollection;

import java.util.ArrayList;

public class Sample2_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add("Rushikesh");
		a.add(777);
		a.add(65.89f);
		a.add('B');
		a.add(null);
		a.add(83489);
		a.add('C');
		a.add(54.3f + "%");
		
		System.out.println(a);
		System.out.println(a.size());  ///8
		System.out.println(a.contains(null)); //true
		System.out.println(a.contains("Rushikesh")); //true
		System.out.println(a.get(7));  ///54.3%
		System.out.println(a.isEmpty()); //false
		System.out.println(a.get(6)); //C 
		System.out.println(a.get(3)); //B 
		
		
		a.add(2, 'V');
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		a.set(3, 42.5f);
		System.out.println(a);
		
	}
}
