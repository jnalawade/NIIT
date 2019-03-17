import java.util.Scanner;

public class WordsCount {
	public static void main(String args[])
	{		
		System.out.println("============ Welcome to Text Words Count ================");
		System.out.print("Enter the text:");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine().trim().replaceAll(" +", " ")).split(" ");
				
		System.out.println("Text entered has "+ inputStr.length + " words.");
		s.close();
	}
}