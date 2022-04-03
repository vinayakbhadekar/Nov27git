package exception_handling;

public class sample1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		
		int c=0;       //  10/0 
		
		
		try
		{
			c=a/b;      // 10/0 =5       //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmatic exception handled");
			c=a/1;    //10/1    =10
		}
		
		
		System.out.println(c);      //5
			
		System.out.println("Hi...");
		System.out.println("Hello...");
	}
	}

