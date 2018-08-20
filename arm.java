/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,re,c,sum=0,t;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
	            t = n;
		while(n>0)
		{
			re=n%10;
			c=re*re*re;
			sum=sum+c;
			n=n/10;
		}
		if(t==sum)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
