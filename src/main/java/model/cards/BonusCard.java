package model.cards;

import model.bonus.Bonus;
import model.stats.StatsList;

public class BonusCard extends Card {
    private String cardType;
    private String cardName;
    private Bonus bonus;
    private String bonusDescription;
    private StatsList statsList;

    public BonusCard(String cardType, String cardName, int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, String bonusDescription) {
        this.cardType = cardType;
        this.cardName = cardName;
        this.statsList.getProductionStat().setStatValue(productionStat);
        this.statsList.getIncomeStat().setStatValue(incomeStat);
        this.statsList.getPopulationStat().setStatValue(populationStat);
        this.statsList.getHappinessStat().setStatValue(happinessStat);
        this.bonus = bonus;
        this.bonusDescription = bonusDescription;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}
