import java.util.Date;
import java.util.Random;

public class Ex09{
	public static void main(String[] args)
	{
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(3,9));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.round(7.4));
		
		String name="java";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		
		int num1=Integer.parseInt("100");
		double num2=Double.parseDouble("45.67");
		System.out.println(num1+num2);
		
		Random r=new Random();
		int num=r.nextInt(10);//gives a random number 1to 10
		
		Date d =new Date();
		System.out.println(d);
		//current date and time
	}
}
		
	