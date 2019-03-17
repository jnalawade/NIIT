import java.util.Scanner;

public class ArrayDeleteNumberPosition {
	
	 public static void main(String args[])
	  {
	    int numElements, pos=-1, array[], resultArray[];
	    boolean bNumExists = false;
	    
	    System.out.println("============ Welcome to Array Delete Number from Position ================");
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter number of elements to add in array : ");
	    numElements = s.nextInt();
	    array = new int[numElements];
	 
	    System.out.println("Enter the " + numElements + " integers : ");
	    for (int c = 0; c < numElements; c++)
	      array[c] = s.nextInt();
	    
	    System.out.print("Enter the position you want to delete : ");
        pos = s.nextInt() - 1;
        
        if (pos <= numElements)
		{
			bNumExists = true;
		}        		
        
        if (bNumExists)
        {
        	System.out.print("Array after deleting position number : ");
        	resultArray = new int[numElements-1];
        	for(int i = 0, a=0; i < numElements; i++)
            {
        		if (i != pos)
        		resultArray[a++] = array[i];
            }
        	
        	for(int i = 0; i < resultArray.length; i++)
            {
                System.out.print(resultArray[i]);
                if (i < resultArray.length - 1)
                	System.out.print(",");
            }
        	
        }
        else 
        {
        	System.out.print("Position to be deleted doesn't exist.\nArray :=> ");
        	for(int i = 0; i < numElements-1; i++)
	        {
	            System.out.print(array[i]+",");
	        }
	        System.out.print(array[numElements-1]);
        }	 
	    s.close();	   
	  }
}
