package demofor;

import java.util.Scanner;

class into
{
	Scanner ss=new Scanner(System.in);
	void upper()
	{
		String s="this is string";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>96 && c<120)
			{
				c=(char)(c-32);
			}
			System.out.print(c);
		}
		System.out.println();
	}
}
public class Info {
	public static void main(String[] args) {
		into in=new into();
		in.upper();
	}
}