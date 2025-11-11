public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);

        double sum = 1.0;
        double denom = 3.0;       
        for (int i = 2; i <= terms; i++) {
            if (i % 2 == 0) sum -= 1.0 / denom; 
            else            sum += 1.0 / denom; 
            denom += 2.0;
        }
        double approx = sum * 4.0;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + approx);
    }
}
