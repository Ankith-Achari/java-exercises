import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "scissor", "paper"};
        String playerChoice;
        String computerChoice;
        int playscore = 0;
        int compscore = 0;
        String playAgain;

        do {
            //player choice
            System.out.print("Enter your choice(rock,paper,scissor):");
            playerChoice = scanner.nextLine().toLowerCase();

            if ((!playerChoice.equals("rock"))
                    && (!playerChoice.equals("scissor"))
                    && (!playerChoice.equals("paper"))) {
                System.out.println("Invalid Choice");
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);
            //winning conditions
            if (playerChoice.equals(computerChoice)) {
                System.out.println("You Tie...!");
                System.out.println("Your Score: " + playscore + "\tComputer Score: " + compscore);
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("You Win...!");
                playscore++;
                System.out.println("Your Score: " + playscore + "\tComputer Score: " + compscore);

            } else {
                System.out.println("You Loose...!");
                compscore++;
                System.out.println("Your Score: " + playscore + "\tComputer Score: " + compscore);
            }
            System.out.print("Wanna Play Again(y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("y"));

        //thank you
        System.out.println("Thank You....!");
    scanner.close();
    }
}
