import java.util.Scanner;

public class diagnoldiff {
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
          int sum=0;
        int sum2=0;
        //standard to print
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j){
                    sum+=mat[i][j];
                }
                if(i+j==row-1){
                    sum2+=mat[i][j];
                }
            }
            
        }
        System.out.println(sum-sum2);
            
    }
}
