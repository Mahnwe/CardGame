package model.cardstorage;

import model.bonus.PassivBonus;
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
        HomeCard cottageCard = new HomeCard("Mountain", "Home", "Moutain cottage", 1, 2, 1, 2,
                new PassivBonus(true, false, false), "Augmente l'income");
        homeCardList.add(cottageCard);
    }
    public List<HomeCard> getHomeCardList() {
        return homeCardList;
    }
}
