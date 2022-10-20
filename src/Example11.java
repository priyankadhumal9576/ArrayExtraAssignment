import java.util.Arrays;
import java.util.Scanner;

/*WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
54, 34, 10, 0, 34] */

public class Example11 
{
	public void replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Example11 e11=new Example11 ();
		e11.replace(a);
		

	}

}
