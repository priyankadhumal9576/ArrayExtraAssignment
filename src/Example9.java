import java.util.Arrays;

/*/Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
Here both arrays are equal*/

public class Example9 
{
	public void showEqualOrNot(int a[],int b[])
	{
		boolean flag=Arrays.equals(a, b);
		int i=0;
		if(flag==true)
			System.out.println("Arrays are same");
		else
			System.out.println("Arrays are not  same");

			
		
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {12,22,32, 42, 52, 62};
		int b[]=new int[] {2, 22, 62, 12, 42, 22};
		
		Example9 e9=new Example9();
		e9.showEqualOrNot(a,b);

	}

}
