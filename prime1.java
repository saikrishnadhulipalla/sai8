/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int count = 0;
		 for (int i=a+1;i<b;i++)
		 {
		 	
			for (int j=1;j<=i;j++)
			{
		 	    if ( i % j == 0)
				{
					count+=1;
				}
			 }
			 if ( count == 2)
				System.out.print(i+" ");
			count = 0;	
		 }
		 
	}
}
		 
