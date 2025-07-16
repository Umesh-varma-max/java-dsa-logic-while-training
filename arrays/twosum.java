public class twosum {
    public static void main(String[] args) {
        int n[]={2,7,11,15};
        int a=n.length;
        int target=22;
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                if(n[i]+n[j]==target){
                    System.out.println(i+" "+j);
                    

                }
                break;
                
            }
        }

    }
}
