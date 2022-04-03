package array;

import java.util.Arrays;

public class arraysort {
	
	public static void main(String[] args) {
		int ar []=new int[4];
		ar[0]=10;
		ar[1]=35;
		ar[2]=20;
		ar[3]=40;
		
		int ad[]={10,56,48,89,100};                     //array  with parameter
		System.out.println(ad.length);
		
		for (int i=0; i<=ad.length-1;i++)
			System.out.println(ad[i]);
		
			System.out.println(ar[1]);
			
		for (int i=0;i<=3;i++)
			System.out.println(ar[i]);
		
		System.out.println("             ");
		
		Arrays.sort(ar);                                 // sorting of array
		for (int i=3;i>=0;i--)
			System.out.println(ar[i]);
		
		
	}

}
