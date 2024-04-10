package model.malus;

public class PercentageMalus extends Malus
{
    public PercentageMalus()
    {

    }
    public int addMalusToStat(int cardStat, int percentageNumberToSubtract) {
    cardStat += (cardStat*percentageNumberToSubtract/100);
    return cardStat;
    }
}
