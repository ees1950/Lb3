public class Vans extends Kedi {
    private int shopper;

    public Vans() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Vans. " + "Type is " + this.getTypeKedi() + ". Weight is " + this.getWeight() + "gr. Quality is " + this.getQuality() +
                ". Color is " + this.getColor() +  ". Convenience rating is " +getConvenience() + ". "+ this.shopper;
    }

    public Vans(int weight, int liked, int quality, String color, String typeKedi, int Convenience, int shopper) {
        super(weight, liked, quality, color, typeKedi, Convenience);
        this.shopper = shopper;
    }
}

