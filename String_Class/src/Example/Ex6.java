package Example;

public class Ex6 
{
	public static void main(String[]args)
	{
		String s1="asasa";
		String s2="asas";
		String s3="sau";
		String s4="My Name is saurav";
		
		
		System.out.println(s1.length()); 
		System.out.println(s1.toUpperCase()); 
		System.out.println(s2.toLowerCase());  
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));	
		System.out.println(s3.contains("H")); 
		
		System.out.println("...................................");
		
		System.out.println(s4.startsWith("My")); 
		System.out.println(s4.endsWith("Rushikesh")); 
		System.out.println(s3.charAt(7)); //S
		System.out.println(s4.indexOf("N")); //3
		System.out.println(s4.lastIndexOf("i"));  //15
		System.out.println(s4.replace("Saurav", "Ajay"));
	}
}
