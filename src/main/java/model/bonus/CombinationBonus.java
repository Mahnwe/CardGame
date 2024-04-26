package model.bonus;

import model.BoardGame;
import model.stats.StatsList;

public class CombinationBonus extends Bonus
{
    private final boolean isForCardName;
    private final boolean isForCardType;
    public CombinationBonus(boolean isForCardName, boolean isForCardType)
    {
        this.isForCardName = isForCardName;
        this.isForCardType = isForCardType;
    }

    public void launchCombinationBonusEffect(StatsList cardStatList, int numberToAdd, String cardNameForCombination, BoardGame boardGame)
    {
        if(isForCardType)
        {
            addBonusToStatIfCardTypeIsOnBoard(cardStatList, numberToAdd, cardNameForCombination, boardGame);
        }
        if(isForCardName)
        {
            addBonusToStatIfCardNameIsOnBoard(cardStatList, numberToAdd, cardNameForCombination, boardGame);
        }
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
