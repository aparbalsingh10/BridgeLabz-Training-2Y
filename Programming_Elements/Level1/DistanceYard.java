import java.util.*;
class DistanceYard{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double distancefeet=sc.nextDouble();
        double distanceyard=(distancefeet/3.0);
        double distanceinch=distanceyard/1760.0;
        System.out.println(distanceinch);
        System.out.println(distanceyard);
        System.out.println(distancefeet);
    }
}