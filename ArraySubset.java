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
			System.out.print("Array 1 is subset of array2");
		}
		else{
			System.out.println("Array 1 is not subset of array2");
		}
	}
	public static boolean Subset(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					break;
				}
				if(j==a.length)
				return false;
			}
			
		
		}
		return true;
		
	}

}
