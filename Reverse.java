import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		String text;
		System.out.println("===========Welcome to Reverse String ==========");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the text to be reversed : ");
		text = (s.nextLine()).trim();
		System.out.print("Reversed String :=> ");
		
		for (int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
		}
		s.close();
	}	
}
