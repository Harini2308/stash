package myfrstjavaproj;
import java.util.*;
public class Largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		System.out.println("Enter 3 numbers to find biggest among them:");
		int h,a,r;
		h=t.nextInt();
		a=t.nextInt();
		r=t.nextInt();
		int large;
		large=h;
		if(a > large)
		{
			large=a;
		}
		else if(r > large)
			{
				large=r;
			}
		
		System.out.println("largest no is:"+large);
	}

}
