package generalization;

public class jio implements simcard{
public void sms()
{
	System.out.println("sms : 200");
}
public void videocalling()
{
	System.out.println("limited");
}
public void internet()
{
	System.out.println("unlimited");
}
public static void main(String[] args) {
	airtel a1=new airtel();
	a1.sms();
	a1.videocalling();
	a1.internet();
	System.out.println("------------------------------------------");
	jio j1=new jio();
	j1.sms();
	j1.internet();
	j1.videocalling();
}
}
