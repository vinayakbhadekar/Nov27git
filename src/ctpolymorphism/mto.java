package ctpolymorphism;

public class mto {
	public void k12(int a ,int b)
	{
		System.out.println(a/b);
	}
	public void k12(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
public static void main(String[] args) {
	mto w23=new mto();
	w23.k12(20,20);
	w23.k12(10, 20, 30);
	
}
}
