import java.util.*;
class Areaofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Area");
        double radius=sc.nextDouble();
        double pi = Math.PI;
        double Area= pi*radius*radius;
        System.out.println(Area);
    }
}