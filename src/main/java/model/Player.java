package model;

import model.bonus.Bonus;
import model.cards.LandscapeCard;
import model.stats.*;

public class Player {
    private String name;
    private StatsList statsList;
    private int playerScore;

    public Player(String name, StatsList statsList, int playerScore)
    {
        this.name = name;
        this.statsList = statsList;
        this.playerScore = playerScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatsList getStatsList() {
        return statsList;
    }

    public void setStatsList(StatsList statsList) {
        this.statsList = statsList;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
}
