// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (usesAn(ch)) {
                // "an" + רווח אחד
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                // "a" + שני רווחים (ליישור עם "an ")
                System.out.println("Give me a  " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
        }
    }

    // האותיות שמקבלות "an" לפי ההנחיה
    private static boolean usesAn(char c) {
        return "AEFHILMNORSX".indexOf(c) >= 0;
    }
}
