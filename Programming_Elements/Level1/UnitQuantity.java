import java.util.*;
class UnitQuantity{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double UnitPrice=sc.nextDouble();
        int UnitQuantity=sc.nextInt();
        double TotalPrice=UnitPrice*UnitQuantity;
        System.out.println(TotalPrice);
        System.out.println(UnitQuantity);
    }
}