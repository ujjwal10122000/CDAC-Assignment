import java.util.Scanner;
class Que1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbers");
        float n=sc.nextInt();
        if (n>=90 && n<=100) {
            System.out.println("your grade is S");
            
        } else if (n<90 && n>=80) {
            System.out.println("your grade is A");
            
        } 
        else if (n<80 && n>=70) {
            System.out.println("your grade is B");
            
        }
        else if (n<70 && n>=60) {
            System.out.println("your grade is C");
            
        }
        else if (n<60 && n>=50) {
            System.out.println("your grade is D");
            
        }
        else if (n<50) {
            System.out.println("your grade is F");
            
        }else{
            System.out.println("enter valid numbers");
        }
        

        
    }

}