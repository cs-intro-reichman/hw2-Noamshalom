public class CalcPi {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        double sign = 1.0;
        int denom = 1;

        for (int i = 0; i < n; i++) {
            sum += sign / denom;
            sign = -sign;
            denom += 2;
        }

        double approx = 4.0 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + approx);
    }
}
