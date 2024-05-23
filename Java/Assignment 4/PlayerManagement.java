import java.util.*;
class Player 
{
    String playerName;
    int totalRun;
    int noOfWicket;
    int noOfMatches;
    String country;
    int noOfCentury;
    String category;

    public Player(String playerName, int totalRun, int noOfWicket, int noOfMatches, String country, int noOfCentury) 
    {
        this.playerName = playerName;
        this.totalRun = totalRun;
        this.noOfWicket = noOfWicket;
        this.noOfMatches = noOfMatches;
        this.country = country;
        this.noOfCentury = noOfCentury;
        this.category = null;
    }
    public void display() 
    {
        System.out.println("Name: " + playerName);
        System.out.println("Total Runs: " + totalRun);
        System.out.println("Wickets: " + noOfWicket);
        System.out.println("Matches: " + noOfMatches);
        System.out.println("Country: " + country);
        System.out.println("Centuries: " + noOfCentury);
        System.out.println("Category: " + category);
        System.out.println("------------------------------");
    }
}
//////////////////////////////////////////////////////////////////////////////
public class PlayerManagement 
{
    public static void displayPlayerWithMaxRuns(ArrayList<Player> players) 
    {
        Player maxRunPlayer = Collections.max(players, Comparator.comparingInt(p -> p.totalRun));
        System.out.println("Player with Maximum Runs:");
        maxRunPlayer.display();
    }
    public static void sortPlayersByName(ArrayList<Player> players) {
        players.sort(Comparator.comparing(p -> p.playerName));
        System.out.println("Players sorted by Name:");
        for (Player player : players) {
            player.display();
        }
    }
    public static void removePlayersWithLessThan100Runs(ArrayList<Player> players)
    {
        players.removeIf(player -> player.totalRun < 100);
        System.out.println("Players with 100 or more runs:");
        for (Player player : players) 
        {
            player.display();
        }
    }
    public static void updatePlayerCategories(ArrayList<Player> players) 
    {
        for (Player player : players) 
        {
            if (player.noOfCentury >= 10) 
            {
                player.category = "A";
            } else {
                player.category = "B";
            }
        }
        System.out.println("Updated Player Categories:");
        for (Player player : players) 
        {
            player.display();
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Player1", 1500, 100, 50, "Country1", 15));
        players.add(new Player("Player2", 800, 90, 45, "Country2", 5));
        players.add(new Player("Player3", 1200, 80, 40, "Country3", 8));
        players.add(new Player("Player4", 90, 70, 35, "Country4", 1));
        players.add(new Player("Player5", 2000, 60, 30, "Country5", 25));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("Menu:");
            System.out.println("1. Display the player details who has scored maximum no of runs");
            System.out.println("2. Sort the players by name");
            System.out.println("3. Remove the player who has scored less than 100 runs");
            System.out.println("4. Update Category");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    displayPlayerWithMaxRuns(players);
                    break;
                case 2:
                    sortPlayersByName(players);
                    break;
                case 3:
                    removePlayersWithLessThan100Runs(players);
                    break;
                case 4:
                    updatePlayerCategories(players);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } 
        while(choice!=5);
    }
}
