public class vowelsconsontsc{
    public static void main(String[] args) {
        String a="raju gaaru";
        char[] arr=a.toCharArray();
        int vc=0,cc=0;
        for(char i:arr){
            if("aeiou".indexOf(i)!=-1){
                vc++;

            }
            else{
                cc++;
            }
        }
        System.out.println(vc);
        System.out.println(cc);
    }
    
}
