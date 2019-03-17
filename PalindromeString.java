import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String args[])
	{		
		String strIn, strReverse="";
		System.out.println("========= Welcome to Palindrome String Check ========");
		System.out.print("Enter the String:");
		
		Scanner s = new Scanner(System.in);
		strIn = (s.nextLine()).trim();
		
		for (int i=strIn.length()-1;i>=0;i--)
		{
			strReverse = strReverse.concat(String.valueOf(strIn.charAt(i)));			
		}
		
		if (strIn.equalsIgnoreCase(strReverse))
		{
			System.out.println("This is Palindrome String");
			
		} else {
			System.out.println("This is not Palindrome String");
		}	
		s.close();	
	}
}
