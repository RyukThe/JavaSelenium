package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType1 
{
	public static void main(String[] args)
	{
		Nonstatic_MethodWithReturnType1 n=new Nonstatic_MethodWithReturnType1();
		System.out.println(n.sub(50,20));
		
		System.out.println("----------------------");
		
		int x=n.sub(100, 40);
		System.out.println(x);
	}
	
	public int sub(int a,int b)
	{
		int s=a-b;
		return s;
	}
}
