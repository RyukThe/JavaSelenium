package Number_Pattern;

public class Pattern5
{
	public static void main(String[]args)
	{
	
	
	int[][]ar=new int[2][3];  
	
	ar[0][0]=30;
	ar[0][1]=31;
	ar[0][2]=32;
	ar[1][0]=33;
	ar[1][1]=34;
	ar[1][2]=35;
	
	System.out.println(ar[0][2]); 
	System.out.println(ar[1][1]); 
	System.out.println(ar.length);
	System.out.println(".....Print All data......");
	
	for(int i=0;i<=1;i++)    
	{
		for(int j=0;j<=2;j++)   
		{
			System.out.print(ar[i][j]+" ");  
											
		}
		System.out.println();  
		
	}
	}
}
