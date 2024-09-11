package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType5
{
	public static void main(String[] args)
	{
		Nonstatic_MethodWithReturnType5 n5=new Nonstatic_MethodWithReturnType5();
		System.out.println(n5.m1(10, 20));
		
		int s=n5.m1(20, 20);
		System.out.println(s);
	}
	public int m1(int a,int b) 
	{
		int c=a+b;
		return c;
		
	
	}
}
