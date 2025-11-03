interface VehicleDisplay {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}

class ElectricCar implements VehicleDisplay {
    public void displaySpeed() { System.out.println("Speed: 60 km/h"); }
    public void displayBattery() { System.out.println("Battery: 85%"); }
}
class PetrolCar implements VehicleDisplay {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
}
public class DashboardDemo {
    public static void main(String[] args) {
        VehicleDisplay e = new ElectricCar();
        VehicleDisplay p = new PetrolCar();
        e.displaySpeed();
        e.displayBattery();

        p.displaySpeed();
        p.displayBattery();
    }
}
