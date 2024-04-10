package handlers;

import model.Hand;
import model.Player;
import model.stats.StatsList;

public class GameHandler
{
    private final BoardHandler boardHandler;
    private final StatsList finalStatList;

    public GameHandler()
    {
        boardHandler = new BoardHandler();
        finalStatList = new StatsList();
    }

    public BoardHandler getBoardHandler() {return boardHandler;}

    public StatsList getFinalStatList() {
        return finalStatList;
    }
}
