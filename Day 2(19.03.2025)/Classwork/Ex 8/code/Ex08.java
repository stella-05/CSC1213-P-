public class Ex08
{
	public static void main(String[] args)
	{
		//define int variable
		int num=5004;
		
		//type casting into double
		double doublenum=(double)num;
		System.out.println("The value of " + num + "after coverting to double is " + doublenum);
		
		//type casting double to int
		int num2=(int)doublenum;
		System.out.println("The value of " + doublenum + " after converting to int is "+num2);
	}
}