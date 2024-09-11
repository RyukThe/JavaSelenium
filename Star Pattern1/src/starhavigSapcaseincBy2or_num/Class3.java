package starhavigSapcaseincBy2or_num;

public class Class3
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=103;
	for(int i=1;i<=35;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		space++;
		star=star-3;
	}
		
	}

}
