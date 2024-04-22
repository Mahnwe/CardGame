package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;
import model.stats.StatsList;

public class TransportCard extends Card{
    public TransportCard(String cardType, String cardName,  int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, Malus malus) {
        super(cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, malus);
    }
}
