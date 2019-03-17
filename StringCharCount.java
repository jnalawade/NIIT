import java.util.Scanner;

public class StringCharCount {
	
	public static void main(String args[])
	{
		int charCount=0;
		System.out.println("============ Welcome to Character Count of String ================");
		System.out.print("Enter the String :");
		
		Scanner s = new Scanner(System.in);
		String inputStr = s.nextLine().trim().replaceAll(" +", " ");
				
		System.out.print("Enter the Char or Word to search :");
		String inputChar = s.nextLine().trim();
		s.close();
		
		if (inputChar.length() > 1)
			System.out.println("Enter single character");
		else
		{
			for (int i=0; i<inputStr.length();i++)
			{
				if (inputChar.equalsIgnoreCase(String.valueOf(inputStr.charAt(i))))
						charCount++;
			}
			
			System.out.println("No of occurances of chararcter "+inputChar+" in input String are "+ charCount);
			
		}			
	}
}