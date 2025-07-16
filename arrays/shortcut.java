import java.util.*;
public class shortcut {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        Arrays.sort(n);
      

        System.out.println(Arrays.toString(n));
        int[] a={5,4,3,2,1};
        System.out.println(Arrays.equals(n,a));
        int []copy= Arrays.copyOf(a, 9);
        System.out.println(Arrays.toString(copy));
        int[] rangecopy=Arrays.copyOfRange(a, 0, 3);
        System.out.println(Arrays.toString(rangecopy));
        int[] filled=new int[7];
        Arrays.fill(filled,9);
        System.out.println(Arrays.toString(filled));
        int bi=Arrays.binarySearch(n, 1);
        System.out.println(bi);
        int[][] n1={{1,2},{3,4}};
        int[][] n2={{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(n1, n2));
        


        }
}
