import java.util.Scanner;
class Ex02{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=ob.nextInt();
		System.out.println("The value is"+num1);
		
		System.out.print("Enter the second number:");
		int num2=ob.nextInt();
		System.out.println("the value is"+num2);
		
		System.out.print("Enter the third number:");
		int num3=ob.nextInt();
		System.out.println("the value is"+num3);
		
		if((num1>num2)&&(num1>num3))
		{
			System.out.println("The maximum number is:"+num1);
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("The maximum is:"+num2);
		}
		else
		{
			System.out.println("The maximum number is"+num3);
		}
	}
}