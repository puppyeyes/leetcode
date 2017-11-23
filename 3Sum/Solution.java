import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<List <Integer>> result =new ArrayList();
        int [] nums={-1,0,1,2,-1,-4};
        result=Solution.threeSum(nums);
        for(List<Integer> element:result)
        {
            for(Integer sub_element:element)
            {
                System.out.print(sub_element);
            }
            System.out.println();
        }
    }
}
