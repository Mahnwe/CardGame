package model.cardstorage;

import model.bonus.PercentageBonus;
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
        EnergyCard centraleEolienne = new EnergyCard("Energy", "Centrale éolienne", 1, 1, 1, 2, new PercentageBonus(false, false, true), "Augmente les statistiques des cartes de type 'Mer' et 'Plaines'");
        energyCardList.add(centraleEolienne);
    }
    public List<EnergyCard> getEnergyCardList() {
        return energyCardList;
    }
}
