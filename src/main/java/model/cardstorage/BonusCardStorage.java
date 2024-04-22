package model.cardstorage;

import model.bonus.PassivBonus;
import model.cards.BonusCard;
import model.malus.PassivMalus;

import java.util.ArrayList;
import java.util.List;

public class BonusCardStorage
{
    private final List<BonusCard> bonusCardList = new ArrayList<BonusCard>();

    public BonusCardStorage()
    {
        createBonusCards();
    }

    public void createBonusCards()
    {
        BonusCard doubleIncomeStatCard = new BonusCard("Bonus", "Richs get Richer", 0, 0, 0, 0, new PassivBonus(), new PassivMalus());
        bonusCardList.add(doubleIncomeStatCard);
    }
    public List<BonusCard> getBonusCardList() {
        return bonusCardList;
    }
}
