package myjavaprog;
import java.util.*;
public class FirstRepeat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter the range!:");
		int n=a.nextInt();
		int flag=0;
		int sid[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			sid[i]=a.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(sid[i] == sid[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(sid[i]);
				break;
			}
		}
	}

}
