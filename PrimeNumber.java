import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[])
	{		
		int num;
		System.out.println("========= Welcome to Prime Number Check ========");
		System.out.print("Enter the Number:");
		
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if( num < 2)
		{
			System.out.print("Enter the Number greater than 1");
		} else {
		
			for (int i=2; i <= num; i++)
			{
				if (i < num && num%i == 0)
				{
					System.out.println("This is not a Prime Number");
					break;
				} else if (i == num) {
					System.out.println("This is a Prime Number");
				}
				
			}
		}
		s.close();
	}
}
