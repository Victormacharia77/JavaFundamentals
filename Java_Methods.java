public class Java_Methods {

    public static void main(String[] args) {
        System.out.println("Program start \n"); // use \n for newline
        printFirstName();
        printLastName();
        addNames();

        System.out.println("\nProgram End."); // corrected newline escape sequence
    }

    public static void printFirstName() {
        System.out.println("My first name is Jason");
    }

    public static void printLastName() {  // Capital N to match the call
        System.out.println("My last name is Gibson");  // Added missing semicolon
    }

    public static void addNames() {
        int jason = 5;
        int gibson = 6;

        int sum;

        sum = jason + gibson;

        System.out.println("The number of letters in your full name is " + sum);
    }
}
