package model.cards;

import model.bonus.Bonus;
import model.stats.StatsList;

public abstract class Card {
    private String cardFamily;
    private String cardType;
    private String cardName;
    private StatsList statsList;
    private Bonus bonus;
    private String bonusDescription;
    private boolean isOnBoard;

    protected Card(String cardFamily, String cardType, String cardName, int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, String bonusDescription)
    {
        this.cardFamily = cardFamily;
        this.cardType = cardType;
        this.cardName = cardName;
        this.statsList.getProductionStat().setStatValue(productionStat);
        this.statsList.getIncomeStat().setStatValue(incomeStat);
        this.statsList.getPopulationStat().setStatValue(populationStat);
        this.statsList.getHappinessStat().setStatValue(happinessStat);
        this.bonus = bonus;
        this.bonusDescription = bonusDescription;
    }

    protected Card() {
    }

    public String getCardFamily() {return cardFamily;}


    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardName() {return cardName;}

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public StatsList getStatsList() {
        return statsList;
    }

    public void setStatsList(StatsList statsList) {
        this.statsList = statsList;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public String getBonusDescription() {return bonusDescription;}

    public boolean isOnBoard() {return isOnBoard;}

    public void setOnBoard(boolean onBoard) {isOnBoard = onBoard;}
}
