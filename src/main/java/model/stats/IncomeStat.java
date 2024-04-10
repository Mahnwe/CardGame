package model.stats;

public class IncomeStat extends Stat
{
    private int statValue;
    public IncomeStat(int statValue)
    {
        this.statValue = statValue;
    }
    public void incrementStat(int numberToAdd) {
        statValue += numberToAdd;
    }

    public void decrementStats(int numberToSubtract) {
        statValue -= numberToSubtract;
    }

    public void addPercentage(int percentageNumber) {
        statValue += (statValue*percentageNumber/100);
    }

    public void removePercentage(int percentageNumber) {
        statValue -= (statValue*percentageNumber/100);
    }

    public int getStatValue() {return statValue;}

    public void setStatValue(int statValue) {this.statValue = statValue;}
}
