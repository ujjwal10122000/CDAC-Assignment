import java.util.Scanner;
public class Que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter between a to z");
        char a=sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'||a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println(a + " is vowel ");

        }
        else{
            System.out.println(a + "is not a vowel ");
        }
        
    }
    
}
