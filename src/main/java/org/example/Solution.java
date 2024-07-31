package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums, 0, result, temp);
        return result;
    }

    public void helper(int[] nums, int index, List<List<Integer>> result, List<Integer> temp) {
        if (index == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        helper(nums, index + 1, result, temp);
        temp.add(nums[index]);
        helper(nums, index + 1, result, temp);
        temp.remove(temp.size() - 1);
    }
}
