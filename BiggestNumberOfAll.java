import java.util.Scanner;

public class BiggestNumberOfAll {
	
	public static void main(String args[])
	{
		int bigNum=0,inNum;
		System.out.println("============ Welcome to Biggest of Numbers ================");
		System.out.print("Enter the multiple numbers (Comma separated):");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine()).split(",");
				
		if (inputStr.length < 2)
		{
			System.out.println("ERROR : Please enter min two comma separated Integer numbers.");			
		} else {
		
			for (int i=0; i<inputStr.length; i++)
			{
				inNum = Integer.parseInt(inputStr[i].trim());
				if (bigNum < inNum)
					bigNum = inNum;
			}		
			
			System.out.println("Biggest of all the Numbers is = "+ bigNum);
		}
		s.close();
	}

}
