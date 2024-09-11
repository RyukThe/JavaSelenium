package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType6 
{
	public static void main(String[] args) 
	{
		Nonstatic_MethodWithReturnType6 n=new Nonstatic_MethodWithReturnType6();
		System.out.println(n.add(5,60));
		
		System.out.println("--------------------");
		
		int sum=n.add(10, 50);
		System.out.println(sum);
	}
	
	public int add(int s,int r)
	{
		int sum=s+r;
		return sum;
	}
}
