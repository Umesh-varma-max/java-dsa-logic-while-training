public class countletters {
    public static void main(String[] args) {
        String S="apple";
        char[] a=S.toCharArray();
        for(int i=0;i<S.length();i++){
            int c=0;
            for (int j = i; j <a.length; j++) {
                if (a[j]==a[i]){
                    c+=1;

                }

                
            }
                            System.out.println(a[i]+":"+c);


        }
        
    }
}
