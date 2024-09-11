package Number_Pattern;

public class Pattern6 
{
	public static void main(String[]args)
	{
		 
		
		int [][]ar= {{30,31,32},{33,34,35}}; 
		System.out.println(ar[1][1]);  ///34 
		System.out.println(".....Print All data......");
		
		for(int i=0;i<=1;i++)  
		{
			for(int j=0;j<=2;j++) 
			{
				System.out.print(ar[i][j]+ " ");  
			}
			System.out.println();   
		}
	}
}
