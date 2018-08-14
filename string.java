import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		char ch;
		int count = 0;
		for (int i =0;i<str.length();i++)
		{
			ch = str.charAt(i);
		   if (Character.isLetter(ch)||Character.isDigit(ch) ||Character.isWhitespace(ch))
		    {
	                }
			else
			  count = count+1;
		}
	System.out.println(count);
	}
}
