import java.util.Scanner;
class Ex06{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter the value for counter 01:");
		int counter01=ob.nextInt();
		
		System.out.println("enter the value for counter 02:");
		int counter02=ob.nextInt();
		
		for(int i=0; i<counter01;i++)
		{
			System.out.println("value for i :"+i);
		for(int j=0; j<counter02;j++)
		{
			System.out.println("value for j:"+j+" ");
		}
		System.out.println();
		}
	}
}
		