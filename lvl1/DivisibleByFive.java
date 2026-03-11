import java.util.Scanner;

// Program to check if a number is divisible by 5
class DivisibleByFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);

        input.close();
    }
}