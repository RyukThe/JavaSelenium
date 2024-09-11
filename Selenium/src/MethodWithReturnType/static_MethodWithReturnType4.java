package MethodWithReturnType;

public class static_MethodWithReturnType4 
{
	public static void main(String[] args)
	{
		System.out.println(division(10,2));
		
		int d=division(50,5);
		System.out.println(d);
	}
	public static int division(int p,int q)
	{
		int div=p/q;
		return div;
	}
}
