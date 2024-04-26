package model.stats;

import java.util.ArrayList;

public class StatsList extends ArrayList<Stat>
{
    private IncomeStat incomeStat;
    private HappinessStat happinessStat;
    private ProductionStat productionStat;
    private PopulationStat populationStat;

    public StatsList()
    {
        this.incomeStat = new IncomeStat(0);
        this.happinessStat = new HappinessStat(0);
        this.productionStat = new ProductionStat(0);
        this.populationStat = new PopulationStat(0);
        this.add(incomeStat);
        this.add(happinessStat);
        this.add(productionStat);
        this.add(populationStat);
    }

    public IncomeStat getIncomeStat() {
        return incomeStat;
    }

    public void setIncomeStat(IncomeStat incomeStat) {
        this.incomeStat = incomeStat;
    }

    public HappinessStat getHappinessStat() {
        return happinessStat;
    }

    public void setHappinessStat(HappinessStat happinessStat) {
        this.happinessStat = happinessStat;
    }

    public ProductionStat getProductionStat() {
        return productionStat;
    }

    public void setProductionStat(ProductionStat productionStat) {
        this.productionStat = productionStat;
    }

    public PopulationStat getPopulationStat() {
        return populationStat;
    }

    public void setPopulationStat(PopulationStat populationStat) {
        this.populationStat = populationStat;
    }
}
