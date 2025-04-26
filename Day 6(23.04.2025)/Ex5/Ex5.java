public class Ex5
{
	public static void main(String[] args)
	{
		
		int Number[][] = {{54,02,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0; i<4; i++)
		{
			int max =Number[0][0];
		
			for(int j=0; j<3;j++)
				
			{
	
			System.out.print(Number[i][j]+" ");
			if(Number[i][j] > max)
		{
			max=Number[i][j];
		}
			}
			
		System.out.println();
		System.out.println("The maximum value is:"+max);
		}
		
		
		
		
	}
}
			
	
