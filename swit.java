import java.util.*;
public class swit{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("namaste");
        // }
        // else if (button == 3){
        //     System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("no");
        // }
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("bounjour");
            break;
            default:System.out.println("invalid button");
            break;
        }
    }
 }