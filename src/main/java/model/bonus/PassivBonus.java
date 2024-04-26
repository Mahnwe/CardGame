package model.bonus;

import model.BoardGame;
import model.stats.Stat;
import model.stats.StatsList;

public class PassivBonus extends Bonus
{
    private final boolean isOnlyOneStat;
    private final boolean isAllStats;
    private final boolean isAllBoard;
    public PassivBonus(boolean isOnlyOneStat, boolean isAllStats, boolean isAllBoard)
    {
        this.isOnlyOneStat = isOnlyOneStat;
        this.isAllStats = isAllStats;
        this.isAllBoard = isAllBoard;
    }

    public void LaunchPassivBonusEffect(Stat cardStat, int numberToAdd, StatsList cardStatList, BoardGame boardGame)
    {
        if(isOnlyOneStat)
        {
            addBonusToOnlyOneStat(cardStat, numberToAdd);
        }
        if(isAllStats)
        {
            addBonusToAllStats(cardStatList, numberToAdd);
        }
        if(isAllBoard)
        {
            addBonusToAllBoard(cardStatList, boardGame, numberToAdd);
        }
    }
    public void addBonusToOnlyOneStat(Stat cardStat, int numberToAdd)
    {
        cardStat.incrementStat(numberToAdd);
    }

    public void addBonusToAllStats(StatsList cardStatList, int numberToAdd)
    {
        cardStatList.getIncomeStat().incrementStat(numberToAdd);
        cardStatList.getPopulationStat().incrementStat(numberToAdd);
        cardStatList.getProductionStat().incrementStat(numberToAdd);
        cardStatList.getHappinessStat().incrementStat(numberToAdd);
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
