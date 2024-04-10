package handlers;

import model.Player;

public class PlayerHandler
{
    private final Player player;
    public PlayerHandler(Player player)
    {
        this.player = player;
    }

    public Player getPlayer() {return player;}
}
