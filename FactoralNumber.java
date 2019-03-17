import java.util.Scanner;

public class FactoralNumber {
	
	public static void main(String args[])
	{		
		int num;
		Long fact=1l;
		System.out.println("========= Welcome to Calculate Factoral Number ========");
		System.out.print("Enter the Number:");
		
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if( num < 1)
		{
			System.out.println("Enter the Number greater than 0");
		} else {		
			for (int i=1; i <= num; i++)
			{				
				fact = fact * i;
			}
			System.out.println("Factoral of "+num+" is "+ fact);
		}
		s.close();
	}
}
