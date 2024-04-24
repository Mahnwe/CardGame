package model.cardstorage;

import model.bonus.PassivBonus;
import model.cards.BonusCard;

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
        BonusCard doubleIncomeStatCard = new BonusCard("Bonus", "Fleuve", 0, 0, 0, 0, new PassivBonus(), "Augmente les statistiques de toute les cartes présentes sur le terrain");
        bonusCardList.add(doubleIncomeStatCard);
    }
    public List<BonusCard> getBonusCardList() {
        return bonusCardList;
    }
}
