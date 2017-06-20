package myfrstjavaproj;
import java.util.*;
import java.lang.*;
import java.io.*;
public class digitcount {
	public static void main(String[] args) {
		
	int numdgits = 0;
	Scanner no=new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=no.nextInt();
	     do
         {
            number = number / 10;
            numdgits++;
         } while (number > 0);
	System.out.println("digit count"+numdgits);	
 }
}
