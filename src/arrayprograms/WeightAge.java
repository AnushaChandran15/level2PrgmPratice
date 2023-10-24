package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class WeightAge {
	//static int sumOfWeight=0;
	public static void main(String[] args)
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Array length");
		int arrLength=scan.nextInt();
		int[] weightArr=new int[arrLength];
		for(int i=0;i<arrLength;i++)
		{
			System.out.print("Enter a weight Index of :"+i);
			weightArr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(Arrays.toString(weightArr));
		int[] sumOfWeightArr=new int[arrLength];
		for(int i=0;i<arrLength;i++)
		{
			int sum=0;
			sum+=isPerfectSquare(weightArr[i]);
			sum+=isMultipleOf4AndDivisibleBy6(weightArr[i]);
			sum+=isEvenNumber(weightArr[i]);
			sumOfWeightArr[i]=sum;
		}
		weightInDescendingOrder(weightArr,sumOfWeightArr);
		print(weightArr,sumOfWeightArr);
	}
	public static int isPerfectSquare(int weight)
	{
		double sqrt=Math.sqrt(weight);
		if((sqrt-Math.floor(sqrt))==0)
		{
			return 5;
		}
		return 0;
	}
	private static int isMultipleOf4AndDivisibleBy6(int weight)
	{
		if(weight%4==0 && weight%6==0)
		{
			return 4;
		}
		return 0;
	}
	public static int isEvenNumber(int weight)
	{
		if(weight%2==0)
		{
			return 3;
		}
		return 0;
	}
	private static void weightInDescendingOrder(int[] weightArr,int[] sumOfWeightArr)
	{
		//Bubble sort 
		for(int i=0;i<weightArr.length-1;i++)
		{
			for(int j=0;j<weightArr.length-1-i;j++)
			{
				if(sumOfWeightArr[j]<=sumOfWeightArr[j+1])
				{
					int temp=sumOfWeightArr[j];
					sumOfWeightArr[j]=sumOfWeightArr[j+1];
					sumOfWeightArr[j+1]=temp;
					temp=weightArr[j];
					weightArr[j]=weightArr[j+1];
					weightArr[j+1]=temp;
				}
			}
		}
	}
	private static void print(int[] weightArr,int[] sumOfWeightArr)
	{
		for(int i=0;i<weightArr.length;i++)
		System.out.print("<"+weightArr[i]+" , "+sumOfWeightArr[i]+">");
	}
}
