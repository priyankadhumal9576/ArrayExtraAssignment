import java.util.Scanner;

/*WAP to check if an array of integers contains two specified elements 65 and 77.*/

public class Example13 
{
	public void check(int a[])
	{
		int find=77;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int n=0;
			if(n==find)
			{
				flag= true;
				break;
			}
		}
		if(flag)
			System.out.println(find+"is find");
		else
			System.out.println(find+"is find");
		
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
		Example13 e13=new Example13 ();
		e13.check(a);
	 	
	}

}
