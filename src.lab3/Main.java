import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите какое количество обьектов сгенерировать: ");
        int numberOfObjects = scanner.nextInt();
        ArrayList<Decorate> shoesArrayList = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++) {
            if (random.nextInt(2) == 0) {
                Nike nike = new Nike (random.nextInt(10000), random.nextInt(1000),  random.nextInt(1000),
                        random.nextInt(15),  random.nextInt(20000), getRandomColor(), getRandomModelName());
                shoesArrayList.add(i % 2 == 0 ? new SummerNike(nike) : new SoccerNike(nike));
            }
                else {
                    Vans vans = new Vans(random.nextInt(1000), random.nextInt(100), random.nextInt(500), getRandomColor(),
                            getRandomTypeKedi(), random.nextInt(100), random.nextInt(1000)
                    );
                    shoesArrayList.add(new WinterVans(vans));
            }
        }

        for (int i = 0; i < shoesArrayList.size(); i++) {

            System.out.println(shoesArrayList.get(i).getDescription());
        }

    }

    static String getRandomColor() {
        ArrayList<String> listOfColors = new ArrayList<String>();
        listOfColors.add("red");
        listOfColors.add("green");
        listOfColors.add("blue");
        return listOfColors.get(new Random().nextInt(3));
    }

    static String getRandomModelName() {
        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Force");
        listOfNames.add("AirMax");
        listOfNames.add("CR7");
        return listOfNames.get(new Random().nextInt(3));
    }

    static String getRandomTypeKedi() {
        ArrayList<String> listOfTypes = new ArrayList<String>();
        listOfTypes.add("Sport");
        listOfTypes.add("Daily");
        return listOfTypes.get(new Random().nextInt(2));
    }

}
