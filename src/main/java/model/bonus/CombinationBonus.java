package model.bonus;

import model.BoardGame;
import model.CardSlot;

import java.util.ArrayList;
import java.util.List;

public class CombinationBonus extends Bonus
{
    public CombinationBonus()
    {

    }
    public int addBonusToStat(int cardStat, int numberToAdd, String cardNameForCombination) {
       List<CardSlot> cardSlotsList = new ArrayList<CardSlot>();
        for (CardSlot cardSlot : cardSlotsList) {
            if (cardSlot.getCard().getCardName().equals(cardNameForCombination)) {
                cardStat += numberToAdd;
            }
        }
        return cardStat;
    }
}
