package use_of_static_nonstatic;

public class s456 {
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.empName="Rahul";
		e1.empID=100;
		//e1.empCEOName="abc";
		Emp.empCEOName="abc";
		
		
		Emp e2=new Emp();
		e2.empName="ganesh";
		e2.empID = 101;
		//e2.empCEOName = "abc";
		Emp.empCEOName="abc";
		
		Emp e3=new Emp();
		e3.empName="Pooja";
		e3.empID = 102;
		//e3.empCEOName="xyz";
		Emp.empCEOName="xyz";
		
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();
			
	
	}

}
