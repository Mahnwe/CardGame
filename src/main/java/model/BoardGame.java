package model;

import java.util.ArrayList;
import java.util.List;

public class BoardGame
{
    private final List<CardSlot> cardSlotsList = new ArrayList<CardSlot>();

    public BoardGame()
    {
        CardSlot landscapeCardSlot = new CardSlot();
        cardSlotsList.add(landscapeCardSlot);
        CardSlot homeCardSlot = new CardSlot();
        cardSlotsList.add(homeCardSlot);
        CardSlot energyCardSlot = new CardSlot();
        cardSlotsList.add(energyCardSlot);
        CardSlot transportCardSlot = new CardSlot();
        cardSlotsList.add(transportCardSlot);
        CardSlot industryCardSlot = new CardSlot();
        cardSlotsList.add(industryCardSlot);
        CardSlot leisureCardSlot = new CardSlot();
        cardSlotsList.add(leisureCardSlot);
        CardSlot bonusCardSlot = new CardSlot();
        cardSlotsList.add(bonusCardSlot);
    }

    public List<CardSlot> getCardSlotsList() {
        return cardSlotsList;
    }
}
