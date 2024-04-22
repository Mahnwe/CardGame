package model.cards;

import model.bonus.Bonus;
import model.malus.Malus;

public class BonusCard extends Card
{
    private String cardType;
    private String cardName;
    private Bonus bonus;
    private Malus malus;

    public BonusCard(String cardType, String cardName, int productionStat, int incomeStat, int populationStat, int happinessStat, Bonus bonus, Malus malus)
    {
        super(cardType, cardName, productionStat, incomeStat, populationStat, happinessStat, bonus, malus);
    }

        public String getCardType() {
            return cardType;
        }
        public void setCardType(String cardType){this.cardType = cardType;}
        public String getCardName() {return cardName;}

        public void setCardName(String cardName){this.cardName = cardName;}
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
