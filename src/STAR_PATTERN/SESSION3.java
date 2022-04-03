package STAR_PATTERN;

public class SESSION3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=5;
		for (int k=1;k<=5;k++)
		{
			for(int g=1;g<=star;g++)
				System.out.print("*");
			System.out.println();
			star--;
		}
         System.out.println("---------------------");
		
		for (int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		
		
	}
}
