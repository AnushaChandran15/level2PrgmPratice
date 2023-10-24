package arrayprograms;
import java.util.Arrays;
import java.util.Scanner;

public class GrandChildrenCounting {
	private static String getSonName(String[][] arr,String name)
	{
		for(int i=0;i<4;i++)
		{
			if(arr[i][1].equals(name))
			      return arr[i][0];
		}
		return null;
	}
	private static int grandChildrenCount(String[][] arr,String sonName)
	{
		int count=0;
		for(int j=0;j<4;j++)
		{
			if(arr[j][1].equals(sonName))
				count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String[][] familyMembers=new String[4][];
		System.out.println("Enter the Son and Father Name(son,father)");
		for(int i=0;i<4;i++)
		{
			familyMembers[i]=scan.nextLine().split(",");
		}
		System.out.print("Enter a Father name: ");
		String fatherName=scan.nextLine();
		scan.close();
		System.out.println("Input:");
		System.out.println(Arrays.deepToString(familyMembers));
		String sonName= getSonName(familyMembers,fatherName);
		int grandChildCount=0;
		if(sonName!=null)
		{
			grandChildCount=grandChildrenCount(familyMembers,sonName);
		}
		System.out.println("Number of GrandChildren "+fatherName+" has is "+grandChildCount);

	}

}
