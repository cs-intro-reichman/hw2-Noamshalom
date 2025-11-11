public class Collatz {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        String mood = args[1];

        if (mood.equals("v")) {

            int numRows = N;

            for (int i = 1; i <= numRows; i++) {

                int num = i;
                System.out.print(num + " ");
                int count = i;

                while (num != 1 || count == 1) {
                    if (num % 2 == 0){
                        num = num / 2;
                    } else{
                        num = num * 3 + 1;
                    }
                    count ++;
                    System.out.print(num + " ");
                }
                
                System.out.println("(" + count + ")");
            }

            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
        
        else{
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}
                    