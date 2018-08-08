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
		char ch;
		Scanner reader=new Scanner(System.in);
		ch=reader.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("vowels");
		else
			System.out.println("constant");
	
	}
}
