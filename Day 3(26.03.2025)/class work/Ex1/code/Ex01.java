import java.util.Scanner;
class Ex01{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner (System.in);
		System.out.print("Enter an integer:");
		int num=ob.nextInt();
		System.out.println("the value is"+num);
		
		if(num>0)
		{
			System.out.println("The number is positive.");
		}
		else if(num<0)
		{
            System.out.println("The nukmber is negative.");
		}
        else
       {
           System.out.println("The number is zero.");
       }
	}
}	