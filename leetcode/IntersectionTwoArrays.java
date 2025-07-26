package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            n1.add(i);
        }
        for (int i : nums2) {
            if (n1.contains(i)) {
                res.add(i);
            }
        }
        int[] output = new int[res.size()];
        int idx = 0;
        for (int val : res) {
            output[idx++] = val;
        }
        return output;
    }

    // Example usage
    public static void main(String[] args) {
        IntersectionTwoArrays obj = new IntersectionTwoArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = obj.intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}