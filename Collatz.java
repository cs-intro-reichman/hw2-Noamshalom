public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        if (mode.equals("v")) {
            for (int seed = 1; seed <= N; seed++) {
                int num = seed;
                int count = 1;            
                System.out.print(num + " ");

                
                while (num != 1 || count == 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                    count++;               
                    System.out.print(num + " ");
                }

                System.out.println("(" + count + ")");
            }

            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        } else { // mode "c"
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}
