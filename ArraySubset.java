package myjavaprog;
import java.util.*;
public class ArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		System.out.println("enter array1 range:");
		int n=t.nextInt();
		int a[]=new int[n];
		System.out.println("enter array2 range:");
		int m=t.nextInt();
		int b[]=new int[m];
		int flag=0;
		System.out.println("Enter the array1:");
		for(int i=0;i<n;i++)
		{
			a[i]=t.nextInt();
		}
		System.out.println("enter the array2:");
		for(int i=0;i<m;i++)
		{
			b[i]=t.nextInt();
		}
		if(Subset(a,b))
		{
			System.out.print("Array 2 is subset of array1");
		}
		else{
			System.out.println("Array2 is not subset of array1");
		}
	}
	public static boolean Subset(int[] a,int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					break;
				}
				if(j==b.length)
				return false;
			}
			
		
		}
		return true;
		
	}

}
