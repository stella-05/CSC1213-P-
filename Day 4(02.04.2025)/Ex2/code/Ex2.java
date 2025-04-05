import java.util.Scanner;
class Ex2{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		char Control=' ';
		int sum=0;
		do
		{
			System.out.println("Enter the number to find the summation:");
			int num=ob.nextInt();
			sum=sum+num;
			System.out.println("Do you want to continue (Y/N):");
			Control=ob.next().charAt(0);
		}
		while(Control=='Y');
		System.out.println("Summation of the numbers"+sum);
	}
}
		