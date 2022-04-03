package use_of_static_nonstatic;

public class Emp {
	String empName;
	int empID;
	//String empCEOName;
	static String empCEOName;
	
	public void empInfo() 
	{
		System.out.println(empName+": "+empID+": "+empCEOName);
	

}
}