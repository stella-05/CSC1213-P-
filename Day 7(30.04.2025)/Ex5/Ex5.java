public class Ex5{
	static int  findMax(int a, int b, int c){
		if(a >= b && a >= c){
			return a;
		}else if(b >= a && b >=c){
			return b;
		}else{
			return c;
		}
	}
	public static void main(String args[]){
		int max = findMax(10, 25, 15);
		System.out.println("Maximum is :"+max);
	}
}