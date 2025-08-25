import java.util.*;
class StudentFee{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double Fee=sc.nextDouble();
        double DiscountPercentage=sc.nextDouble();
        double Discount=(Fee*DiscountPercentage)/100;
        double FinalFee=Fee-Discount;
        System.out.println(Discount);
        System.out.println(FinalFee);
    }
}