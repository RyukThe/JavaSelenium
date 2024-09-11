package MethodWithReturnType;

public class static_MethodWithReturnType5 
{
	public static void main(String[] args) 
	{
		System.out.println(square(50));
		
		int n=square(3);
		System.out.println("square of num="+n);
	}
	
	public static int square(int a)
	{

		
		int square=a*a;
		return square;
	}
}
