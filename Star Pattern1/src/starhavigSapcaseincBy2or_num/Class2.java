package starhavigSapcaseincBy2or_num;

public class Class2 
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=15;
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");                                                 
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
			
		}
		
		
	}

}
