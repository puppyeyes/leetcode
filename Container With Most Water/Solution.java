public class Solution {
    public static int maxArea(int[] height) {
        int result=0,tmp=0;
        int pointer_start=0;
        int pointer_end=height.length-1;
        while(pointer_start<pointer_end)
        {
            if(height[pointer_start]>height[pointer_end])
            {
                tmp=height[pointer_end]*(pointer_end-pointer_start);
                pointer_end--;
            }
            else{
                tmp=height[pointer_start]*(pointer_end-pointer_start);
                pointer_start++;
            }
            if(tmp>result)
            {
                result=tmp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] input={1,2,4,3};
        System.out.println(Solution.maxArea(input));
    }
}
