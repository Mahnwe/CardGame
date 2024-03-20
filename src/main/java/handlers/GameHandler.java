package handlers;

import model.Hand;
import model.Player;

public class GameHandler
{
    private final StatHandler statHandler;
    private final PlayerHandler playerHandler;
    private final BoardHandler boardHandler;

    public GameHandler()
    {
        statHandler = new StatHandler();
        playerHandler = new PlayerHandler(new Player());
        boardHandler = new BoardHandler();
    }

    public StatHandler getStatHandler() {return statHandler;}

    public PlayerHandler getPlayerHandler() {return playerHandler;}

    public BoardHandler getBoardHandler() {return boardHandler;}
}
