package array;

public class practice {
	public static void main(String[] args) {
		
		int ah[][]=new int[4][3];                           // [rows] [columns]
		ah[0][0]=10;
		ah[0][1]=20;
		ah[0][2]=40;
	
		ah[1][0]=78;
		ah[1][1]=56;
		ah[1][2]=47;
	
		ah[2][0]=88;
		ah[2][1]=66;
		ah[2][2]=77;
	
		ah[3][0]=112;
		ah[3][1]=115;
		ah[3][2]=150;
	
		
		for (int k=0;k<=ah.length-1;k++)
		{
			for (int d=0;d<=2;d++)
			System.out.print(ah[k][d]+ " ");
			System.out.println();
		}
		
		
		
	}

}
