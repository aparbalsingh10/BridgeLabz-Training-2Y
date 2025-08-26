import java.util.*;
class UnitINR{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double  unitprice=sc.nextDouble();
        double  quantity=sc.nextDouble();
        double  TotalPrice=unitprice*quantity;
        System.out.println(unitprice);
        System.out.println(quantity);
        System.out.println(TotalPrice);
    }
}