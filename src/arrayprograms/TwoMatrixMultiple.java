package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMatrixMultiple {
	public static void main(String arg[])
	{
		
		int[][] array1=getInputMultiArray();
		int[][] array2=getInputMultiArray();
		int[][] multipleMatrixArray=matrixMultiple(array1,array2);
		System.out.println(Arrays.deepToString(multipleMatrixArray));
	}
	public  static int[][] getInputMultiArray()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Row");
		int row=scan.nextInt();
		System.out.println("Enter a colunm");

		int colunm=scan.nextInt();
		int[][] array=new int[row][colunm];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colunm;j++)
			{
				System.out.println("Index of  : "+i+" "+j);
				array[i][j]=scan.nextInt();
			}
		}
		return array;
	}
	public static int[][] matrixMultiple(int[][] array1,int[][] array2)
	{
		int[][] multipledArray=new int[array1.length][array2[0].length];
			for(int i=0;i<multipledArray.length;i++)
			{
				for(int j=0;j<multipledArray[i].length;j++)
				{
					for(int k=0;k<multipledArray.length;k++)
					{
						multipledArray[i][j]+=array1[i][k]*array2[k][j];
					}
				}
			}
		return multipledArray;
	}
}
