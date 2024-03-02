import java.util.Scanner;
public class Que161 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int temp=0;
        int i;
        for(i=1;i<=n-1;i++){
            if(n%i==0){
             temp=temp+1;
            }
        }
        if(temp==1){
            System.out.println(" prime number");
        }else{
            System.out.println("not prime ");
        }
    }
    
}
