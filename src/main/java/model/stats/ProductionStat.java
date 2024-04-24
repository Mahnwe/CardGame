package model.stats;

public class ProductionStat extends Stat
{
    private int statValue;

    public ProductionStat(int statValue)
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
