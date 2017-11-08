public class Solution {
    public static int reverse(int x) {
        int result=0;
        int tail=0;
        if(x!=0)
        {
            while(true)
            {
                if(x%10==0)
                {
                    x=x/10;
                }
                else{
                    break;
                }
            }
        }

        while(x!=0)
        {
            tail=x%10;
            result=result*10+tail;
            x=x/10;
        }
        if(result%10!=tail)
        {
            return 0;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(Solution.reverse(1534236469));
    }
}
