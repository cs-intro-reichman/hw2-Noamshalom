// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (usesAn(ch)) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a "  + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
        }
    }

    // Letters that take "an" per the assignment: A,E,F,H,I,L,M,N,O,R,S,X
    private static boolean usesAn(char c) {
        return "AEFHILMNORSX".indexOf(c) >= 0;
    }
}
