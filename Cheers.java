// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	       String word = (args[0]);
               int number = Integer.parseInt(args[1]);
               word = word.toUpperCase();

               for (int i = 0; i<(word.length()); i++) {
                if("AEFHILMNORSX".indexOf(word.charAt(i))!= -1){
                        System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                } else {
                        System.out.println("Give me a " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
               }
               System.out.println("What does that spell? ");
               for(int i=0; i<number; i++){
                System.out.println(word + "!!!");
               }
        }
}
