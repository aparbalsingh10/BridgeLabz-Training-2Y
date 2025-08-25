import java.util.*;
class PenDistribute{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int totalpen=14;
        int totalstudents=3;
        int PenPerStudents=(totalpen/totalstudents);
        int PenPerPercent=(totalpen%totalstudents);
        System.out.println(PenPerPercent);
    }
}