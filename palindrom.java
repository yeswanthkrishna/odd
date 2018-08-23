/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,sum=0,temp;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		n=temp;
		if(sum==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
