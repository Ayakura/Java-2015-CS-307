package playground;
import java.util.*;

public class Playground {
	
	public static void main(String[] args) {
//hw1		int s = 0;
//		for (int i = 10; i>0; i--)
//		{
//			s = s + i;
//  	}
//		System.out.println(s);
//		int s = 0;
//		int i =10;
//		while (i>0) 
//		{
//			s = s + i;
//			i--;
//			System.out.println(s);
//		}
//hw2.1		ArrayList<String> stringList = new ArrayList<String>(10);
//		Scanner in = new Scanner(System.in);
//		int i = 1;
//		while (stringList.size() < 10)
//		{
//			System.out.print("Enter string number " + i + ": ");
//			String input = in.nextLine();
//			stringList.add(input);
//			i++;
//		}
//		for (int j = stringList.size()-1; j >= 0; j--)
//		 {
//			 System.out.print(stringList.get(j) + " ");
//		 }
//hw2.2		int a[] = {1,2,3,4,5,6,7};
//		int b[] = {1,2,3,4,5,6,7};
//		boolean samesies = true;
//		if (a.length != b.length)
//			{
//				samesies = false;
//			}
//		for (int i=0;i<a.length;i++)
//		{
//			if (a[i]!=b[i])
//		    {
//		    	samesies = false;
//		    }
//		}
//		System.out.println(samesies);
//	}
//}
		double[] values = {2.2,2.3,2.6};
		double sum = 0;
		for (double element : values)
		{
		sum += element;
		}
		System.out.println(sum);
	}
}













