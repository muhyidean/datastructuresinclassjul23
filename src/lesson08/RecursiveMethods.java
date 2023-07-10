package lesson08;

public class RecursiveMethods {

    public static int length(String text){
        if(text == null || text.equals(""))   //Base case
            return 0;
        else // Recursive Case
            return 1 + length(text.substring(1));
    }

    public static void printRec(String text){
        if(text == null || text.equals(""))   //Base case
            return;
        else {
            printRec(text.substring(1)); // PAUSE
            System.out.println(text.charAt(0));
        }
    }

    public static int factorial(int n){
        if(n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
