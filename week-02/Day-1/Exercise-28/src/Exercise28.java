import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scanner.nextInt();
        int a = 0;
        while (a < (number)) {
            for (int i = 0; i < a; i++){
            System.out.print("*");
            }
            a++;
            System.out.println("*");
        }
    }
}

