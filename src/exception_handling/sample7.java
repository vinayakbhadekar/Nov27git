package exception_handling;

public class sample7 {

	public static void main(String[] args) {
		
		try                       //outer try block
		{
			
			try                        //inner/nested try block
			{
				  //risky code 1				
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			
			//risky code 2
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		System.out.println();
				
	}

}
