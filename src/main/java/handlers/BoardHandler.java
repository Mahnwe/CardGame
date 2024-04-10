package handlers;

import model.BoardGame;
import model.Player;

public class BoardHandler
{
    private final StatHandler statHandler;
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
