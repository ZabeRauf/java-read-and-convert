import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {

        String username = "Zaben";
        String otherUser = "JL";

        // create a tool for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        // read the string written by the user and store it in a variable
        String message = scanner.nextLine();

        // print inputted message
        System.out.println(username + ": " + message);
        System.out.println(otherUser + ": " + "I'm copying your message and reading it back so you know how dumb you look.");
        System.out.println(otherUser + ": " + message);
    }
}