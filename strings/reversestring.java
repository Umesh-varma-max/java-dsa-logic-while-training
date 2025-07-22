public class reversestring {
    public static void main(String[] args) {
        String s="India";
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);

        }
        System.out.print(r);
    }

    
}
