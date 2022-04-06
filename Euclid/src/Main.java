
public class Main {
	
	public static void main(String[] args) {
		gcd (15, 10);	
	}
	static void gcd(int m, int n) {
		int r;
		r = m % n;
		while (r!=0) {
			m = n;
			n = r;
			r = m % n;
		}
		System.out.println("GCD is " + n);		
	}
}
