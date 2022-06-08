
public class SoccerNike extends Decorate {
    private Nike nike;

    public SoccerNike(Nike nike) {
        this.nike = nike;
    }

    public String getDescription() {
        return "This is Soccer Nike collection. My quality is " + this.nike.getQuality() + ". Size is " + this.nike.getSize()+".";
    }
}
