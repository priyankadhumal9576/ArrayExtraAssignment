import java.util.Scanner;

/*Write a Java program to find a missing number in an array. Means e.g. array has 1 
to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5*/

public class Example10
{
	public void findMissing(int a[])
	{
		int size = 0;
		int sumOfArray=0;
		int sumOfAllArray=(size*(size+1))/2;
		for(int i=0;i<(a.length-1);i++)
		{
			sumOfArray=sumOfArray+a[i];
		}
		int missingNumber=sumOfAllArray-sumOfArray;
		
		System.out.println("The missing number is:"+missingNumber);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter (size-1) elements");
		for(int i=0;i<(size-1);i++)
		{
			a[i]=sc.nextInt();
		
	   }
		Example10 e10=new Example10();
		e10.findMissing(a);


	}
}
	
