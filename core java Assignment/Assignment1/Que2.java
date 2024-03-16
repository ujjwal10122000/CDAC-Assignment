import java.util.Scanner;
public class Que2 {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
        int z;
        
        int y=sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                   z=1;

                }
                else{
                    z=2;
                }

            }
            else{
                z=1;
            }

        }
        else{
            z=2;
        }
        switch (z) {
            case 1:
                System.out.println("leap year");
                break;
            case 2:
            System.out.println("Not a leap year");
            break;
        
            default:
                break;
        }

        
    }
}
