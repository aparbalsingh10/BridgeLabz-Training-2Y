import java.util.*;
class MaximumStudents{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double NumberofStudent=sc.nextDouble();
        double Handshake=(NumberofStudent*(NumberofStudent-1))/2;
        System.out.println(Handshake);
    }
}