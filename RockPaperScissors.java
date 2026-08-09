import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

public static String playRound(String playerMove, String computerMove)
 {

if (playerMove.equals(computerMove)) 
{
 return "Draw";
}

if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
    (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
    (playerMove.equals("Scissors") && computerMove.equals("Paper"))) 
{
return "Player Wins";
}

return "Computer Wins";
}

public static void main(String[] args)
 {

 Scanner sc = new Scanner(System.in);
 Random random = new Random();

 String[] moves = {"Rock", "Paper", "Scissors"};

 int wins = 0, losses = 0, draws = 0;

        String[] player = new String[5];
        String[] computer = new String[5];
        String[] result = new String[5];

        for (int i = 0; i < 5; i++)
         {

            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            player[i] = sc.next();

            player[i] = player[i].substring(0,1).toUpperCase()
                      + player[i].substring(1).toLowerCase();

            computer[i] = moves[random.nextInt(3)];

            result[i] = playRound(player[i], computer[i]);

            System.out.println("Computer Move : " + computer[i]);
            System.out.println("Result        : " + result[i]);

            if (result[i].equals("Player Wins"))
                wins++;
            else if (result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("\n========== FINAL SUMMARY ==========");

        System.out.println("Round\t\tPlayer\t\tComputer\t\tResult");

        for (int i = 0; i < 5; i++)
        {
        System.out.println((i + 1) + "\t" + player[i] + "\t\t" + computer[i] + "\t\t" + result[i]);
        }

        System.out.println("\nWins   : " + wins);
        System.out.println(" Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win Percentage : %.2f%%", winPercentage);

        sc.close();
    }
}