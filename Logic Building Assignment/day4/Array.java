import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0 ;i<n;i++){
            a[i]=i;


        }
        for(int i=0 ;i<n;i++){
            System.out.print(a[i]);


        }
        
        
    }
   
    
}
