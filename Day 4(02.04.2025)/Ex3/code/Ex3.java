import java.util.Scanner;
class Ex3{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		char Control=' ';
		int EvenCounter=0, oddCounter=0;
		int sumEven=0;
		int sumodd=0;
		do
		{
			System.out.println("Enter the number :");
			int num=ob.nextInt();
			if(num%2==0)
			{
				EvenCounter=EvenCounter+num;
				EvenCounter++;
			}
			else
			{
				
				oddCounter=oddCounter+num;
				oddCounter++;
			}
				
			System.out.println("Do you want to continue:");
			Control=ob.next().charAt(0);
		}
		while(Control=='Y'|| Control=='y');
		System.out.println("Count the Even number"+EvenCounter);
		System.out.println("Count the odd number"+oddCounter);
		System.out.println("Count the Even number"+sumEven);
		System.out.println("Count the Even number"+sumodd);
		}
	}

		