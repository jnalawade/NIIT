import java.util.Scanner;

public class Table {
	
	public static void main(String args[])
	{
		int tabNumber;
		
		System.out.println("========== Welcome to the Tables ==================");
		
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter the table number to be printed :");
		tabNumber = s.nextInt();
		
		for (int i=0; i<10;i++)
		{
			System.out.println(tabNumber +" X " + (i+1) +" = " + tabNumber*(i+1));
		}
		s.close();
	}
}
