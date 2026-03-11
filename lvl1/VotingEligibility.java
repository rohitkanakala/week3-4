import java.util.Scanner;

// Program to check if a person can vote
class VotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}