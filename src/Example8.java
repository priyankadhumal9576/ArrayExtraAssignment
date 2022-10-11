import java.util.Arrays;
import java.util.Scanner;

/*WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
0, 2, 4]*/

public class Example8
{
	public void swapArray(int a[])
	{
		int n=2;                            //denoting how many times you want swapping;
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=a[a.length-1];
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			
			a[0]=last;
			System.out.println("Elements after swap:"+"\n"+Arrays.toString(a));		
			//System.out.println("Arraya after rotation"+a[i]);
			
		}
		
	}

	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements before swapping"+Arrays.toString(a));
		Example8 e8=new Example8();
		e8.swapArray(a);
	}
}
