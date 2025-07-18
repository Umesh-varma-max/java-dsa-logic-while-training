import java.util.Arrays;
import java.util.Scanner;

public class columnrev {
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
     
        for (int j = 0; j < col; j++) {
            int up=0;
            int down=row-1;
            while(up<=down){
                int temp=mat[up][j];
                mat[up][j]=mat[down][j];
                mat[down][j]=temp;
                up++;
                down--;
            }
                

                }
                  System.out.println(Arrays.deepToString(mat));
            }
            
        }
        
