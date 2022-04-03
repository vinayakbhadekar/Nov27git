package exception_handling;

public class sample5 {

public static void main(String[] args) {
		
		int ar [] =new int[5];
		
		try
		{
			ar[6]=10;    //risky code
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}		
		catch(Exception d)     //generic exception
		{
			d.printStackTrace();
			System.out.println("generic Exception handled");
		}	

				
		System.out.println("GN");	
		
		
	}
}
