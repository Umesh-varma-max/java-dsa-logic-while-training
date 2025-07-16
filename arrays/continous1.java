public class continous1 {
    public static void main(String[] args) {
        int [] n={1,1,0,1,1,1};
        int c=0;
        int mc=0;
        for(int i:n){
            if(i==1){
                c++;

            }
            else{
                mc=Math.max(mc, c);
                c=0;
            }
        }
        mc=Math.max(mc,c);
        System.out.println(mc);

        
    }
}
