package String_Class_Types;

public class Sample4
{
		public static void main(String[] args)
		{
			
			String s1="velocity";
			String s2="VELOCITY";
			String s3="my name is rahul";
			String s4="abcabcabc";
			String s5="";
			
			System.out.println(s5.isEmpty());     //true
			System.out.println(s1.isEmpty());    //false
			
			System.out.println(s1.concat(s2));     //velocityVELOCITY
			System.out.println(s1+s2);     //velocityVELOCITY
			System.out.println(s1.substring(3, 6));   //3-5
			System.out.println(s1.substring(4));     //city
			
			System.out.println("................................");
			
			System.out.println(s1.length());     //8
			System.out.println(s1.toUpperCase());   //VELOCITY
			System.out.println(s2.toLowerCase());  //velocity
			System.out.println(s1.equals(s2));  //false         //compare data & case
			System.out.println(s1.equalsIgnoreCase(s2));  // true   //    compare only data  
			System.out.println(s3.contains("is"));      // true
			
			System.out.println("--------------");
			
			System.out.println(s3.startsWith("my"));     //true
			System.out.println(s3.endsWith("rahul"));   //true
			System.out.println(s1.charAt(4));    //c
			System.out.println(s4.indexOf('b'));   //1
			System.out.println(s4.lastIndexOf('a'));   //6

			System.out.println(s3.replace("rahul", "ganesh"));   //my name is ganesh
			
		}

	
}
