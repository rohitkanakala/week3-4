import java.util.Scanner;

// Program to print multiplication table from 6 to 9
class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop for multiplication
        for (int i = 6; i <= 9; i++) {

            int result = number * i;

            System.out.println(number + " * " + i + " = " + result);
        }

        input.close();
    }
}