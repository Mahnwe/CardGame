package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;
import model.stats.*;

public abstract class Card {
    private String cardType;
    private String cardName;
    private StatsList statsList;
    private Bonus bonus;
    private Malus malus;

    protected Card(String cardType, String cardName, int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, Malus malus)
    {
        this.cardType = cardType;
        this.cardName = cardName;
        this.statsList.getProductionStat().setStatValue(productionStat);
        this.statsList.getIncomeStat().setStatValue(incomeStat);
        this.statsList.getPopulationStat().setStatValue(populationStat);
        this.statsList.getHappinessStat().setStatValue(happinessStat);
        this.bonus = bonus;
        this.malus = malus;
    }

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

    public Malus getMalus() {
        return malus;
    }

    public void setMalus(Malus malus) {
        this.malus = malus;
    }
}
