import java.util.Scanner;
class Ex01{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("enter an integer : ");
		int num=ob.nextInt();
		System.out.println("The value is : "+ num);
		
		if((num%11==0)&&(num%5==0))
		{
			System.out.println("The number is divisible by 11 and 5.");
		}
		else
		{
			System.out.println("The number is not divisible by 11 and 5.");
		}
	}
}