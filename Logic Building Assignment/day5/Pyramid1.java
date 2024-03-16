package Day5;

public class Pyramid1 {
    public static void main(String[] args) {
        int i;
        int temp=1;
        for(i=1;i<=5;i++){
            for(int k=1;k<=5-temp;k++){
                System.out.print(" ");
            }
            temp=temp+1;
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
       
        
        
    }
    
}
