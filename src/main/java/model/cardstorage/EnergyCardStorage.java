package model.cardstorage;

import model.cards.EnergyCard;

import java.util.ArrayList;
import java.util.List;

public class EnergyCardStorage {

    private final List<EnergyCard> energyCardList = new ArrayList<EnergyCard>();
    public EnergyCardStorage()
    {
        createEnergyCards();
    }

    public void createEnergyCards()
    {

    }
    public List<EnergyCard> getEnergyCardList() {
        return energyCardList;
    }
}
