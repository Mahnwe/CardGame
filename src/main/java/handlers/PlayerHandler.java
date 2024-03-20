package handlers;

import model.Hand;
import model.Player;

public class PlayerHandler
{
    private final Player player;
    private final Hand playerHand;
    public PlayerHandler(Player player)
    {
        this.player = player;
        playerHand = new Hand();
    }
    public Hand getPlayerHand() {
        return playerHand;
    }
    public Player getPlayer() {return player;}
}
