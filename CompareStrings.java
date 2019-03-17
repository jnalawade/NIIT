import java.util.Scanner;

public class CompareStrings {
	
	public static void main(String args[])
	{
		String strIn1, strIn2;
		System.out.println("===========Welcome to Compare Strings ==========");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String 1:");
		strIn1 = (s.nextLine()).trim();
		System.out.print("Enter String 2:");
		strIn2 = (s.nextLine()).trim();
		
		if (strIn1.equalsIgnoreCase(strIn2))
			System.out.println("Both the Strings are Same");
		else 
			System.out.println("Both the Strings are Different");
		s.close();
	}
}
