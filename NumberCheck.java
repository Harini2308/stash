package myfrstjavaproj;
import java.util.*;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=s.nextInt();
		if(no > 0)
		{
			System.out.println("Positive No!!");
		}
		else if(no < 0)
		{
			System.out.println("Negative No!!");
		}
		else if(no == 0)
		{
			System.out.println("Zero!");
		}
	}

}
