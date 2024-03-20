package model.bonus;

public class PassivBonus extends Bonus
{
    public PassivBonus()
    {

    }
    public int addBonusToStat(int playerStat) {
     return playerStat++;
    }
}
