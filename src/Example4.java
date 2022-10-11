/*WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
output must be 78, 37, 29, 45, 90, 3*/

import java.util.Scanner;
public class Example4 
{
	public void doReverse(int a[])
	{
		System.out.println("Reverse of the array is:");
		for(int i=a.length-1;i>=0;i--)
		{
			 System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("The elements of the array are:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Example4 e4=new Example4();
		e4.doReverse(a);

	}

}
