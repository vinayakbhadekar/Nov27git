package variable;

public class sample1 {
public static void main(String[] args) 
{
	
	sample2.m1();
	sample2 v1=new sample2();
	v1.m2();
	m4();
	sample1 v2=new sample1();
	v2.m5();
			
	
String name;
int rollnum;
char grade;
float per;

name="Vinayak";
rollnum=46;
grade='A';
per=90.6f;

System.out.println("Student name: "+name);
System.out.println(rollnum);
System.out.println(grade);
System.out.println(per+"%");
}
public static void m4()
{
	System.out.println("Vinayak Bhadekar");
}
public void m5()	
{
	System.out.println("Ankita");
}
	
	
	
}

