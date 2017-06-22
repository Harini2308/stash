package myfrstjavaproj;
import java.util.*;
public class FindMins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1="04:10";
		String time2="05:20";
		StringTokenizer st=new StringTokenizer(time1,":");
		StringTokenizer t=new StringTokenizer(time2,":");
		String hour=st.nextToken();
		String min=st.nextToken();
		String hru=t.nextToken();
		String minu=t.nextToken();
		int hr1,hr2,min1,min2,totalmins=0;
		hr1=Integer.parseInt(hour);
		hr2=Integer.parseInt(hru);
		min1=Integer.parseInt(min);
		min2=Integer.parseInt(minu);
		if(hr1 == hr2)
		{
			if(min1>min2)
			 totalmins=min1-min2;
			else if(min2>min1)
				totalmins=min2-min1;
		}
		else
		{
			hr1=hr1*60+min1;
			hr2=hr2*60+min2;
			if(hr1>hr2)
				 totalmins=hr1-hr2;
		    else if(hr2>hr1)
					totalmins=hr2-hr1;
			
		}
		System.out.println(totalmins);
		
	}

}
