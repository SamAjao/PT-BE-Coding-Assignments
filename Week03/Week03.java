package Week03;

public class Week03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(4,2));

	}
	
	public static int power(int base, int exponent) {
		int result = 1;
		
		for(int i = 1; i<= exponent; i++) {
			result *= base;
		}
		
		return result;
	}

}
