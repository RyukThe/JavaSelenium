package SamplesOfCollection;

import java.util.ArrayList;

public class Sample4_ArrayList 
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
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains('B'));
		System.out.println(a.isEmpty());
		System.out.println(a.get(3));
		System.out.println(a.clone());
		
		
		a.add(2, 876);
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		a.set(2, 786);
		System.out.println(a);
	}
	
	
}
