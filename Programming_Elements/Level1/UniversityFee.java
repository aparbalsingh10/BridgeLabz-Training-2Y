import java.util.*;
class UnivarsityFee{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double StudentFee=125000;
        double Discount=10;
        double totalDiscount=(StudentFee*Discount)/100;
        double totalPercentage=(StudentFee-totalDiscount);
        System.out.println(StudentFee);
        System.out.println(Discount+"%");
        System.out.println(totalDiscount);
        System.out.println(totalPercentage);
    }
}