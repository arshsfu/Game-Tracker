public class displayMenu {
    String menu[] = {"List games", "Add a new game", "Remove game", "Add game played","Debug dump of game Details", "Exit"};

    displayMenu(){};
    

    public void displayMenu(){
        System.out.println("Menu");
        for(int i = 0; i < menu.length; i++){
            System.out.println(i + 1 + ". " + menu[i]);
        }
        System.out.println("*********************************\n\n");
    }
}
