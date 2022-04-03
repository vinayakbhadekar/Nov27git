package array;

public class rev_array {
public static void main(String[] args) {
	
	int ae[]=new int[5];
	ae[0]=10;
	ae[1]=20;
	ae[2]=30;
	ae[3]=45;
	ae[4]=15;
	
	
	for (int i=ae.length-1; i>=0; i--)
		System.out.println(ae[i]);
}
}
