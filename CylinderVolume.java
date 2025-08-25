import java.util.*;
class CylinderVolume{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Cylinder");
        double radius=sc.nextDouble();
        double height=sc.nextDouble(); 
        double CylinderVolume= Math.PI*Math.pow(radius, 2)*height;
        System.out.println(CylinderVolume);
    }
}