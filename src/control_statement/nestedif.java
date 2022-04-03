package control_statement;

public class nestedif {
	
	public static void main(String[] args) {
		int age = 15;
		int weight=35;
		if (age>=18)
		{
			System.out.println("your are  age is >=18");
			if (weight>=40)
			{
				System.out.println("yo are eligible for blood donation:weight>40");
			}
			else
			{
				System.out.println("not eligible your weight < 40");
			}
		}
			else {
				System.out.println("you are not eligible for blood donation: age<18");
		}
		
	}

	}
