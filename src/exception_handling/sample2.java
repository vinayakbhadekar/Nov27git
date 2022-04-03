package exception_handling;

public class sample2 {

	public static void main(String[] args) {
		
		int ar [] =new int[5];
		
		try
		{
			ar[6]=10;    //risky code
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		
		
		System.out.println("GN");
			
	}
}
