
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       
        int arr[]=new int[n];
        
        System.out.println("enter elements of array");
        int temp=0;
        for(int i=0;i<n;i++){
           ;
            arr[i]=sc.nextInt();
           
            temp+=arr[i];
        }
         System.out.println(temp);

        
    }
    
}
