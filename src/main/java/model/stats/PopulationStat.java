package model.stats;

public class PopulationStat extends Stat
{
    private int statValue;
    public PopulationStat(int statValue)
    {
        this.statValue = statValue;
    }
    public void incrementStat() {
        statValue++;
    }

    public void decrementStats() {
        statValue--;
    }

    public void addPercentage() {

    }

    public void removePercentage() {

    }

    public int getStatValue() {return statValue;}

    public void setStatValue(int statValue) {this.statValue = statValue;}
}
