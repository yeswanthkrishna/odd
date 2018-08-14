/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int exponent,basic,a=1;
		Scanner scan=new Scanner(System.in);
		basic=scan.nextInt();
		exponent=scan.nextInt();
		while(exponent>0)
		{
			a=a*basic;
			exponent--;
			
		}
		System.out.println(a);
	}
}
