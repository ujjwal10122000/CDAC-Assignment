
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
      
        int a[]=new int[n];
       
        int i;
        System.out.println("enter arrey element");
        for( i=0; i<n;  i++){
           
             
            a[i]=sc.nextInt();
            




        }
        System.out.println("---------------");
        for(i=0;i<n;i++){
        
            System.out.println(a[i]);
        }
        
        
    }

    
}
