import java.util.Scanner;
class Ex06{
	public static void main(String [] args)
	{
		Scanner ob=new Scanner(System.in);
		
		//Boolean
		System.out.println("Input the value:");
		boolean val1=ob.nextBoolean();
		System.out.println("Output="+val1);
		
		//Byte
		System.out.println("Input the value:");
		byte val2=ob.nextByte();
		System.out.println("output="+val2);
		
		//short
		System.out.println("Input the value:");
		short val3=ob.nextShort();
		System.out.println("output="+val3);
		
		//Integer
		System.out.println("Input the value:");
		int val4=ob.nextInt();
		System.out.println("output="+val4);
		
		//float
		System.out.println("Input the value:");
		float val5=ob.nextFloat();
		System.out.println("output="+val5);
		
		//double
		System.out.println("Input the value:");
		double val6=ob.nextDouble();
		System.out.println("input="+val6);
		
		//long
		System.out.println("Input the value:");
		double val7=ob.nextLong();
		System.out.println("output="+val7);
	}
}