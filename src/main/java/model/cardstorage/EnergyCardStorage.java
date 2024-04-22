package model.cardstorage;

import model.bonus.PassivBonus;
import model.cards.EnergyCard;
import model.malus.PassivMalus;

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
        EnergyCard centraleEolienne = new EnergyCard("Energy", "Centrale éolienne", 1, 1, 1, 2, new PassivBonus(), new PassivMalus());
        energyCardList.add(centraleEolienne);
    }
    public List<EnergyCard> getEnergyCardList() {
        return energyCardList;
    }
}
