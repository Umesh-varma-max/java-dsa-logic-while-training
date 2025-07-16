public class missing {
    public static void main(String[] args) {
        int [] n={4,0,2,1};
        int a=n.length;
        int allsum=(a*(a+1))/2;
        int sum=0;
        for(int i:n){
            sum+=i;

        }
        System.out.println(allsum-sum);
    }
}
