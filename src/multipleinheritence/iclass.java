package multipleinheritence;

public class iclass implements I1,I2 
{
	public void m1()
	{
		System.out.println("method m1 completed in in IC");
	}
public void m2()
{
	System.out.println("method m2 completed in IC");
}
public void m3()
{
	System.out.println("method m3 completed in IC");
	
}
public void m4()
{
	System.out.println("method m4 completed in IC");

}
public void m5()
{
	System.out.println("method m5 completed in IC");
	
}
public static void main(String[] args) {
	iclass d1=new iclass ();
	d1.m1();
	d1.m2();
	d1.m3();
	d1.m4();
	d1.m5();
	
}
}
