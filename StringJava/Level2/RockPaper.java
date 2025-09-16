import java.util.*;
public class RockPaper {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("scissors") && comp.equals("paper") ||
            user.equals("paper") && comp.equals("rock")) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / totalGames) + "%";

        return stats;
    }
    public static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games ");
        int games = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0, draws = 0;
        System.out.println("\nChoices: rock, paper, scissors");
        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter your choice: ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);
            System.out.println("Computer chose " + compChoice);
            if (winner.equals("User")) {
                System.out.println("You win this round");
                userWins++;
            } else if (winner.equals("Computer")) {
                System.out.println("Computer wins this round");
                compWins++;
            } else {
                System.out.println("This round is a draw");
                draws++;
            }
        }

        System.out.println("\nFinal Results");
        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
        System.out.println("Draws " + draws);
    }
}
