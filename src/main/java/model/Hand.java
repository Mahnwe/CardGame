package model;

import model.cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
    private List<Card> cardsList = new ArrayList<Card>();

    public Hand()
    {

    }
    public List<Card> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<Card> cardsList) {
        this.cardsList = cardsList;
    }
}
