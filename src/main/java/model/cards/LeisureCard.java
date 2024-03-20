package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;
import model.stats.StatsList;

public class LeisureCard extends Card{
    protected LeisureCard(String cardType, String cardName, StatsList statsList, Bonus bonus, Malus malus) {
        super(cardType, cardName, statsList, bonus, malus);
    }
}
