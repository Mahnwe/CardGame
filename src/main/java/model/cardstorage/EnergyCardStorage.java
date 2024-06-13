package model.cardstorage;

import model.bonus.CombinationBonus;
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
        EnergyCard centraleEolienne = new EnergyCard("Plain", "Energy", "Centrale éolienne", 1, 1, 1, 2, new CombinationBonus(false, false, true, "Plain"), "Augmente les statistiques des cartes de type 'Plaines'");
        energyCardList.add(centraleEolienne);
    }
    public List<EnergyCard> getEnergyCardList() {
        return energyCardList;
    }
}
