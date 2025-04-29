import java.io.Console;
import java.io.PrintWriter;
import java.io.Reader;

public class ConsoleMethodsExample {
    public static void main(String[] args) {
        // Get the console object
        Console console = System.console();

        // Check if the console is available
        if (console == null) {
            System.out.println("No console available. Run the program in a terminal.");
            return;
        }

        // Using readLine() - Reading user input
        String name = console.readLine("Enter your name: ");

        // Using readPassword() - Reading password securely
        char[] password = console.readPassword("Enter your password: ");

        // Using format() - Display formatted output
        console.format("Welcome, %s!\n", name);

        // Using printf() - Another way to format output
        console.printf("Your password has %d characters.\n", password.length);

        // Using writer() - Get PrintWriter object for advanced output
        
    }
}
