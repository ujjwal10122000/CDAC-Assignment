import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int t;

        for(int i=0 ;i<n;i++){
             t=2*(i-1);
            if(t%3==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
 }
    
}
 