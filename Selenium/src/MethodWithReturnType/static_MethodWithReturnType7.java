package MethodWithReturnType;

public class static_MethodWithReturnType7 
{
	public static void main(String[] args) 
	{
		int m=Mul(5,2);
		System.out.println(m);
		
		System.out.println("--------------------------");
		System.out.println(Mul(2,2));
	}
	public static int Mul(int a,int b)
	{
		int mul=a*b;
		return mul;
		
	}
}
