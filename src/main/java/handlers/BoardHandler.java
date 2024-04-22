package handlers;

import model.BoardGame;
import model.Player;

public class BoardHandler
{
    private StatHandler statHandler;
    private final PlayerHandler playerHandler;
    private final BoardGame boardGame;
    private final DeckHandler deckHandler;

    public BoardHandler()
    {
        statHandler = new StatHandler();
        playerHandler = new PlayerHandler(new Player());
        deckHandler = new DeckHandler();
        boardGame = new BoardGame();
    }

    public void checkBoardSlotsForStats()
    {
        for(int i =0; i<boardGame.getCardSlotsList().size(); i++)
        {
            if(!boardGame.getCardSlotsList().get(i).isEmpty())
            {
                statHandler.getStatsList().setHappinessStat(boardGame.getCardSlotsList().get(i).getCard().getStatsList().getHappinessStat());
                statHandler.getStatsList().setIncomeStat(boardGame.getCardSlotsList().get(i).getCard().getStatsList().getIncomeStat());
                statHandler.getStatsList().setProductionStat(boardGame.getCardSlotsList().get(i).getCard().getStatsList().getProductionStat());
                statHandler.getStatsList().setPopulationStat(boardGame.getCardSlotsList().get(i).getCard().getStatsList().getPopulationStat());
            }
        }
    }

    public void resetStatListEachTurn()
    {
        statHandler = new StatHandler();
    }

    public StatHandler getStatHandler() {
        return statHandler;
    }
    public PlayerHandler getPlayerHandler() {
        return playerHandler;
    }

    public BoardGame getBoardGame() {
        return boardGame;
    }

    public DeckHandler getDeckHandler() {
        return deckHandler;
    }
}
