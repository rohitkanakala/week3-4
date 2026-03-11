import java.util.Scanner;

// Program to print odd and even numbers from 1 to N
class OddEvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop through numbers
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            }
            else {
                System.out.println(i + " is Odd");
            }
        }

        input.close();
    }
}