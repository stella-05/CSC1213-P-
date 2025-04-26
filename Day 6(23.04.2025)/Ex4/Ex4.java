public class Ex4
{
	public static void main(String[] args)
	{
		
		int numbers[][] = {{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		
		for(int i=0; i<3; i++)
		{
			int sum=0;
			for(int j=0; j<4;j++)
				
			{
	
			System.out.print(numbers[i][j]+" ");
			sum=sum+numbers[i][j];
			
			}
			System.out.println();
			System.out.println("sum is:"+ sum);
		}
	}
}