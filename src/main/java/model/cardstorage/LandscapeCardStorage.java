package model.cardstorage;

import model.cards.LandscapeCard;

import java.util.ArrayList;
import java.util.List;

public class LandscapeCardStorage
{
    private final List<LandscapeCard> landscapeCardList = new ArrayList<LandscapeCard>();
    public LandscapeCardStorage()
    {
        createLandscapeCards();
    }

    public void createLandscapeCards()
    {

    }
    public List<LandscapeCard> getLandscapeCardList() {
        return landscapeCardList;
    }
}
