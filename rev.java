import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner inp=new Scanner(System.in);
		int t;
		t=inp.nextInt();
		while(t-->0)
		{
			String s;
			inp.nextLine();
			s=inp.nextLine();
			int i,len=s.length();
			for(i=len-1;i>=0;i--)
				System.out.print(s.charAt(i));
			System.out.print("\n");
		}
		
	}
}
