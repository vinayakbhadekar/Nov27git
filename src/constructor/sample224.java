package constructor;

public class sample224 {
	int a;
	int b;
	sample224(int c,int d)                                    //constructor with parameter
	{
		a=c;
		b=d;
	}
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		sample224 a13=new sample224(14,20);                      //constructor with parameter
		a13.add();
		sample224 a14=new sample224(40,50);                      //constructor with parameter reuse
		a14.add();
	}

}
