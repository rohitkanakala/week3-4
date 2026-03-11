import java.util.Scanner;

// Program to check positive negative or zero
class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking number type
        if (number > 0) {
            System.out.println("The number is Positive");
        }
        else if (number < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

        input.close();
    }
}