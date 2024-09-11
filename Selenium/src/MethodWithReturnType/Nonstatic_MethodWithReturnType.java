package MethodWithReturnType;

public class Nonstatic_MethodWithReturnType
{
	public static void main(String[] args) 
	{
		Nonstatic_MethodWithReturnType n=new Nonstatic_MethodWithReturnType();
		System.out.println(n.Fullname("saurav kasture"));
		
		String f=n.Fullname("Parag ");
		System.out.println(f);
	}
	
	public String Fullname(String fn)
	{
		return fn;
	}
}
