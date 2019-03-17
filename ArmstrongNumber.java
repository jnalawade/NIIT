import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String args[])
	{		
		int numLen, subSum, sumNum, totalSum=0;		
		String numIn;
		System.out.println("========= Welcome to Armstrong Number Check ========");
		System.out.print("Enter the Number:");
		
		Scanner s = new Scanner(System.in);
		numIn = (s.nextLine()).trim();
		numLen = numIn.length();
				
		for (int i=0;i<numLen;i++)
		{
			sumNum = Integer.parseInt(String.valueOf(numIn.charAt(i)));
			subSum = 1;
			
			for(int a=0; a<numLen;a++)
			{
				subSum = subSum * sumNum;
			}
			totalSum = totalSum + subSum;			
		}
		
		if (Integer.parseInt(numIn) == totalSum)
		{
			System.out.println("This is Armstrong Number");
			
		} else {
			System.out.println("This is not an Armstrong Number");
		}	
		s.close();
			
	}
}
