package control_statement;

public class nestedif1 {
	public static void main(String[] args) {
		
	
	int height=7;
    int chest=75;
    if (height>=6)
    {
    	System.out.println("your height is > 6");
    	if (chest>=60)
    		System.out.println("you are eligible for army training");
    	else
    		System.out.println("you are not eligible chest < 60");
    	
    }
    else
    {
    	System.out.println("you are not elgible height < 6");
    }
	}
}
