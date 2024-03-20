package handlers;

import model.cards.Card;
import model.cardstorage.CardStorage;

import java.util.ArrayList;
import java.util.List;

public class DeckHandler {
    private CardStorage cardStorage;
    private List<Card> deckForPlayer;
    private List<Card> deckForRound1;
    private List<Card> deckForRound2;
    private List<Card> deckForRound3;

    public void constructDeckForPlayer()
    {
        cardStorage = new CardStorage();
    }

    public void constructDeckForRound1()
    {

    }
    public void constructDeckForRound2()
    {

    }
    public void constructDeckForRound3()
    {

    }
    public void rerollCard()
    {

    }
}
