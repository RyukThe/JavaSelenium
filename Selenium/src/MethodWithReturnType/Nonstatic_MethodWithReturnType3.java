package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType3
{
	public static void main(String[] args) 
	{
		Nonstatic_MethodWithReturnType3 n=new Nonstatic_MethodWithReturnType3();
		System.out.println(n.add(5, 10, 20));
		
		int x=n.add(5, 20, 70);
		System.out.println("Add three number="+x);
	}
	public int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
}
