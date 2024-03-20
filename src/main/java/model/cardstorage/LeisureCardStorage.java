package model.cardstorage;

import model.cards.LeisureCard;

import java.util.ArrayList;
import java.util.List;

public class LeisureCardStorage
{
    private final List<LeisureCard> leisureCardList = new ArrayList<LeisureCard>();
    public LeisureCardStorage()
    {
        createLeisureCards();
    }
    public void createLeisureCards()
    {

    }
    public List<LeisureCard> getLeisureCardList() {
        return leisureCardList;
    }
}
