import java.util.*;
class VolumeofEarth{
    public static double ConvertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double radius = 6378;
        double Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
        double radiusMiles = ConvertKmToMiles(radius);
        double VolumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles,3);
        System.out.println(Volume);
        System.out.println(VolumeMiles);
        double Distance = 10;
        System.out.println(Distance + " kilometer is equal" + ConvertKmToMiles(Distance)+" Miles");

    }
}


