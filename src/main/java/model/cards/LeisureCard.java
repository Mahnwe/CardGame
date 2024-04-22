package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;
import model.stats.StatsList;

public class LeisureCard extends Card{
    protected LeisureCard(String cardType, String cardName,  int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, Malus malus) {
        super(cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, malus);
    }
}
