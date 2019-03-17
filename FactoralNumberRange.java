import java.util.Scanner;

public class FactoralNumberRange {
	
	public static void main(String args[])
	{		
		int num1,num2;
		Long fact=1l;
		System.out.println("========= Welcome to Calculate Factoral Number of Range ========");
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
		
		if( num1 < 1 || num2 < 1)
		{
			System.out.println("Enter the Number greater than 0");
		} else {	
			for (int a=num1; a<=num2; a++)
			{
				fact = 1l;
				for (int i=1; i <= a; i++)
				{				
					fact = fact * i;
				}
				System.out.println("Factoral of "+a+" = "+ fact);
			}
		}
		s.close();
	}
}
