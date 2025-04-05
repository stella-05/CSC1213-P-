class Ex4{
	public static void main(String[] args)
	{
		int numbers[]=new int[10];
		numbers[1]=24;
		numbers[2]=67;
		numbers[3]=55;
		numbers[4]=87;
		numbers[5]=55;
		numbers[6]=65;
		numbers[7]=56;
		numbers[8]=78;
		numbers[9]=32;
	for(int i=0;i<numbers.length;i++){
		System.out.println(numbers[i]+"\t");
	}
	System.out.println("***********************");
	int numbers2[]={1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<numbers2.length;i++)
	{
		System.out.println(numbers2[i]+"\t");
	}
	System.out.println("##########################");
	String days[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	for(String day:days)
	{
		System.out.println(day+"\t");
	}
	}
}