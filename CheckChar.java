package myfrstjavaproj;
import java.util.*;
public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("enter a char to check if it is a vowel or consonant:");
		char t;
		t=c.next().charAt(0);
		if(Character.isLetter(t))
		{
			if(t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U')
			{
				System.out.println("Given character is a vowel!!");
			}
			else
			{
				System.out.println("Given character is a consonant!!");
			}
		}
		else
		{
			System.out.println("Enter  alphabet!Given input is not a alphabet!");
		}
	}

}
