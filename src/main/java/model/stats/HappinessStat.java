package model.stats;

public class HappinessStat extends Stat
{
    private int statValue;

    public HappinessStat(int statValue)
    {
        this.statValue = statValue;
    }

    public void incrementStat(int numberToAdd) {
        statValue += numberToAdd;
    }

    public void addPercentage(int percentageNumber) {
    statValue += (statValue*percentageNumber/100);
    }

    public int getStatValue() {return statValue;}

    public void setStatValue(int statValue) {this.statValue = statValue;}
}
