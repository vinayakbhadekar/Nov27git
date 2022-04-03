package array;

public class multidimensionalarray {

	public static void main(String[] args) {
		int ar[][]= {{5,10,15,40},{25,30,35,42}};
		
		System.out.println(ar[0][2]);
		
		for(int i=0;i<=ar.length-1;i++)                      // outer loop for rows
		{
			for (int j=0;j<=3;j++)                           // inner loop for columns
			
			System.out.print(ar[i][j]+" ");
			
			System.out.println();
			
		}
		System.out.println(" ==================");
		
		int ag[][]=new int[3][3];                           // [rows] [columns]
		ag[0][0]=10;
		ag[0][1]=20;
		ag[0][2]=40;
		ag[1][0]=78;
		ag[1][1]=56;
		ag[1][2]=47;
		ag[2][0]=88;
		ag[2][1]=66;
		ag[2][2]=77;
		
		
		
		System.out.println(ag[1][1]);
		
		for (int k=0;k<=2;k++)
		{
			for (int d=0;d<=2;d++)
			System.out.print(ag[k][d]+ " ");
			System.out.println();
		}
		
		
		
		
	}
	
	
	
	
	
	
}
