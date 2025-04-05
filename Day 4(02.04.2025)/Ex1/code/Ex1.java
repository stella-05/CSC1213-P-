import java.util.Scanner;
class Ex1{
	public static void main(String[] args)
	{
		Scanner ob= new Scanner(System.in);
		
		System.out.println("Enter an integer number:");
		int a=ob.nextInt();
		
		int i=1;
		int sum =0;
		while(i<=a)
		{
			sum=sum+i;
			i++;
		}
			
				System.out.println("The summation of the integers:"+sum);
	}
}
		