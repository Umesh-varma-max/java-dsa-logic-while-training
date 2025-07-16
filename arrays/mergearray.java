
import java.util.Arrays;



public class mergearray {
    public static void main(String[] args) {
        int []n={1,2,4,5,3};
        int []m={6,7,9,8,10};
        n=Arrays.copyOf(n,n.length+m.length);
        for(int i=0;i<m.length;i++){
            n[n.length-m.length +i]=m[i];
        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        
    }
}
