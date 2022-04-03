package variable;

public class stg1 {
	static int a=10;
	public static void main(String[] args) {
        System.out.println(a);                        // direct use without method
		m15();                                        // from same class with static method
		stg1 c1=new stg1();
		c1.m16();                                     // from same class with non static method
		System.out.println(stg2.c);                   // from diff.class direct use without method
		
	}
	public static void m15()
	{
		System.out.println(a);
	}
	public void m16()
	{
		System.out.println(a);
	}

}
