import java.util.Scanner;

public class LinearNumberSearch {
	
	 public static void main(String args[])
	  {
	    int numElements, searchInt, array[];
	    System.out.println("============ Welcome to linear number search ================");
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter number of elements to add in array : ");
	    numElements = s.nextInt();
	    array = new int[numElements];
	 
	    System.out.println("Enter the " + numElements + " integers : ");
	 
	    for (int c = 0; c < numElements; c++)
	      array[c] = s.nextInt();
	 
	    System.out.print("Enter value to search : ");
	    searchInt = s.nextInt();
	   
	    for (int i=0; i<numElements; i++)
	    {
	      if (array[i] == searchInt)     
	      {
	         System.out.println(searchInt + " is present at location " + (i+1) + ".");
	          break;
	      }
	      if (i == (numElements-1))  
		      System.out.println(searchInt + " isn't present in the array.");
	   }
	    s.close();	   
	  }
}
