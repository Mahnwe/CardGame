package handlers;

import model.cards.Card;
import model.cardstorage.CardStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckHandler {
    private CardStorage cardStorage;
    private Random randomIndex;

    public void constructDeckForPlayer()
    {
        cardStorage = new CardStorage();
    }

    public List<Card> constructDeckForRound1()
    {
        List<Card> turnOneCardList = new ArrayList<Card>();
        turnOneCardList.add(cardStorage.getLandscapeCardStorage().getLandscapeCardList().get(generateRandomIndex()));
        turnOneCardList.add(cardStorage.getHomeCardStorage().getHomeCardList().get(generateRandomIndex()));
        turnOneCardList.add(cardStorage.getTransportCardStorage().getTransportCardList().get(generateRandomIndex()));
        turnOneCardList.add(cardStorage.getEnergyCardStorage().getEnergyCardList().get(generateRandomIndex()));
        turnOneCardList.add(cardStorage.getLeisureCardStorage().getLeisureCardList().get(generateRandomIndex()));
        return turnOneCardList;
    }
    public List<Card> constructDeckForRound2()
    {
        List<Card> turnTwoCardList = new ArrayList<Card>();
        turnTwoCardList.add(cardStorage.getLandscapeCardStorage().getLandscapeCardList().get(generateRandomIndex()));
        turnTwoCardList.add(cardStorage.getHomeCardStorage().getHomeCardList().get(generateRandomIndex()));
        turnTwoCardList.add(cardStorage.getIndustryCardStorage().getIndustryCardList().get(generateRandomIndex()));
        turnTwoCardList.add(cardStorage.getBonusCardStorage().getBonusCardList().get(generateRandomIndex()));
        turnTwoCardList.add(cardStorage.getLeisureCardStorage().getLeisureCardList().get(generateRandomIndex()));
        return turnTwoCardList;
    }
    public List<Card> constructDeckForRound3()
    {
        List<Card> turnThreeCardList = new ArrayList<Card>();
        turnThreeCardList.add(cardStorage.getTransportCardStorage().getTransportCardList().get(generateRandomIndex()));
        turnThreeCardList.add(cardStorage.getEnergyCardStorage().getEnergyCardList().get(generateRandomIndex()));
        turnThreeCardList.add(cardStorage.getIndustryCardStorage().getIndustryCardList().get(generateRandomIndex()));
        turnThreeCardList.add(cardStorage.getBonusCardStorage().getBonusCardList().get(generateRandomIndex()));
        return turnThreeCardList;
    }
    public void rerollCard()
    {

    }
    public int generateRandomIndex()
    {
        int maxRandom = 4;
        int minRandom = 0;
        return randomIndex.nextInt((maxRandom - 1 - minRandom) + 1) + minRandom;
    }
}
