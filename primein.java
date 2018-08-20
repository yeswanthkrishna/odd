/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j,a,b,count=0;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		for(i=a+1;i<b;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i % j == 0)
				{
					count+=1;
				}
					
			}
			if(count==2)
					System.out.print(" "+i);
					count=0;
		}
	}
}
