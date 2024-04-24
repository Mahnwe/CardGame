package model.bonus;

import model.BoardGame;
import model.stats.StatsList;

public class CombinationBonus extends Bonus
{
    public CombinationBonus()
    {

    }
    public void addBonusToStatIfCardNameIsOnBoard(StatsList cardStatList, int numberToAdd, String cardNameForCombination, BoardGame boardGame)
    {
        for (int i =0; i < boardGame.getCardSlotsList().size(); i++)
        {
            if (boardGame.getCardSlotsList().get(i).getCard().getCardName().equals(cardNameForCombination))
            {
                cardStatList.getHappinessStat().incrementStat(numberToAdd);
                cardStatList.getProductionStat().incrementStat(numberToAdd);
                cardStatList.getPopulationStat().incrementStat(numberToAdd);
                cardStatList.getIncomeStat().incrementStat(numberToAdd);
            }
        }
    }

    public void addBonusToStatIfCardTypeIsOnBoard(StatsList cardStatList, int numberToAdd, String cardTypeForCombination, BoardGame boardGame)
    {
        for (int i =0; i < boardGame.getCardSlotsList().size(); i++)
        {
            if (boardGame.getCardSlotsList().get(i).getCard().getCardType().equals(cardTypeForCombination))
            {
                cardStatList.getHappinessStat().incrementStat(numberToAdd);
                cardStatList.getProductionStat().incrementStat(numberToAdd);
                cardStatList.getPopulationStat().incrementStat(numberToAdd);
                cardStatList.getIncomeStat().incrementStat(numberToAdd);
            }
        }
    }
}
