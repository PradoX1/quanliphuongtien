import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double velocity ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chúng tôi có các loại phương tiện sau: "+"Bus, Train, Plane.");
        System.out.println("Mời bạn nhập phương tiện muốn đi : ");
        String vehicle = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Mời bạn nhập quãng đường muốn đi: S= " + " km");
        double street = Double.parseDouble(sc.nextLine());
        switch (vehicle) {
            case "bus":
                velocity = Velocity.BUS.getSpeedValue();
                Bus bus = new Bus(street, velocity);
                bus.printInfo();
                break;
            case "train":
                velocity = Velocity.TRAIN.getSpeedValue();
                Train train = new Train(street, velocity);
                train.printInfo();
                break;
            case "plane":
                velocity = Velocity.AIRPLANE.getSpeedValue();
                Plane plane = new Plane(street, velocity);
                plane.printInfo();
                break;
            default:
                System.out.println("Error");
        }
    }
}