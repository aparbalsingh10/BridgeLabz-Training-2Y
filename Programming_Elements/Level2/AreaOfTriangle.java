import java.util.*;
class AreaOfTriangle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double  base=sc.nextDouble();
        double  height=sc.nextDouble();
        double area=(0.5*base*height);
        double area2=area/(2.54*2.54);
        System.out.println(area);
        System.out.println(area2);
    }
}