

public class trispace {
    public static void main(String[] args) {
        int n=5;
        int s=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i== 1|| j==n-i+1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }   
             System.out.println();
        }
       
     
    }
}


