package model.stats;

public abstract class Stat {
    public abstract void incrementStat(int numberToAdd);
    public abstract void decrementStats(int numberToSubtract);
    public abstract void addPercentage(int percentageNumber);
    public abstract void removePercentage(int percentageNumber);

}
