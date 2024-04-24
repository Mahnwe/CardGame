package model.cards;

import model.bonus.Bonus;

public class LandscapeCard extends Card{
    public LandscapeCard(String cardType, String cardName,  int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, String bonusDescription) {
        super(cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, bonusDescription);
    }
}
