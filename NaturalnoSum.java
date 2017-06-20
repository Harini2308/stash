package myfrstjavaproj;
import java.util.*;
public class NaturalnoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner no=new Scanner(System.in);
		System.out.println("enter a no to find sum");
		int n,sum=0;
		n=no.nextInt();
		if(n > 0)
		{
			sum=n*(n+1)/2;
		}
		else
		{
			System.out.print("Enter a positive no");
		}
		System.out.print(sum);
	}
}
