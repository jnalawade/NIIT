import java.util.Scanner;

public class ArrayInsertNumber {
	
	 public static void main(String args[])
	  {
	    int numElements, inInt, pos, array[];
	    
	    System.out.println("============ Welcome to Array Insert Number ================");
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter number of elements to add in array : ");
	    numElements = s.nextInt();
	    array = new int[numElements+1];
	 
	    System.out.println("Enter the " + numElements + " integers : ");
	 
	    for (int c = 0; c < numElements; c++)
	      array[c] = s.nextInt();
	    
	    System.out.print("Enter the position where you want to insert element : ");
        pos = s.nextInt();
        System.out.print("Enter the element you want to insert : ");
        inInt = s.nextInt();
        
        for(int i = (numElements-1); i >= (pos-1); i--)
        {
        	array[i+1] = array[i];
        }
        
        array[pos-1] = inInt;
        System.out.print("Array after inserting : ");
        
        for(int i = 0; i < numElements; i++)
        {
            System.out.print(array[i]+",");
        }
        System.out.print(array[numElements]);
	 
	    s.close();	   
	  }
}
