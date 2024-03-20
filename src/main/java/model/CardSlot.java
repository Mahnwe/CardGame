package model;

import model.cards.Card;

public class CardSlot
{
    private Card card;
    boolean isEmpty;

    public CardSlot()
    {
        isEmpty = true;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
