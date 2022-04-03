package Up_casting;

public class practice2 extends practice1{

	public void laptop() 
	{
		System.out.println("laptop: hp");
	}
	
	public void car()    //override
	{
		System.out.println("car: BMW");
	}
	
	public void money()    //override
	{
		System.out.println("money: 2L");
	}
	
	//public void home() 	{
	//	System.out.println("home: 2 bhk");
//}

	public static void main(String[] args) {
		
		//create object of sub class with reference(data type) of super class
		
	practice1	d=new practice2();    //up casting in java
		d.car();
		d.money();
		d.home();
	
		
	}
}
