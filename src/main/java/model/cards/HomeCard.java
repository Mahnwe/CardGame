package model.cards;

import model.bonus.Bonus;

public class HomeCard extends Card{
    public HomeCard(String cardFamily, String cardType, String cardName,  int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, String bonusDescription) {
        super(cardFamily, cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, bonusDescription);
    }
}
