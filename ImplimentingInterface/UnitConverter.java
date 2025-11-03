interface UnitConverter {
    static double kmToMiles(double km) { return km * 0.62137; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

public class UnitConverter {
    public static void main(String[] args) {
        System.out.println(UnitConverter.kmToMiles(10));
        System.out.println(UnitConverter.kgToLbs(5));
    }
}
