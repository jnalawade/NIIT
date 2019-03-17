import java.util.Scanner;

public class BiggestNumberOfThree {
	
	public static void main(String args[])
	{
		int bigNum=0,inNum;
		System.out.println("============ Welcome to Biggest of Three Integer Numbers ================");
		System.out.print("Enter three numbers (Comma separated):");
		
		Scanner s = new Scanner(System.in);
		String inputStr[] = (s.nextLine()).split(",");
				
		if (inputStr.length != 3)
		{
			System.out.println("ERROR : Please enter only Three comma separated Integer numbers.");			
		} else {
		
			for (int i=0; i<inputStr.length; i++)
			{
				inNum = Integer.parseInt(inputStr[i].trim());
				if (bigNum < inNum)
					bigNum = inNum;
			}		
			
			System.out.println("Biggest of Three Numbers is = "+ bigNum);
		}
		s.close();
	}

}
