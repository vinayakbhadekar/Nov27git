package variable;

public class nstg1 {
	int a=50;
	
	public static void main(String[] args) {
		nstg1 a1=new nstg1();
	    System.out.println(a1.a);                    // calling from same class without method
	    nstg2 a2=new nstg2();
	    System.out.println(a2.d);                    // calling from diff.class without method
	    e17();                                       // by calling static method
	    a1.e18();                                   // by calling non static method
	}
	
	
		public static void e17()
		{
			nstg1 a3=new nstg1();
			System.out.println(a3.a);                 
		}
		public void e18()
		{
			System.out.println(a);
		}

	
	
	
	}


