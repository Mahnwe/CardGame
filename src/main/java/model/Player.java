package model;

public class Player {
    private String name;
    private int playerScore;
    private final Hand playerHand;

    public Player()
    {
        playerHand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }
}
