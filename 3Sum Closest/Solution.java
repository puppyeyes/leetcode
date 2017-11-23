import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum=nums[0]+nums[nums.length-1]+nums[1]-target;
        int res=nums[0]+nums[nums.length-1]+nums[1];
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            int source=nums[i];
            int head=i+1,tail=nums.length-1;
            while(head<tail)
            {
                if(Math.abs(nums[head]+nums[tail]+source-target)<Math.abs(closest_sum))
                {
                    closest_sum=nums[head]+nums[tail]+source-target;
                    res=nums[head]+nums[tail]+source;
                    if(nums[head]+nums[tail]+source>target)
                    {
                        tail--;
                        while(head<tail&&nums[tail]==nums[tail+1]) {tail--;}
                    }
                    else if(nums[head]+nums[tail]+source<target)
                    {
                        head++;
                        while(head<tail&&nums[head]==nums[head-1]) {head++;}
                    }
                    else if(nums[head]+nums[tail]+source==target)
                    {
                        break;
                    }
                }else if(nums[head]+nums[tail]+source<target) {
                    head++;
                }else{
                    tail--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums={1,2,4,8,16,32,64,128};
        System.out.println(Solution.threeSumClosest(nums,82));
    }
}
