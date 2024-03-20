package model.cardstorage;

import model.cards.IndustryCard;

import java.util.ArrayList;
import java.util.List;

public class IndustryCardStorage
{
    private final List<IndustryCard> industryCardList = new ArrayList<IndustryCard>();
    public IndustryCardStorage()
    {
        createIndustryCards();
    }

    public void createIndustryCards()
    {

    }
    public List<IndustryCard> getIndustryCardList() {
        return industryCardList;
    }
}
