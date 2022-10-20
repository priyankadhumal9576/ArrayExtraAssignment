import java.util.Scanner;

public class SecondMax
{

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
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			int max=a[0];
			if(a[i]>a[0])
			{
				max=a[i];
			}
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				

			}
			System.out.println(a[a.length-2]+"\n"+max);
		}
		
	}

}
