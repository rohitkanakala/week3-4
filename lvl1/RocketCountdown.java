import java.util.Scanner;

// Program for rocket countdown using while loop
class RocketCountdown {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking starting number
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {

            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");

        input.close();
    }
}