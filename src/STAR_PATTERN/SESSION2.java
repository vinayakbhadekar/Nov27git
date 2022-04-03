package STAR_PATTERN;

public class SESSION2 {
	public static void main(String[] args) {
		int star=1;
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
				System.out.print("*");
			System.out.println();
			star++;
		}
		System.out.println("---------------------");
		
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			
		}
		System.out.println("-----------------");
		
		
	    for(int k=1;k<=5;k++)
	    {
	    	for (int l=k;l>=1;l--)
	    		System.out.print("*");
	    	System.out.println();
	    	
	    }
	    
	}
	

	
}
