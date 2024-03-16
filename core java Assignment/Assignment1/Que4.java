import java.util.Scanner;
public class Que4 {
    public static void main(String[] args) {
        
        System.out.println("enter one number from 1 to 7");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
     switch (a) {
        case 1:
        System.out.println("mon");
             break;
             case 2 :
        System.out.println("tue");
             break;
             case 3:
        System.out.println("wed");
             break;
             case 4:
        System.out.println("thus");
             break;
             case 5:
        System.out.println("fri");
             break;
             case 6:
        System.out.println("sat");
             break;
     
        default:
            break;
     }
     

    }

    
}
