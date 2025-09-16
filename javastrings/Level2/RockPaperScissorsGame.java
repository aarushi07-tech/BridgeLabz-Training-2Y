import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();

        String[][] results = new String[totalGames][3];
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(playerChoice, computerChoice);

            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        String[][] stats = getStats(playerWins, computerWins, totalGames);
        displayResults(results, stats);
        scanner.close();
    }

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) {
            return "rock";
        } else if (rand < 0.66) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                   (player.equals("paper") && computer.equals("rock")) ||
                   (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] getStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.valueOf((playerWins * 100) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100) / totalGames) + "%";

        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Player\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}