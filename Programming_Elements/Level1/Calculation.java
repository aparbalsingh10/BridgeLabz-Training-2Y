import java.util.*;
class Calculation{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double CostPrice=129;
        double SellPrice=191;
        double Profit=(SellPrice-CostPrice);
        double ProfitPercentage=(Profit/CostPrice)*100;
        System.out.println(ProfitPercentage);
    }
}