package leetcode;

import java.util.HashSet;

public class duplicatepresence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean hasDuplicate = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + hasDuplicate);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false;
    }
}
