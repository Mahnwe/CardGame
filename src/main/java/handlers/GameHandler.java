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
        boardHandler.getDeckHandler().constructDeckForPlayer();
    }

    public void startRound1()
    {
        boardHandler.getPlayerHandler().getPlayer().getPlayerHand().setCardsList(boardHandler.getDeckHandler().constructDeckForRound1());
    }
    public void startRound2()
    {
        boardHandler.getPlayerHandler().getPlayer().getPlayerHand().setCardsList(boardHandler.getDeckHandler().constructDeckForRound2());
    }
    public void startRound3()
    {
        boardHandler.getPlayerHandler().getPlayer().getPlayerHand().setCardsList(boardHandler.getDeckHandler().constructDeckForRound3());
    }

    public void addBoardHandlerStatsToFinalStatListEachTurn()
    {
        finalStatList.getProductionStat().incrementStat(boardHandler.getStatHandler().getStatsList().getProductionStat().getStatValue());
        finalStatList.getHappinessStat().incrementStat(boardHandler.getStatHandler().getStatsList().getHappinessStat().getStatValue());
        finalStatList.getPopulationStat().incrementStat(boardHandler.getStatHandler().getStatsList().getPopulationStat().getStatValue());
        finalStatList.getIncomeStat().incrementStat(boardHandler.getStatHandler().getStatsList().getIncomeStat().getStatValue());
    }

    public BoardHandler getBoardHandler() {return boardHandler;}

    public StatsList getFinalStatList() {
        return finalStatList;
    }
}
