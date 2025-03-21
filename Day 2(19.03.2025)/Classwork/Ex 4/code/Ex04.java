import java.util.Scanner;
class Ex04{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your firstname :");
		fname = sc.nextLine();
		
		System.out.print("Enter your lastname :");
		String lname = sc.next();
		
		System.out.print("Enter your Age:");
		int Age = sc.nextInt();
		
		System.out.println("Ënter your Resistration number :");
		String Regno = sc.next();
		
		System.out.println("your sex (M/F) :");
		char sex=sc.next().charAt (0);
		
		System.out.println("Enter your mobile number :");
		long phoneNo=sc.nextLong();
		
		System.out.println("Enter your gpa :");
		double gpa=sc.nextDouble();
		
		System.out.println("Fullname :"+fname+" " +lname+ "\n"+"your age is :"+Age+"\n"+"sex (M/F) :"+sex+"\n"+"your mobile number :"+phoneNo+"\n"+"your gpa :"+gpa);
	}
}