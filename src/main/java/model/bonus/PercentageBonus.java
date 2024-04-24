package model.bonus;

import model.BoardGame;
import model.cards.Card;
import model.stats.StatsList;

public class PercentageBonus extends Bonus
{
    public PercentageBonus()
    {

    }
    public int addBonusToStat(int cardStat, int percentageNumberToAdd)
    {
        cardStat += (cardStat*percentageNumberToAdd/100);
        return cardStat;
    }

    public void addBonusToAllStats(Card card, int percentageNumberToAdd)
    {
        card.getStatsList().getIncomeStat().addPercentage(percentageNumberToAdd);
        card.getStatsList().getPopulationStat().addPercentage(percentageNumberToAdd);
        card.getStatsList().getProductionStat().addPercentage(percentageNumberToAdd);
        card.getStatsList().getHappinessStat().addPercentage(percentageNumberToAdd);
    }

    public void addBonusToAllBoard(StatsList cardStatList, BoardGame boardGame, int percentageNumberToAdd)
    {
        for (int i =0; i < boardGame.getCardSlotsList().size(); i++)
        {
            cardStatList.getHappinessStat().addPercentage(percentageNumberToAdd);
            cardStatList.getProductionStat().addPercentage(percentageNumberToAdd);
            cardStatList.getPopulationStat().addPercentage(percentageNumberToAdd);
            cardStatList.getIncomeStat().addPercentage(percentageNumberToAdd);
        }
    }
}
