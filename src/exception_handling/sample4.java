package exception_handling;

public class sample4 {

public static void main(String[] args) {
		
		int ar [] =new int[5];
		
		try
		{
			ar[6]=10;    //risky code
		}
		catch(Exception c)     //generic exception
		{
			c.printStackTrace();
			System.out.println("generic Exception handled");
		}	

				
		System.out.println("GN");	
		
		
	}
}
