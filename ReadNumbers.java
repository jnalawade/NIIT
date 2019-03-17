import java.util.Scanner;

public class ReadNumbers {
	
	public static void main(String args[])
	{
		int inNum;
		System.out.println("============ Welcome to Read the Numbers ================");
		System.out.print("Enter the multiple numbers (Comma separated):");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine()).split(",");		
		System.out.println("You entered below numbers:"); 
		
		for (int i=0; i<inputStr.length; i++)
		{
			inNum = Integer.parseInt(inputStr[i].trim());
			System.out.println("Number "+(i+1)+" = "+inNum);
		}		
		s.close();
	}
}