package exception_handling;

public class sample3 {

public static void main(String[] args) {
		
		int ar [] =new int[5];
		
		try
		{
			ar[6]=10;    //risky code
		}
		catch(ArithmeticException d)
		{
			System.out.println("Arithmetic Exception handled");
		}	
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}			
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
				
		System.out.println("GN");	
		
		
	}
}
