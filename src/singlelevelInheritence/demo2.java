package singlelevelInheritence;

public class demo2 extends demo1{
	
	public void m3()
	{
		System.out.println("tata nexon");
	}
	public void m4()
	{
		System.out.println("suzuki kia");
	}

	public static void main(String[] args) {
		
		demo2 s1=new demo2();
		s1.m1();
		s1.m2();
		s1.m3();
		s1.m4();
		
		
	}
	
	
}
