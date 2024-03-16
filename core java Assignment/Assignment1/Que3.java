import java.util.Scanner;
public class Que3 {
    static int result;
     public static int addition(int a,int b){
    
        return a+b;
    }
     public static int subtraction(int a,int b){
    
        return a-b;
    }
     public static int multiplication(int a,int b){
    
        return a*b;
    }
     public static int division(int a,int b){
    
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("enter A");
        int A=sc.nextInt();
        System.out.println("enter B");
        int B=sc.nextInt();
        System.out.println("enter choices");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multipication");
        System.out.println("4 for division");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                result=addition(A,B);
                break;
            case 2:
                result=subtraction(A,B);
                break;
            case 3:
                result=multiplication(A,B);
                break;
            case 4:
                result=division(A,B);
                break;
        
            default:
                break;
        }
        System.out.println(result);     
    }
    
}
