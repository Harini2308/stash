package myfrstjavaproj;
import java.util.*;
public class sumusingloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner no=new Scanner(System.in);
		System.out.println("enter a no to find sum");
		int n,sum=0;
		n=no.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.print(sum);
}
}
