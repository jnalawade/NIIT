import java.util.Scanner;

public class PrimeNumbersInRange {
	
	public static void main(String args[])
	{		
		int num, num1, num2;
		System.out.println("========= Welcome to Display Prime Numbers in Range ========");
		System.out.print("Enter the Range (Two comma separated numbers):");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine()).split(",");
		num1=Integer.valueOf(inputStr[0].trim());
		num2=Integer.valueOf(inputStr[1].trim());
		
		if (num1 > num2)
		{
		  int tmpNum = num1;
		  num1 = num2;
		  num2 = tmpNum;
		}
		
		if( num1 < 2 || num2 < 2)
		{
			System.out.print("Enter the Numbers greater than 1");
		} else {
		
			for (int a=num1; a<=num2; a++)
			{
				num = a;
				for (int i=2; i <= num; i++)
				{
					if (i < num && num%i == 0)
					{						
						break;
					} else if (i == num) {
						System.out.println(num);
					}
					
				}
			}
		}
		s.close();
	}
}
