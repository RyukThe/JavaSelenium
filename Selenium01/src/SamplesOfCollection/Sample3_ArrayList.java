package SamplesOfCollection;

import java.util.ArrayList;

public class Sample3_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add("RUSHI");
		a.add("rushikesh");
		a.add(77);
		a.add(64.87f);
		a.add('B');
		a.add(null);
		a.add(null);
		a.add(80);
		
		System.out.println(a);//[RUSHI, rushikesh, 63, 64.87, B, null, null]
		System.out.println(a.size());//7
		System.out.println(a.isEmpty()); //false
		System.out.println(a.clone()); //[RUSHI, rushikesh, 63, 64.87, B, null, null]
		System.out.println(a.contains(null));  //true
		System.out.println(a.contains("RUSHI"));  //true
		System.out.println(a.get(4)); //B
		System.out.println(a.get(1)); //rushikesh
		System.out.println(a.get(3)); //64.87
		System.out.println(a.get(2)); //77
		System.out.println(a.get(7)); //80
		System.out.println(a.contains("rushik")); //false
		
	}
}
