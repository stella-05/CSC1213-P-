public class Ex6{
	static int  sum(int a, int b){
		return a+b;
	}
	static double sum( double a, double b){
		return a+b;
	}
	public static void main(String args[]){
		int intResult = sum(4,6);
		double doubleResult = sum(3.5,2.5);
		System.out.println("sum(int) :" +intResult);
		System.out.println("sum(double) :" +doubleResult);
	}
}