package model.stats;

public abstract class Stat {
    private int statValue;
    public abstract void incrementStat(int numberToAdd);
    public abstract void addPercentage(int percentageNumber);
    public int getStatValue() {return statValue;}

    public void setStatValue(int statValue) {this.statValue = statValue;}

}
