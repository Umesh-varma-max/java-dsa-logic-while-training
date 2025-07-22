import java.util.Arrays;
import java.util.Scanner;

public class count1sineachbinaryrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]mat=new int [row][col];
        int [] count=new int[row];

        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
                
            }
            
        }
        for(int i=0;i<row;i++){
            int c=0;
            for(int j=0;j<col;j++){
                
                System.out.print(mat[i][j]=mat[i][j]%2);
                if(mat[i][j]==1){
                    c++;
                    
                }
            

                    
                
               
            }

            System.out.println();
            count[i]=c;
            
        }
        System.out.println(Arrays.toString(count));
    }
}
