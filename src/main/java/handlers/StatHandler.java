package handlers;

import model.stats.StatsList;

public class StatHandler
{
    private final StatsList statsList;
    public StatHandler()
    {
        statsList = new StatsList();
    }

    public StatsList getStatsList() {
        return statsList;
    }
}
