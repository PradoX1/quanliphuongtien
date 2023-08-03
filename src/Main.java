import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int velocity = 0;
        int vBus = Velocity.BUS.getSpeedValue();
        int vTrain = Velocity.TRAIN.getSpeedValue();
        int vPlane = Velocity.AIRPLANE.getSpeedValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chúng tôi có các loại phương tiện sau: " + "\n" + "Bus: bus1, bus2;" + " Train: train1, train2;" + " Plane: plane1, plane2.");
        System.out.println("Mời bạn nhập phương tiện muốn đi : ");
        String vehicle = sc.nextLine().toLowerCase(Locale.ROOT);
        if (vehicle.contains("bus") == true) {
            vehicle = "bus";
        }
        if (vehicle.contains("train") == true) {
            vehicle = "train";
        }
        if (vehicle.contains("plane") == true) {
            vehicle = "plane";
        }
        System.out.println("Mời bạn nhập quãng đường muốn đi: S= "+" km");
        double street = Double.parseDouble(sc.nextLine());
        switch (vehicle) {
            case "bus":
                velocity = vBus;
                Bus bus = new Bus(street, velocity);
                bus.printInfo();
                break;
            case "train":
                velocity = vTrain;
                Train train = new Train(street, velocity);
                train.printInfo();
                break;
            case "plane":
                velocity = vPlane;
                Plane plane = new Plane(street, velocity);
                plane.printInfo();
                break;
            default:
                System.out.println("Error");
        }
    }
}