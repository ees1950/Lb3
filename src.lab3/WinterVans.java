public class WinterVans extends Decorate {
    private Vans vans;

    public WinterVans(Vans vans) {
        this.vans = vans;
    }

    public String getDescription() {
        return "This is Winter collection Vans. Weight is " + this.vans.getWeight() + "g. Quality is " + (this.vans.getQuality() - 20) +
                ". Color is black.";
    }
}
