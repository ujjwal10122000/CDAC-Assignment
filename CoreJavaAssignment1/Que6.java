import java.util.Scanner;
public class Que6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in kg");
        float w=sc.nextFloat();
        System.out.println("Enter height in meter");
        float h=sc.nextFloat();
        float bmi=(w)/(h*h);
        System.out.println("your bmi is "+bmi);
        if(bmi<18.5){
            System.out.println("you are under weight");
        }
        else if(bmi<24.9 && bmi>18.5){
            System.out.println("normal weight");

        }else   {       System.out.println("you are under weight");

            

        }
    }
    
}
