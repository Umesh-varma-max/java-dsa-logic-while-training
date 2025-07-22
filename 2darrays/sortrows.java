import java.util.*;
public class sortrows {
    public static void main(String[] args)


 {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]mat=new int [row][col];
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
                
            }       
        } 
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col-1; j++) {
                for (int k = 0; k < col - 1 - j; k++){
                if (mat[i][k+1]<mat[i][k]){
                    int temp=mat[i][k+1];
                    mat[i][k+1]=mat[i][k];
                    mat[i][k]=temp;
                }
                }
                
            }

            
        }
       for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}

    



 }
}