import java.util.Scanner;

//WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]

public class Example2
{
	public void findSeSecondMin(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The second maximum number is:"+a[(a.length-2)]);
	}

	public static void main(String[] args)
	{
		int a[]=new int[] {20, 0, 31, 45, 100, 1, 105, 90};
		Example2 e2=new Example2();
		e2.findSeSecondMin(a);
		
	}

}
