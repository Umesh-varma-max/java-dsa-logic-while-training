import java.util.Scanner;

public class diagnolminmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]mat=new int [row][col];
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
                
            }
      
            
        }
          int max1=0;
        int min1=Integer.MAX_VALUE;
        //standard to print
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j){
                    if(mat[i][j]>max1){
                       max1=mat[i][j];
                    }
                    
                }
                if(i+j==row-1){
                    if(mat[i][j]<min1){
                        min1=mat[i][j];

                    }
                }
            }
            
        }
        System.out.println(max1-min1);
            
    }
}
