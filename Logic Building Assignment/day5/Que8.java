package Day5;

public class Que8 {
    public static void main(String args[]){
        int arr1[]={1,2,2,3,3,4,4,5};
        int sum=0;
        int i,j;
        for(i=0;i<arr1.length;i++){
            
                if(arr1[i] == arr1[i+1]  ){
                    sum=sum+1;
                    
                
            }

        }
        System.out.println(sum);
    }
    
}
