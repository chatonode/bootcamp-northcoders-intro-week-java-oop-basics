package afternoonsprint;

public class PrimitiveDataTypeExample {
    public static void main(String[] args) {
        /* Primitive Data Types */
        /* String **/
        String myName = "Cevdet";
        String welcomeMsg = "Hello! My name is " + myName  + ".";
        System.out.println(welcomeMsg);

        /* int & double **/
        int birthYear = 1990;
        System.out.println("I was born in the year " + birthYear + ".");

        double pi = 3.14;

        /* boolean **/

        boolean amILearningJava = true;

        System.out.println("I am " + (amILearningJava ? " " : "NOT ") + "learning Java.");

        /* ********************* */
        /* Re-assigning Variables */

        String favouriteFilm = "Inside";
        System.out.println("My favourite film is " + favouriteFilm + ".");
        favouriteFilm = "Hannah Montana: The Movie";
        System.out.println("My new favourite film is " + favouriteFilm + ".");


        /* Methods */
        String firstName = "Cevdet";
        printGreeting(firstName);

        int subtractionResult = subtract(17, 3);
        System.out.println("Subtraction Result: " + subtractionResult);

        System.out.println(isStringLonger("Hello", 6));
        System.out.println(isStringLonger("Antimatter", 9));

    }

    private static void printGreeting(String name) {
        System.out.println("Hello, " + name);
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static boolean isStringLonger(String word, int expectedLength) {
        return (word.length() > expectedLength);
    }



}
