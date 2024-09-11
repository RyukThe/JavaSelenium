package Star_Pattern;

public class Pattern6
{
	public static void main(String[] args)
	{
		//***
		//**
		//*
		
		int star=3;
		
		for(int i=1; i<=3; i++)       /////outer for loops ----->ROW 
		{                     
			for(int j=1; j<=star; j++)   /////inner for loops ------> COLUMN
			{
				System.out.print("*");   ////////print() -----> use for column vise output
			}
			System.out.println();       //////println()-----> use for row vise output
			star--;                 
		}
	}
}
