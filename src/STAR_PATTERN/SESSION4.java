package STAR_PATTERN;

public class SESSION4 {

	
	public static void main(String[] args) {
		int star=5;
		for (int k=1;k<=5;k++)
		{
			for(int g=1;g<=star;g++)
				System.out.print("*");
			System.out.println();
			star--;
		}
		int star1=1;
	    for(int k=1;k<=5;k++)
	    {
	    	for (int l=1;l>=star1;l--)
	    		System.out.print("*");
	    	System.out.println();
	    	star1--;
	    }
	}
	
	
}
	
	
	
	
	
	




