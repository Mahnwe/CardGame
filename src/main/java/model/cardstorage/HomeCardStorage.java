package model.cardstorage;

import model.cards.HomeCard;

import java.util.ArrayList;
import java.util.List;

public class HomeCardStorage
{
    private final List<HomeCard> homeCardList = new ArrayList<HomeCard>();

    public HomeCardStorage()
    {
        createHomeCards();
    }

    public void createHomeCards()
    {

    }
    public List<HomeCard> getHomeCardList() {
        return homeCardList;
    }
}
