package myfrstjavaproj;
import java.util.*;
public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=t.nextInt();
		int rem=0,rev=0;
		try
		{
		while(no!=0)
		{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("not a number!);
		}
		System.out.println(rev);
	}

}
