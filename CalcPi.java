public class CalcPi {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <n>");
            return;
        }

        int n = Integer.parseInt(args[0]); // מספר האיברים בסכום
        double sum = 0.0;
        double sign = 1.0;   // +, -, +, -, ...
        int denom = 1;       // 1, 3, 5, 7, ...

        for (int k = 0; k < n; k++) {
            sum += sign / denom;
            sign = -sign;
            denom += 2;
        }

        double approx = 4.0 * sum;

        // פלט מדויק: 15 ספרות אחרי הנקודה + ריווח כדי ליישר לעמודה
        System.out.printf(java.util.Locale.US, "pi according to Java: %.15f%n", Math.PI);
        System.out.printf(java.util.Locale.US, "pi, approximated:   %.15f%n", approx);
    }
}
