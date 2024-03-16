package Day5;

public class pyramid {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int temp=0;
        for(int i=5;i>0;i--){
            for(int j=5;j>temp;j--){
                System.out.print("*");
            }
            temp=temp+1;
            System.out.println("");
        }
    }
}
