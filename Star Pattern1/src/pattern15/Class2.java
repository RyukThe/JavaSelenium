package pattern15;

public class Class2
{
	public static void main(String[] args)
	{
		int space=10;
		int star=1;
		for(int i=1;i<=15;i++)
		{
			for(int j =1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<7)
			{
				space--;
				star=star+2;
			}
			else
				
			{
				space++;
				star=star-2;
			}
		}
		
	}

}
