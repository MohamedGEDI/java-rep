import java.util.Scanner;	

public class Array2
{

	public static void main (String[] args)
	{
		
		int i, v;
		int count = 0;
		Scanner kb = new Scanner(System.in);

		// create two arrays of 10 integers 
		int[] ar1 = new int[10];
      int[] ar2 = new int[10];
		
		
		// initialize the first array with some values
		for (i = 0; i < ar1.length; i++)
		{
			ar1[i] = i * 2;	
		}
		
		
		// Now copy the ar1 to ar2
      /* Notice that we assume here that the arrays are of similar size
       if not what would happen? */
		for (i = 0; i < ar1.length; i++)	 									
		{									 
			ar2[i] = ar1[i];		
		}
		
		// Show the contents of the arrays
		System.out.println("Here are the values in the array ar1: ");
		for (i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println("\nHere are the values in the array ar2: ");
		for (i = 0; i < ar2.length; i++)
		{
			System.out.print(ar2[i] + " ");
		}

	/*	// Now change some of the values of ar2
		ar2[3] = 980;
		ar2[5] = 609;
		ar2[7] = 1200;
      
      System.out.println();
	
		// Show the contents of the arrays again
		System.out.println("\nCurrent values in the array ar1: ");
		for (i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println("\nNew values in the array ar2: ");
		for (i = 0; i < ar2.length; i++)
		{
			System.out.print(ar2[i] + " ");
		}
		kb.close();
	*/	
	}
}