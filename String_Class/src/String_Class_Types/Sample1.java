package String_Class_Types;

public class Sample1 
{
	public static void main(String[] args) 
	{
		
		String s1;      //only declaration of string
		String s2="abc";  //declaration & initialization
		
		
		String s3="ab";
		System.out.println(s3);  ////print statement
		
		s3=s3+"cd";   //ab + cd = abcd
		System.out.println(s3);
		
		s3=s3+"xyz";   //      abcd + xyz  = abcdxyz
		System.out.println(s3);
		
	}
}
