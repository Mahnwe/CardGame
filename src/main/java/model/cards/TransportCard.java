package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;
import model.stats.StatsList;

public class TransportCard extends Card{
    public TransportCard(String cardType, String cardName, StatsList statsList, Bonus bonus, Malus malus) {
        super(cardType, cardName, statsList, bonus, malus);
    }
}
