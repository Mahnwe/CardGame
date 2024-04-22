package handlers;

import model.stats.*;

public class GameHandler
{
    private final BoardHandler boardHandler;
    private final StatsList finalStatList;

    public GameHandler()
    {
        boardHandler = new BoardHandler();
        finalStatList = new StatsList();
    }

    public void addBoardHandlerStatsToFinalStatListEachTurn()
    {
        addHappinessStatEachTurn();
        addIncomeStatEachTurn();
        addPopulationStatEachTurn();
        addProductionStatEachTurn();
    }

    public void addHappinessStatEachTurn()
    {
        int newHappinessStatValue = finalStatList.getHappinessStat().getStatValue() + boardHandler.getStatHandler().getStatsList().getHappinessStat().getStatValue();
        HappinessStat addingHappinessStat = new HappinessStat(0);
        addingHappinessStat.setStatValue(newHappinessStatValue);
        finalStatList.setHappinessStat(addingHappinessStat);
    }
    public void addPopulationStatEachTurn()
    {
        int newPopulationStatValue = finalStatList.getPopulationStat().getStatValue() + boardHandler.getStatHandler().getStatsList().getPopulationStat().getStatValue();
        PopulationStat addingPopulationStat = new PopulationStat(0);
        addingPopulationStat.setStatValue(newPopulationStatValue);
        finalStatList.setPopulationStat(addingPopulationStat);
    }
    public void addProductionStatEachTurn()
    {
        int newProductionStatValue = finalStatList.getProductionStat().getStatValue() + boardHandler.getStatHandler().getStatsList().getProductionStat().getStatValue();
        ProductionStat addingProductionStat = new ProductionStat(0);
        addingProductionStat.setStatValue(newProductionStatValue);
        finalStatList.setProductionStat(addingProductionStat);
    }

    public void addIncomeStatEachTurn()
    {
        int newIncomeStatValue = finalStatList.getIncomeStat().getStatValue() + boardHandler.getStatHandler().getStatsList().getIncomeStat().getStatValue();
        IncomeStat addingIncomeStat = new IncomeStat(0);
        addingIncomeStat.setStatValue(newIncomeStatValue);
        finalStatList.setIncomeStat(addingIncomeStat);
    }

    public BoardHandler getBoardHandler() {return boardHandler;}

    public StatsList getFinalStatList() {
        return finalStatList;
    }
}
