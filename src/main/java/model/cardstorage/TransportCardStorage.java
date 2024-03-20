package model.cardstorage;

import model.cards.TransportCard;

import java.util.ArrayList;
import java.util.List;

public class TransportCardStorage
{
    private final List<TransportCard> transportCardList = new ArrayList<TransportCard>();
    public TransportCardStorage()
    {
        createTransportCards();
    }

    public void createTransportCards()
    {

    }
    public List<TransportCard> getTransportCardList() {
        return transportCardList;
    }

}
