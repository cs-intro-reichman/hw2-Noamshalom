public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);

        double sum = 1.0;
        double odd = 3.0;      
        for (int i = 2; i <= terms; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / odd;
            } else {
                sum += 1.0 / odd;
            }
            odd += 2.0;
        }
        double result = sum * 4.0;

      
        String sPi = Double.toString(Math.PI);
        System.out.println("pi according to Java: " + sPi);

     
        String sApprox = Double.toString(result);
        int pad = Math.max(0, sPi.length() - sApprox.length());
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < pad; i++) spaces.append(' ');
        System.out.println("pi, approximated: " + spaces + sApprox);
    }
}
