public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int k = 0; k < n; k++) {
            double term = 1.0 / (2 * k + 1);
            if ((k & 1) == 1) sum -= term;   // שלילי באיברים הזוגיים-לוגית (1,3,5..)
            else               sum += term;   // חיובי באיברים האי-זוגיים
        }
        double approx = 4.0 * sum;

       
        System.out.print("pi according to Java: " + Math.PI + "\n");
        System.out.print("pi, approximated: " + approx + "\n");
    }
}

