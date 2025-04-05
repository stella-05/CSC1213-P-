import java.util.Scanner;
class Ex6{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = ob.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.print("enter the element"+(i+1)+":");
			numbers[i]=ob.nextInt();
		}
		System.out.println();
		System.out.println("elements of the array:");
		for(int number:numbers){
			System.out.print(number+"\t");
		}
	}
}
		