//WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23
public class Example3 
{
	public void findMinimum(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		System.out.println(a[1]+" ");
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {-20, 0, -25, 15, 19, 37, 23};
		Example3 e3=new Example3 ();
		e3.findMinimum(a);

	}

}
