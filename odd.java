/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class evenodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
		Scanner reader=new Scanner(System.in);
		num=reader.nextInt();
		if(num%2==0)
		System.out.println(num + "even");
		else
		System.out.println(num +"odd");
	}
}
