package model.bonus;

import model.BoardGame;
import model.cards.Card;
import model.stats.StatsList;

public class PassivBonus extends Bonus
{
    public PassivBonus()
    {

    }
    public int addBonusToOnlyOneStat(int cardStat, int numberToAdd)
    {
        cardStat += numberToAdd;
        return cardStat;
    }

    public void addBonusToAllStats(Card card, int numberToAdd)
    {
        card.getStatsList().getIncomeStat().incrementStat(numberToAdd);
        card.getStatsList().getPopulationStat().incrementStat(numberToAdd);
        card.getStatsList().getProductionStat().incrementStat(numberToAdd);
        card.getStatsList().getHappinessStat().incrementStat(numberToAdd);
    }

    public void addBonusToAllBoard(StatsList cardStatList, BoardGame boardGame, int numberToAdd)
    {
        for (int i =0; i < boardGame.getCardSlotsList().size(); i++)
        {
                cardStatList.getHappinessStat().incrementStat(numberToAdd);
                cardStatList.getProductionStat().incrementStat(numberToAdd);
                cardStatList.getPopulationStat().incrementStat(numberToAdd);
                cardStatList.getIncomeStat().incrementStat(numberToAdd);
        }
    }
}
