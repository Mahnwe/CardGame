package model.cards;

import model.bonus.Bonus;

public class BonusCard extends Card {
    private String cardType;
    private String cardName;
    private Bonus bonus;
    private String bonusDescription;

    public BonusCard(String cardType, String cardName, int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, String bonusDescription) {
        super(cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, bonusDescription);
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
