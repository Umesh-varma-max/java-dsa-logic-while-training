import java.util.Scanner;

public class bordersofalter{
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
        int sum=0;
        for(int i=0;i<row;i+=2){
            
            for(int j=0;j<col;j++){
                if((j==0||j==row-1)){
                    sum+=mat[i][j];
                }
                
            
                    
                }
            

                    
                
               
            }
            System.out.println(sum);

        }
        
    }

