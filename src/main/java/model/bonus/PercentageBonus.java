package model.bonus;

import model.BoardGame;
import model.stats.Stat;
import model.stats.StatsList;

public class PercentageBonus extends Bonus
{
    private final boolean isOnlyOneStat;
    private final boolean isAllStats;
    private final boolean isAllBoard;
    public PercentageBonus(boolean isOnlyOneStat, boolean isAllStats, boolean isAllBoard)
    {
        this.isOnlyOneStat = isOnlyOneStat;
        this.isAllStats = isAllStats;
        this.isAllBoard = isAllBoard;
    }

    public void LaunchPercentageBonusEffect(Stat cardStat, int percentageNumberToAdd, StatsList cardStatList, BoardGame boardGame)
    {
        if(isOnlyOneStat)
        {
            addBonusToOnlyOneStat(cardStat, percentageNumberToAdd);
        }
        if(isAllStats)
        {
            addBonusToAllStats(cardStatList, percentageNumberToAdd);
        }
        if(isAllBoard)
        {
            addBonusToAllBoard(cardStatList, boardGame, percentageNumberToAdd);
        }
    }

    public void addBonusToOnlyOneStat(Stat cardStat, int percentageNumberToAdd)
    {
        cardStat.addPercentage(percentageNumberToAdd);
    }

    public void addBonusToAllStats(StatsList cardStatList, int percentageNumberToAdd)
    {
        cardStatList.getIncomeStat().addPercentage(percentageNumberToAdd);
        cardStatList.getPopulationStat().addPercentage(percentageNumberToAdd);
        cardStatList.getProductionStat().addPercentage(percentageNumberToAdd);
        cardStatList.getHappinessStat().addPercentage(percentageNumberToAdd);
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
