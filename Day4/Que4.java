public class Que4 {
    public static void main(String[] args) {
        int matrix1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][]={{9,8,7},{6,5,4},{3,2,1}};
        int result[][]=new int [3][3];
           
        int i,j;
        for(i=0;i<3;i++){
            for( j=0;j<3;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
      
    }
    
}
