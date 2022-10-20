/*WAP to reverse the array itself, don’t print array in reverse – I want current array 
reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
37, 29, 45, 90, 3] by using temporary array. */
import java .util.Scanner;
public class Example5 
{
	public void doReverseUsingTemp(int a[],int n)
	{                                                     
		int b[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=a[i];
			j=j-1;
		}
		System.out.println("Reversed array is:");
		for(int k=0;k<n;k++)
		{
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Example5 e5=new Example5 ();
		e5.doReverseUsingTemp(a, size);

	}

}
