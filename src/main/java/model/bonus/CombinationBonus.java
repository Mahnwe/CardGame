package model.bonus;

import model.BoardGame;
import model.stats.StatsList;

public class CombinationBonus extends Bonus
{
    private final boolean bonusIsForCardName;
    private final boolean bonusIsForCardType;
    private final boolean bonusIsForCardFamily;
    private final String stringToCompare;
    public CombinationBonus(boolean isForCardName, boolean isForCardType, boolean isForCardFamily, String stringToCompare)
    {
        this.bonusIsForCardName = isForCardName;
        this.bonusIsForCardType = isForCardType;
        this.bonusIsForCardFamily = isForCardFamily;
        this.stringToCompare = stringToCompare;
    }

    public void launchCombinationBonusEffect(StatsList cardStatList, int numberToAdd, String stringToCompare, BoardGame boardGame)
    {
        if(bonusIsForCardType)
        {
            addBonusToStatIfCardTypeIsOnBoard(cardStatList, numberToAdd, stringToCompare, boardGame);
        }
        if(bonusIsForCardName)
        {
            addBonusToStatIfCardNameIsOnBoard(cardStatList, numberToAdd, stringToCompare, boardGame);
        }
        if (bonusIsForCardFamily)
        {
            addBonusToStatIfCardFamilyIsOnBoard(cardStatList, numberToAdd, stringToCompare, boardGame);
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

    public void addBonusToStatIfCardFamilyIsOnBoard(StatsList cardStatList, int numberToAdd, String cardFamilyForCombination, BoardGame boardGame)
    {
        for (int i =0; i < boardGame.getCardSlotsList().size(); i++)
        {
            if (boardGame.getCardSlotsList().get(i).getCard().getCardFamily().equals(cardFamilyForCombination))
            {
                cardStatList.getHappinessStat().incrementStat(numberToAdd);
                cardStatList.getProductionStat().incrementStat(numberToAdd);
                cardStatList.getPopulationStat().incrementStat(numberToAdd);
                cardStatList.getIncomeStat().incrementStat(numberToAdd);
            }
        }
    }
}
