package model.malus;

public class PassivMalus extends Malus
{
    public PassivMalus()
    {

    }
    public int addMalusToStat(int cardStat, int numberToSubtract) {
    cardStat -= numberToSubtract;
    return cardStat;
    }
}
