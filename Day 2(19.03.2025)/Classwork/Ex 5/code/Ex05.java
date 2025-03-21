import java.util.Scanner;
class Ex05{
	public static void main(String[] args)
	{
		Scanner ob =new Scanner (System.in);
		System.out.println("Enter an integer:");
		int num =ob.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}