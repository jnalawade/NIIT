import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String args[])
	{		
		String numIn, numReverse="";
		System.out.println("========= Welcome to Palindrome Number Check ========");
		System.out.print("Enter the Number:");
		
		Scanner s = new Scanner(System.in);
		numIn = (s.nextLine()).trim();
		
		for (int i=numIn.length()-1;i>=0;i--)
		{
			numReverse = numReverse.concat(String.valueOf(numIn.charAt(i)));			
		}
		
		if (Integer.parseInt(numIn) == Integer.parseInt(numReverse))
		{
			System.out.println("This is Palindrome Number");
			
		} else {
			System.out.println("This is not Palindrome Number");
		}	
		s.close();	
	}
}
