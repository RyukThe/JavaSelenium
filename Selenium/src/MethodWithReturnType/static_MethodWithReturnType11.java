package MethodWithReturnType;

public class static_MethodWithReturnType11
{
	public static void main(String[] args)
	{
		int num=Addition(10,20);
		System.out.println("Addition ="+num);
		
		System.out.println("Sum of number="+Addition(20,30));
	}
	
	public static int Addition(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}
	
}
