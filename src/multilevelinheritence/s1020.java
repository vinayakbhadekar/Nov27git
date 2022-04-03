package multilevelinheritence;

public class s1020 extends s789 {
	public void vidcal()
	{
		System.out.println("vidiocalling");
		
	}
	public static void main(String[] args) {
		s1020 a1=new s1020();
		a1.audcal();
		a1.textmsg();
		a1.vidcal();
	}
}
