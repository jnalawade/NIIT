
public class TableOneToTen {
	
	public static void main(String args[])
	{				
		System.out.println("========== Welcome to the 1 to 10 Tables ==================");
		System.out.println("");
				
		for (int i=0; i<10;i++)
		{
			for (int a=0; a<10; a++)
			System.out.print((a+1)*(i+1) + "\t");
			
			System.out.println("");
		}		
	}
}
