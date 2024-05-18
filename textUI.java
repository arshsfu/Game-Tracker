import java.util.ArrayList;
import java.util.Scanner;

public class textUI {
    displayMenu displayMenu = new displayMenu();
    public void start(){
        displayMenu.displayMenu();
        menuChoice();
    }
    
    ArrayList<boardGame> boardGames = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);
    int enterChoice(){
        int choice ;
        do{
            System.out.println("Please Enter your choice[1-6]: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 6);
        
        return choice;
    }
    
    public void menuChoice(){
        do {
            int choice = enterChoice();
            switch (choice) {
                case 1:
                    System.out.println("List games:\n");
                    listGames();
                    displayMenu.displayMenu();
                    break;
                case 2:
                    System.out.println("Add a new game:\n");
                    addGame();
                    displayMenu.displayMenu();
                    break;
                case 3:
                    System.out.println("Remove game");
                    removeGame();
                    displayMenu.displayMenu();
                    break;
                case 4:
                    System.out.println("Add game played");
                    addGamePlayed();
                    displayMenu.displayMenu();
                    break;
                case 5:
                    System.out.println("Debug dump of game Details");
                    debugDump();
                    displayMenu.displayMenu();
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!!");
                    displayMenu.displayMenu();
                    break;
            }
        } while (true);
    }

    void listGames(){
        if(boardGames.isEmpty()){
            System.out.println("No games to display\n\n");
    }
    else{
        for(int i = 0; i < boardGames.size(); i++){
            System.out.println(boardGames.get(i));
        }
        System.out.println("*********************************\n\n");
    }
    }

    void addGame(){
        System.out.println("Enter the game name[0 to cancel]: ");
        String gameName = scanner.next();
        if(gameName.equals("0")){
            return;
        }
        double gameWeight;
        do{
            System.out.println("Enter the game weight[1-5][0 to cancel]: ");
            gameWeight = scanner.nextDouble();
            if(gameWeight == 0){
                return;
            }
        }while(gameWeight < 1 || gameWeight > 5);
        
        int gamePlayed = 0;
        boardGames.add(new boardGame(gameName, gameWeight, gamePlayed));
        System.out.println("Game added successfully");
    }

    void removeGame(){
        listGames();
        int gameNumber ;
        do{
            System.out.println("Enter the game number to remove[0 to cancel]: ");
            gameNumber = scanner.nextInt();
            if(gameNumber < 1 || gameNumber > boardGames.size()){
                System.out.println("Invalid Game number!! Game not found");
            }
            if(gameNumber == 0){
                return;
            }
        }while(gameNumber < 1 || gameNumber > boardGames.size());
        
        boardGames.remove(gameNumber - 1);
        System.out.println("Game removed successfully");
    }

    void addGamePlayed(){
        listGames();
        int gameNumber ;
        do{
            System.out.println("Enter the game number to add game played[0 to cancel]: ");
            gameNumber = scanner.nextInt();
            if(gameNumber < 1 || gameNumber > boardGames.size()){
                System.out.println("Invalid Game number!! Game not found");
            }
            if(gameNumber == 0){
                return;
            }
        }while(gameNumber < 1 || gameNumber > boardGames.size());
        
        int gamePlayed ;
        do{
            System.out.println("Enter the number of times the game was played: ");
            gamePlayed = scanner.nextInt();
        }while(gamePlayed < 0);
        
        boardGames.get(gameNumber - 1).setGamePlayed(boardGames.get(gameNumber - 1).getGamePlayed() + gamePlayed);
        System.out.println("Game played added successfully");
    }

    void debugDump(){
        for(int i = 0; i < boardGames.size(); i++){
            System.out.println(boardGames.get(i));
        }
    }
}
