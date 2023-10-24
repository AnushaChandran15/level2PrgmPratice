package arrayprograms;

import java.util.Scanner;

public class Xpattern {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a Odd length String");
			String input=scan.nextLine();
			System.out.println("Input : "+input);
			scan.close();
			if(input.length()%2!=0 && !input.equals(""))
			{
				XpattenPrint(input);
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
	public static void XpattenPrint(String input)
    {
			for(int i=0;i<input.length();i++)
			{
				for(int j=0;j<input.length();j++)
				{
					if(i==j)
						System.out.print(input.charAt(i));
					else if(i+j==input.length()-1)
						System.out.print(input.charAt(j));
					else
						System.out.print(" ");
				}
				System.out.println();
			}
	}
}
