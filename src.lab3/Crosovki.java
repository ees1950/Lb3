public abstract class Crosovki extends Shoes {
    private int size;
    private int gender;


    @Override
    String getDescription() {
        return "This is Crosovki class";
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Crosovki(int weight, int liked, int quality, int size, int gender, String color) {
        super(weight, liked, quality, color);
        this.size = size;
        this.gender = gender;
    }
    public Crosovki(){
        super();
    }
}
