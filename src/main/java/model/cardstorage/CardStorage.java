package model.cardstorage;

public class CardStorage
{
    private final LandscapeCardStorage landscapeCardStorage;
    private final HomeCardStorage homeCardStorage;
    private final IndustryCardStorage industryCardStorage;
    private final EnergyCardStorage energyCardStorage;
    private final LeisureCardStorage leisureCardStorage;
    private final TransportCardStorage transportCardStorage;
    private final BonusCardStorage bonusCardStorage;

    public CardStorage()
    {
        landscapeCardStorage = new LandscapeCardStorage();
        homeCardStorage = new HomeCardStorage();
        industryCardStorage = new IndustryCardStorage();
        energyCardStorage = new EnergyCardStorage();
        leisureCardStorage = new LeisureCardStorage();
        transportCardStorage = new TransportCardStorage();
        bonusCardStorage = new BonusCardStorage();
    }

    public LandscapeCardStorage getLandscapeCardStorage() {
        return landscapeCardStorage;
    }

    public HomeCardStorage getHomeCardStorage() {
        return homeCardStorage;
    }

    public IndustryCardStorage getIndustryCardStorage() {
        return industryCardStorage;
    }

    public EnergyCardStorage getEnergyCardStorage() {
        return energyCardStorage;
    }

    public LeisureCardStorage getLeisureCardStorage() {
        return leisureCardStorage;
    }

    public TransportCardStorage getTransportCardStorage() {
        return transportCardStorage;
    }

    public BonusCardStorage getBonusCardStorage() {
        return bonusCardStorage;
    }
}
