package pattern13;

public class Rev2 
{
	public static void main(String[] args) 
	{
		int star=7;
		for(int i=1;i<=14;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<7)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
	}

}
