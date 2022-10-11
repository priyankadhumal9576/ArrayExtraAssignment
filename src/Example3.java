//WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23
public class Example3 
{
	public void findMinimum(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
				min=a[i];
		}
		System.out.println("Minimum number is:"+min);
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {-20, 0, -25, 15, 19, 37, 23};
		Example3 e3=new Example3 ();
		e3.findMinimum(a);

	}

}
