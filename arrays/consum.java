
import java.util.Arrays;

public class consum {
    public static void main(String[] args) {
        int []n={1,2,3,4};
        int prev=0;
        for(int i=0;i<n.length;i++){
            prev+=n[i];
            n[i]=prev;
        }
        System.out.println(Arrays.toString(n));
    }
}
