/*Write a Java program to find the common elements between two arrays (int values) 
Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
66, 22], so common between two arrays are 23 and 91*/

import java.util.Scanner;
public class Example7 
{
	public void commonElements(int a[],int a1[])
	{
		//System.out.println("common elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a[i]==a1[j])
				{
			   System.out.print(a[i]+" Are common elements");
				break;
				}
			}
		}
		
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
		
		System.out.println("The elements of the array1 are:");
		int size1=sc.nextInt();
		int a1[]=new int[size1];
		System.out.println("The elements of the array2 are:");
		for(int i=0;i<a.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		Example7 e7=new Example7();
		e7.commonElements(a, a1);


	}

}
