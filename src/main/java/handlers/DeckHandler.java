package handlers;

import model.cards.Card;
import model.cardstorage.CardStorage;

import java.util.ArrayList;
import java.util.List;

public class DeckHandler {
    private CardStorage cardStorage;
    private List<Card> deckForPlayer;

    public void constructDeckForPlayer()
    {
        cardStorage = new CardStorage();
        deckForPlayer = new ArrayList<Card>();
    }
}
