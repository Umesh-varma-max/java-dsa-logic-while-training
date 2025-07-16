public class counevendigits {
    public static void main(String[] args) {
        int [] n={12,345,2,6,7896};
        int c=0;
        for(int i:n){
            int l=0;
            while(i>0){
                 
                i=i/10;
                l++;

            }
            if(l%2==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}
