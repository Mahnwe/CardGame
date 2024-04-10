package model;

import java.util.ArrayList;
import java.util.List;

public class BoardGame
{
    private static List<CardSlot> cardSlotsList = new ArrayList<CardSlot>();

    public static List<CardSlot> getCardSlotsList() {
        return cardSlotsList;
    }
}
