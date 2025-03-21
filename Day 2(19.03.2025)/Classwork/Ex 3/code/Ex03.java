import java.util.Scanner;
class Ex03{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your firstname :");
		fname = sc.nextLine();
		
		System.out.print("Enter your lastname :");
		String lname = sc.next();
		
		System.out.print("Enter your marks :");
		int marks = sc.nextInt();
		
		System.out.println("Fullname :"+fname+" " +lname+ "\n"+"Marks is :"+marks);
	}
}
