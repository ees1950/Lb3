
public class SummerNike extends Decorate {
    private Nike nike;

    public SummerNike(Nike nike) {

        this.nike = nike;
    }

    public String getDescription() {
        return "This is Summer collection Nike. My quality is " + this.nike.getQuality() + ".";
    }

}
