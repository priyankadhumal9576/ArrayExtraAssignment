//WAP to find  max value in an array.

import java.util.Scanner;
public class Example1 
{
	public void findMaximum(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[0])
				max=a[i];
		}
		System.out.println("The maximum number is: "+max);
		
	}

	public static void main(String[] args) 
	{
		//int a[]=new int[] {20,0,31,45,100,1,105,120,90};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Example1 e=new Example1 ();
		e.findMaximum(a);
	}

}
