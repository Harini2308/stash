package myfrstjavaproj;
import java.util.*;
public class LeapYr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a year");
		int yr=s.nextInt();
		if((yr % 4) == 0)
		{
			System.out.println("Given year is a leap year!");
		}
		else
		{
			System.out.println("Not a leap year");
		}
}
}
