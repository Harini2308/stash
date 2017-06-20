package myfrstjavaproj;
import java.util.*;
public class IsAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a character:");
		char alpha;
		alpha=a.next().charAt(0);
		if(Character.isLetter(alpha))
		{
			System.out.println("Given character is an alphabet!");
		}
		else
		{
			System.out.println("Not a alphabet");
		}
		
	}

}
