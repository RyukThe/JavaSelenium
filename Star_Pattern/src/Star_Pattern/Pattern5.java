package Star_Pattern;

public class Pattern5 
{
		public static void main(String[] args)
		{
			//*
			//**
			//***
			
			int star=1;
			
			//                 4<=3
			for(int i=1; i<=3; i++)          //outer for loop -> rows
			{     //                   
				for(int j=1; j<=star; j++)    //inner for loop --> cols
				{
					System.out.print("*");    ////////print() -----> use for column vise output
				}
				System.out.println();    ////////println() -----> use for row vise output
				star++;           //4
			}
			//*
			//**
			//***	
		}
	
}
