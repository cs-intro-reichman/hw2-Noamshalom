// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int terms = Integer.parseInt(args[0]);
		Double sum = 1.0;
		Double even = 3.0;
		Double prime = 5.0;
		for(int i=2; i<=terms; i++){
			if (i%2==0) {
				sum = sum - (1/even);
				even = even + 4;
			} else{
				sum = sum + (1/prime);
				prime = prime + 4;
			}

		}
		double result = sum*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + result);
	}
}
