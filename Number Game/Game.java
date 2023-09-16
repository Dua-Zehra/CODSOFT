import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int TotalAttempts = 10;
        int score = 0;

        System.out.println("Welcome To Number Game !");

        while (true) {
            System.out.println("I have selected the number between 0 to 100 !");
            int NumToGuess = random.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < TotalAttempts) {

                System.out.println("Guess the number ");
                int num = scan.nextInt();
                attempts++;

                if (num == NumToGuess) {
                    System.out.println("Congratulations! \n You guessed correct number " + NumToGuess);
                    score += attempts;
                    break;
                } else if (num < NumToGuess) {
                    System.out.println("Too Low! Try Again");
                } else {
                    System.out.println("Too High! Try Again");
                }
            }

            if (attempts >= TotalAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + NumToGuess);
            }

            System.out.println("Do you want to play Again ?\n Yes or No");
            String playAgain = scan.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Your Score is : " + score);
                break;
            }
        }
        scan.close();
    }

}
