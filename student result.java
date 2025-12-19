import java.util.Scanner;
class practice5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String  name=sc,nextLine();
		System.out.println("Enter Roll Number");
		int rollno=sc.nextInt();
		
		int[] marks = new int[5];
		int totalmarks = 0;
		
		System.out.println("Enter marks for 5 subkects:");
		for(int i=0;i<5;i++)
		{
			System.out.print("Subject " + (i + 1) + " : ");
			marks[i] = sc.nextInt();
			totalmarks += marks[i];
		}
		double
	}
}