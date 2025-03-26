import java.util.Scanner;
class Ex04{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a character:");
		char vowels=ob.next() .charAt(0);
		switch (vowels){
			case 'A':System.out.println("It is a vowel.");
			break;
			case 'E':System.out.println("It is a vowel.");
			break;
			case 'I':System.out.println("It is a vowel.");
			break;
			case 'O':System.out.println("It is a vowel.");
			break;
			case 'U':System.out.println("It is a vowel.");
			break;
			case 'a':System.out.println("It is a vowel.");
			break;
			case 'e':System.out.println("It is a vowel.");
			break;
			case 'i':System.out.println("It is a vowel.");
			break;
			case 'o':System.out.println("It is a vowel.");
			break;
			case 'u':System.out.println("It is a vowel.");
			break;
			default:System.out.println("It is consanant.");
			break;
		}
	}
}