package constructor;                                    // constructor overloading

public class sample225 {
	int num1;
	int num2;
	String sname;
	sample225()                                // user defined and without parameter const.
	{
		num1=10;
		num2=20;
	}
	sample225(int e, int f)                     // user defined and with parameter const.
	{
		num1=e;
		num2=f;
		
	}
	sample225(String name)
	{
		sname=name;
	}
	public void ad()
	{
		System.out.println(num1+num2);
	}
	public void student()
	{
		System.out.println(sname);
	}
	public static void main(String[] args) {
		sample225 a34=new sample225(40,35);            // user defined and with parameter const.
		a34.ad();
		sample225 a35=new sample225("vinayak");         // user defined and with parameter const.(String)
		a35.student();
		sample225 a36=new sample225();                   // user defined and without parameter const.
		a36.ad();
	}
}
