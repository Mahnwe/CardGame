package model.bonus;

public class PassivBonus extends Bonus
{
    public PassivBonus()
    {

    }
    public int addBonusToStat(int cardStat, int numberToAdd) {
     cardStat += numberToAdd;
     return cardStat;
    }
}
