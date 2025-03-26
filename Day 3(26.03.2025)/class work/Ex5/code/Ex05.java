import java.util.Scanner;
class Ex05{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=ob.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.print(i+"\t");
		}
	}
}