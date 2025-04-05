import java.util.Scanner;
class Ex5{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array:");
		int size =sc.nextInt();
		
		int num1[] = new int[size];
		
		// taking input from the user
		for(int i= 0; i<num1.length;i++ ){
			System.out.print("Enter the element"+(i+1)+":");
			num1[i]=sc.nextInt();
		}
		
		//printing array elements
		System.out.print("\narray element:");
		for(int i=0; i<num1.length;i++){
			System.out.print(num1[i]+"\t");
		}
		// logic for max,min,sum,avg
		int max=num1[0]=45;
		int min=num1[0]=45;
		int sum=0;
		double average;
		
		for(int i=0; i<num1.length;i++){
			if(num1[i]<min){
				min=num1[i];
			}
			sum += num1[i];
		}
		average= (double) sum/num1.length;
		
		// display results
		System.out.println("n\\nmaximum element:"+max);
		System.out.println("minimum element:"+min);
		System.out.println("summation:"+sum);
		System.out.println("average:"+average);
		
     //search an element in the array
	 System.out.print("\nEnetr the element you want to search:");
	 int searchElement =sc.nextInt();
	 boolean found=false;
	 
	 for(int i=0; i<num1.length;i++){
		 if(num1[i]==searchElement){
			 System.out.println("element found at position"+(i+1));
			 found = true;
			 break;
		 }
	 }
	 if(!found ){
		 System.out.println("Elements not found.");
	 }
	 //check if all elements are unique
	 boolean isUnique=true;
	 for(int i=0;i<num1.length;i++){
		 for(int j=i+1;j<num1.length;j++){
			 if(num1[i]==num1[j]){
				 
				 isUnique=false;
				 break;
			 }
		 }
		 if(!isUnique){
			 break;
		 }
	 }
	 if(isUnique){
		 System.out.println("All elements are unique.");
	 }
	else{
		System.out.println("Not Unique-duplicate elements exist.");
	}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		