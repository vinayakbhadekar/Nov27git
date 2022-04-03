package String_class;

public class sample {
	public static void main(String[] args) {
		String s1="Vinayak";
		String s2="ANKITA";
		String s3="";
		String s4="ankita";
		String s5="My name is vinayak";
		String s6="java class";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s5.contains("My"));
		System.out.println(s1.contains("ak"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('k'));
		System.out.println(s5.startsWith("My"));
		System.out.println(s5.endsWith("vinayak"));
		System.out.println(s6.replace("java","selenium"));
		System.out.println(s6);
		s6=s6.replace("java","selenium");
		System.out.println(s6);
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1, 3));
		System.out.println(s2+"  "+s4+"  "+ s6 );
		System.out.println(s2.concat(s4));
	    String ae[]=s5.split(" ");
	    System.out.println(ae[2]);
	}

}
