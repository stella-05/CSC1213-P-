class Unaryoperators{
	public static void main(String[] args)
	{
		int a=10;
		int b;
		b=a++;
		int c;
		c= --a;
		boolean isHolyday= false;
		
		
		//Unary Operators
		System.out.println("Unary plus:" +(+a));
		System.out.println("Unary minus:"+(-b)); 
		System.out.println("increment by one:"+(b));
		System.out.println("decrement by one:"+(c));

		System.out.println(!isHolyday);
		
}
}
	