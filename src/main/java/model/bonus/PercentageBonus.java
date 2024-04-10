package model.bonus;

public class PercentageBonus extends Bonus
{
    public PercentageBonus()
    {

    }
    public int addBonusToStat(int cardStat, int percentageNumberToAdd) {
    cardStat += (cardStat*percentageNumberToAdd/100);
    return cardStat;
    }
}
