public class Game {

    public void playGame(){
        Playground playground = new Playground();
        createUser();
        playground.printBoard();

    }

    public void createUser(){
    Player player1 = new Player("Nikolai");
    Player player2 = new Player("Dennis");
    }

}
