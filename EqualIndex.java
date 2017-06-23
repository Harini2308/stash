package myjavaprog;

import java.util.Scanner;

public class EqualIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner l=new Scanner(System.in);
	System.out.println("enter the range");
	int n=l.nextInt();
	int s[]=new int[n];
	System.out.print("enter the array elements in sorted order");
	for(int i=0;i<n;i++)
	{
		s[i]=l.nextInt();
	}
	equalIndex(s);
	}
	public static void equalIndex(int[] s)
	{
	for(int i=0;i<s.length;i++)
	{
		if(s[i]==i)
		{
			System.out.println("value same as index is:"+i+"!");
		}
	}
	}

}
