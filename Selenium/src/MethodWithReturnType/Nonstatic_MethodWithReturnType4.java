package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType4 
{
	public static void main(String[] args) 
	{
		Nonstatic_MethodWithReturnType4 n=new Nonstatic_MethodWithReturnType4();
		System.out.println(n.sub(55, 5));
		
		int y=n.sub(210,60);
		System.out.println(y);
	}
	
	public int sub(int f,int g)
	{
		int c=f-g;
		return c;
	}
}
