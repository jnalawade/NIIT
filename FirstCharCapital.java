import java.util.Scanner;

public class FirstCharCapital {
	public static void main(String args[])
	{		
		System.out.println("============ Welcome to First Chat Capital of String ================");
		System.out.print("Enter the String :");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine().trim().replaceAll(" +", " ")).split(" ");
				
		System.out.print("Output String :");
		
		for (int i=0; i < inputStr.length; i++ )
		{
			System.out.print(Character.toUpperCase(inputStr[i].charAt(0))+inputStr[i].substring(1));
			if (i<inputStr.length-1)
			System.out.print(" ");
		}
		s.close();		
	}
}