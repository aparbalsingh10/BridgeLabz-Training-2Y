// import java.util.*;
// class equal{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         if(a == b ){
//             System.out.println("THis is equal");
//         }
        
//            else if(a>b){
//                 System.out.println("This is greater");
//             }
//             else{
//             System.out.println("this is lesser");
//         }
//     }
//     }

import java.util.*;
public class equal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("greater");
        }
        else if(a<b){
            System.out.println("lesses");
        }
        else{
            System.out.println("incorrect");
        }
    }
}