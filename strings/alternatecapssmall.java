public class alternatecapssmall {
    public static void main(String[] args) {
        String s="Hello world";
        char []ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                ch[i]=Character.toUpperCase(ch[i]);
              
            }
            else{
              ch[i] =Character.toLowerCase(ch[i]);
                

            }

        }
        System.out.print(new String(ch));
    }

}
