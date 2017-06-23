package myjavaprog;
import java.util.*;
//import java.util.Arrays;
import java.lang.*;
public class uniqueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int flag=0;
		System.out.println("enter the array range!");
		int len=n.nextInt();
		int arr[]=new int[len];
		System.out.println("enter a array with integers that appear exactly twice");
		for(int i=0;i<len;i++)
		{
			arr[i]=n.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]);
		}
		int res=0;
		for (int aa1 :arr)
			res^=aa1;
		System.out.println("\n\n"+res);
			}
		
	}


