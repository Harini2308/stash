package myfrstjavaproj;
import java.util.*;
import java.lang.*;
import java.io.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.print("Enter a no to check if it is a odd or even no:");
		int no;
		no=n.nextInt();
		if((no % 2) == 0)
		{
			System.out.println("Even no!!");
		}
		else
		{
			System.out.println("Odd no!!");
		}
	}

}
