package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElements {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Array length");
		int arrLength=scan.nextInt();
		int[] array=new int[arrLength];
		for(int i=0;i<arrLength;i++)
		{
			System.out.println("Index Of "+i);
			array[i]=scan.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(array));
System.out.println(Arrays.toString(rearrangeArray(array,arrLength)));
	}
	private static int[] rearrangeArray(int[] array,int arrLength)
	{	Arrays.sort(array);
		int[] result=new int[arrLength];
		int even=(arrLength%2==0)?(arrLength/2)-1:(arrLength/2);
		int odd=even+1 ;
		for(int i=0;i<arrLength;i++)
		{
			if(i%2==0)
				result[i]=array[even--];
			else
				result[i]=array[odd++];
		}
		return result;
	}

}
