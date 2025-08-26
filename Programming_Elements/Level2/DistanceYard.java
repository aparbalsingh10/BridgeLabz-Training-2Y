import java.util.*;
class DistanceYard{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double  feet=sc.nextDouble();
        double  yard=feet/3;
        double  mile=yard/1760;
        System.out.println(feet);
        System.out.println(yard);
        System.out.println(mile);
    }
}